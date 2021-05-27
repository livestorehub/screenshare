package io.agora.rtc.ss.impl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import io.agora.rtc.Constants;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.MyApplication;
import io.agora.rtc.RtcEngine;
import io.agora.rtc.models.ChannelMediaOptions;
import io.agora.rtc.screenshare.model.ResponseCommon;
import io.agora.rtc.screenshare.utils.LoggerClass;
import io.agora.rtc.screenshare.utils.SharedPref;
import io.agora.rtc.ss.Constant;
import io.agora.rtc.ss.HeadsUpNotificationActionReceiver;
import io.agora.rtc.ss.R;
import io.agora.rtc.ss.aidl.INotification;
import io.agora.rtc.ss.aidl.IScreenSharing;
import io.agora.rtc.ss.gles.GLRender;
import io.agora.rtc.ss.gles.ImgTexFrame;
import io.agora.rtc.ss.gles.SinkConnector;
import io.agora.rtc.video.AgoraVideoFrame;
import io.agora.rtc.video.VideoEncoderConfiguration;
import retrofit2.Call;

import static io.agora.rtc.screenshare.Constants.ssCallBack;


public class ScreenSharingService extends Service {


    private static final String LOG_TAG = ScreenSharingService.class.getSimpleName();

    public static ScreenCapture mScreenCapture;
    public static GLRender mScreenGLRender;
    public static RtcEngine mRtcEngine;
    private Context mContext;
    private ScreenCaptureSource mSCS;
    Intent intent = null;

    private RemoteCallbackList<INotification> mCallbacks
            = new RemoteCallbackList<INotification>();

    private final IScreenSharing.Stub mBinder = new IScreenSharing.Stub() {
        public void registerCallback(INotification cb) {
            if (cb != null) mCallbacks.register(cb);
        }

        public void unregisterCallback(INotification cb) {
            if (cb != null) mCallbacks.unregister(cb);
        }

        public void startShare() {
            startCapture();
        }

        public void stopShare() {
            stopCapture();
        }

        public void renewToken(String token) {
            refreshToken(token);
        }
    };

    private void initModules() {
        WindowManager wm = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(metrics);

        if (mScreenGLRender == null) {
            Log.d(LOG_TAG, "inside mScreenGLRender");
            mScreenGLRender = new GLRender();
        }
        if (mScreenCapture == null) {
            Log.d(LOG_TAG, "inside mScreenCapture");
            mScreenCapture = new ScreenCapture(mContext, mScreenGLRender, metrics.densityDpi);
        }

        mScreenCapture.mImgTexSrcConnector.connect(new SinkConnector<ImgTexFrame>() {
            @Override
            public void onFormatChanged(Object obj) {
                Log.d(LOG_TAG, "onFormatChanged " + obj.toString());
            }

            @Override
            public void onFrameAvailable(ImgTexFrame frame) {
                Log.d(LOG_TAG, "onFrameAvailable " + frame.toString() + " " + frame.pts);

                if (mRtcEngine == null) {
                    return;
                }

                mSCS.getConsumer().consumeTextureFrame(frame.mTextureId, AgoraVideoFrame.FORMAT_TEXTURE_OES, frame.mFormat.mWidth,
                        frame.mFormat.mHeight, 0, frame.pts, frame.mTexMatrix);
                //Log.i(LOG_TAG, String.format("On consumeTextureFrame, width: %d, height: %d", frame.mFormat.mWidth, frame.mFormat.mHeight));
            }
        });

        mScreenCapture.setOnScreenCaptureListener(new ScreenCapture.OnScreenCaptureListener() {
            @Override
            public void onStarted() {
                Log.d(LOG_TAG, "Screen Record Started");
//                Log.d("dfdsfsdf", ssCallBack.toString());
               // ssCallBack.callBack(true);
                Constant.ss_status = "session_start_by_customer";
                addNotification();
            }

            @Override
            public void onError(int err) {
                Log.d(LOG_TAG, "onError " + err);
                switch (err) {
                    case ScreenCapture.SCREEN_ERROR_SYSTEM_UNSUPPORTED:
                        //ssCallBack.callBack(false);
                        break;
                    case ScreenCapture.SCREEN_ERROR_PERMISSION_DENIED:
                       // assert ssCallBack != null;
                        //ssCallBack.callBack(false);
                        break;  //end call
                }
            }
        });

        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        int screenWidth = outMetrics.widthPixels;
        int screenHeight = outMetrics.heightPixels;

        initOffscreenPreview(screenWidth, screenHeight);
    }


    private void deInitModules() {
        mRtcEngine.leaveChannel();
        RtcEngine.destroy();
        mRtcEngine = null;

        if (mScreenCapture != null) {
            mScreenCapture.release();
            mScreenCapture = null;
        }

        if (mScreenGLRender != null) {
            mScreenGLRender.quit();
            mScreenGLRender = null;
        }
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        WindowManager wm = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        int screenWidth = outMetrics.widthPixels;
        int screenHeight = outMetrics.heightPixels;

        Log.d(LOG_TAG, "onConfigurationChanged " + newConfig.orientation + " " + screenWidth + " " + screenHeight);
        updateOffscreenPreview(screenWidth, screenHeight);
    }

    /**
     * Init offscreen preview.
     *
     * @param width  offscreen width
     * @param height offscreen height
     * @throws IllegalArgumentException
     */
    public void initOffscreenPreview(int width, int height) throws IllegalArgumentException {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid offscreen resolution");
        }

        mScreenGLRender.init(width, height);
    }

    /**
     * Update offscreen preview.
     *
     * @param width  offscreen width
     * @param height offscreen height
     * @throws IllegalArgumentException
     */
    public void updateOffscreenPreview(int width, int height) throws IllegalArgumentException {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid offscreen resolution");
        }

        mScreenGLRender.update(width, height);
    }

    private void startCapture() {
        mScreenCapture.start();
        startForeground(55431, getForeNotification());
    }

    private void addNotification() {
        String name = "shas_customer";
        String CHANNEL_ID = "my_channel_01";

        Intent cancelCallAction = new Intent(this, HeadsUpNotificationActionReceiver.class);
        cancelCallAction.putExtra(
                "CALL_RESPONSE_ACTION_KEY",
                "CALL_CANCEL_ACTION");
        cancelCallAction.putExtra("roomId", intent.getStringExtra(Constant.ROOM_ID));
        cancelCallAction.setAction("CANCEL_CALL");
        PendingIntent cancelCallPendingIntent = PendingIntent.getBroadcast(
                this,
                1201,
                cancelCallAction,
                PendingIntent.FLAG_CANCEL_CURRENT);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentTitle("Screen Share Stated")
                .setContentText("To stop Screen Share click End Screen Share")
                .setSmallIcon(R.drawable.ic_share)
                .setSound(Settings.System.DEFAULT_NOTIFICATION_URI)
                .setOngoing(true)
                .setPriority(NotificationManager.IMPORTANCE_HIGH)
                .addAction(R.drawable.ic_close, "Stop Screen Share", cancelCallPendingIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, importance);
            mChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, new AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_NOTIFICATION).build());
            mChannel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
            builder.setChannelId(CHANNEL_ID);
            manager.createNotificationChannel(mChannel);
        }
        Notification mNotification = builder.build();
        //mNotification.flags |= Notification.FLAG_INSISTENT;

        manager.notify(0, mNotification);

    }


    private Notification getForeNotification() {
        Notification notification;
        String eventTitle = getResources().getString(R.string.app_name);
        String channel_id = NotificationHelper.generateChannelId(getApplication(), 55431);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channel_id)
                .setContentTitle("Screen Share Stated")
                .setContentText("To stop Screen Share click End Screen Share");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            builder.setColor(getResources().getColor(android.R.color.black));

        notification = builder.build();
        notification.flags |= Notification.FLAG_ONGOING_EVENT;

        return notification;
    }

    private void stopCapture() {
        stopForeground(true);
        NotificationManager manager2 =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager2.cancel(0);
        mScreenCapture.stop();
    }

    private void refreshToken(String token) {
        if (mRtcEngine != null) {
            mRtcEngine.renewToken(token);
        } else {
            Log.e(LOG_TAG, "rtc engine is null");
        }
    }

    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        initModules();

/*
        LocalBroadcastManager.getInstance(mContext).registerReceiver(mMessageReceiver,
                new IntentFilter("end_call")
        );*/
    }

   /* BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {

            String tokenType = intent.getStringExtra("tokenType");

            if (tokenType.equals("endCall")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Session Closed")
                        .setCancelable(false)
                        .setPositiveButton("Ok" , new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                deInitModules();
                            }
                        });
            }
        }
    };*/


    @Override
    public IBinder onBind(Intent intent) {
        this.intent = intent;
        setUpEngine(intent);
        setUpVideoConfig(intent);
        joinChannel(intent);


        return mBinder;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("dafkhdajhfadf", "inside");
        deInitModules();
    }

    private void joinChannel(Intent intent) {

        ChannelMediaOptions option = new ChannelMediaOptions();
        option.autoSubscribeAudio = true;
        option.autoSubscribeVideo = true;


      /*  mRtcEngine.joinChannelWithUserAccount(
                intent.getStringExtra(Constant.RTC_TOKRN),
                intent.getStringExtra(Constant.CHANNEL_NAME),
                intent.getStringExtra(Constant.USERACCOUNT)
        );*/

        mRtcEngine.joinChannel(intent.getStringExtra(Constant.ACCESS_TOKEN), intent.getStringExtra(Constant.CHANNEL_NAME),
                "ss_" + Process.myPid(), intent.getIntExtra(Constant.UID, 0), option);

    }

    private void setUpEngine(Intent intent) {
        String appId = intent.getStringExtra(Constant.APP_ID);
        try {
            mRtcEngine = RtcEngine.create(getApplicationContext(), appId, new IRtcEngineEventHandler() {
                @Override
                public void onJoinChannelSuccess(String channel, int uid, int elapsed) {
                    Log.d(LOG_TAG, "onJoinChannelSuccess " + channel + " " + elapsed);
                }

                @Override
                public void onWarning(int warn) {
                    Log.d(LOG_TAG, "onWarning " + warn);
                }

                @Override
                public void onError(int err) {
                    Log.d(LOG_TAG, "onError " + err);
                }

                @Override
                public void onRequestToken() {
                    final int N = mCallbacks.beginBroadcast();
                    for (int i = 0; i < N; i++) {
                        try {
                            mCallbacks.getBroadcastItem(i).onError(Constants.ERR_INVALID_TOKEN);
                        } catch (RemoteException e) {
                            // The RemoteCallbackList will take care of removing
                            // the dead object for us.
                        }
                    }
                    mCallbacks.finishBroadcast();
                }

                @Override
                public void onTokenPrivilegeWillExpire(String token) {
                    final int N = mCallbacks.beginBroadcast();
                    for (int i = 0; i < N; i++) {
                        try {
                            mCallbacks.getBroadcastItem(i).onTokenWillExpire();
                        } catch (RemoteException e) {
                            // The RemoteCallbackList will take care of removing
                            // the dead object for us.
                        }
                    }
                    mCallbacks.finishBroadcast();
                }

                @Override
                public void onConnectionStateChanged(int state, int reason) {
                    switch (state) {
                        case Constants.CONNECTION_STATE_FAILED :
                            final int N = mCallbacks.beginBroadcast();
                            for (int i = 0; i < N; i++) {
                                try {
                                    mCallbacks.getBroadcastItem(i).onError(Constants.CONNECTION_STATE_FAILED);
                                } catch (RemoteException e) {
                                    // The RemoteCallbackList will take care of removing
                                    // the dead object for us.
                                }
                            }
                            mCallbacks.finishBroadcast();
                            break;
                        default :
                            break;
                    }
                }
            });
        } catch (Exception e) {
            Log.e(LOG_TAG, Log.getStackTraceString(e));

            throw new RuntimeException("NEED TO check rtc sdk init fatal error\n" + Log.getStackTraceString(e));
        }

        mRtcEngine.setLogFile("/sdcard/ss_svr.log");
        mRtcEngine.setChannelProfile(Constants.CHANNEL_PROFILE_LIVE_BROADCASTING);
        mRtcEngine.enableVideo();

        if (mRtcEngine.isTextureEncodeSupported()) {
            Log.d("dafkhdajhfadf", "inside mcss");
            mSCS = new ScreenCaptureSource();
            mRtcEngine.setVideoSource(mSCS);
        } else {
            throw new RuntimeException("Can not work on device do not supporting texture" + mRtcEngine.isTextureEncodeSupported());
        }

        mRtcEngine.setClientRole(Constants.CLIENT_ROLE_BROADCASTER);

        mRtcEngine.muteAllRemoteAudioStreams(true);
        mRtcEngine.muteAllRemoteVideoStreams(true);
        mRtcEngine.disableAudio();

      //  ENGINE.muteAllRemoteVideoStreams(true);
    }

    private void setUpVideoConfig(Intent intent) {
        int width = intent.getIntExtra(Constant.WIDTH, 0);
        int height = intent.getIntExtra(Constant.HEIGHT, 0);
        int frameRate = intent.getIntExtra(Constant.FRAME_RATE, 15);
        int bitRate = intent.getIntExtra(Constant.BITRATE, 0);
        int orientationMode = intent.getIntExtra(Constant.ORIENTATION_MODE, 0);
        VideoEncoderConfiguration.FRAME_RATE fr;
        VideoEncoderConfiguration.ORIENTATION_MODE om;

        switch (frameRate) {
            case 1 :
                fr = VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_1;
                break;
            case 7 :
                fr = VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_7;
                break;
            case 10 :
                fr = VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_10;
                break;
            case 24 :
                fr = VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_24;
                break;
            case 30 :
                fr = VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_30;
                break;
            default :
                fr = VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_15;
                break;
        }

        switch (orientationMode) {
            case 1 :
                om = VideoEncoderConfiguration.ORIENTATION_MODE.ORIENTATION_MODE_FIXED_LANDSCAPE;
                break;
            case 2 :
                om = VideoEncoderConfiguration.ORIENTATION_MODE.ORIENTATION_MODE_FIXED_PORTRAIT;
                break;
            default :
                om = VideoEncoderConfiguration.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
                break;
        }

        mRtcEngine.setVideoEncoderConfiguration(new VideoEncoderConfiguration(
                new VideoEncoderConfiguration.VideoDimensions(width, height), fr, bitRate, om));
    }
}

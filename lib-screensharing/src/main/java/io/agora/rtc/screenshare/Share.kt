package io.agora.rtc.screenshare

import android.content.Context
import android.content.DialogInterface
import android.os.Handler
import android.os.Looper
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowManager
import androidx.appcompat.app.AlertDialog
import com.yanzhenjie.permission.AndPermission
import com.yanzhenjie.permission.runtime.Permission
import io.agora.rtc.IRtcEngineEventHandler
import io.agora.rtc.MyApplication
import io.agora.rtc.RtcEngine
import io.agora.rtc.screenshare.Constants.Companion.activity
import io.agora.rtc.screenshare.Constants.Companion.ssCallBack
import io.agora.rtc.screenshare.model.CommonData
import io.agora.rtc.screenshare.model.ResponseCommon
import io.agora.rtc.screenshare.utils.CustomToast
import io.agora.rtc.screenshare.utils.LoggerClass
import io.agora.rtc.screenshare.utils.SharedPref
import io.agora.rtc.screenshare.utils.retrofit.RetrofitCallInterface
import io.agora.rtc.screenshare.utils.retrofit.RetrofitClass
import io.agora.rtc.ss.ScreenSharingClient
import io.agora.rtc.video.VideoEncoderConfiguration
import retrofit2.Call
import retrofit2.Response

class Share {
    var TAG = "Screenshare"
    private var handler: Handler? = null

    companion object {
        var mSSClient: ScreenSharingClient? = null
    }
    var accessToken = ""
    var data: CommonData? = null
    private val mListener: ScreenSharingClient.IStateListener = object :
        ScreenSharingClient.IStateListener {
        override fun onError(error: Int) {
            Log.e(
                TAG,
                "Screen share service error happened: $error"
            )
        }

        override fun onTokenWillExpire() {
            Log.d(
                TAG,
                "Screen share service token will expire"
            )
            mSSClient!!.renewToken(null) // Replace the token with your valid token
        }
    }


    var context : Context? = null
    constructor(context: Context, data: CommonData?) {
        this.context = context
        this.data = data
        handler = Handler(Looper.getMainLooper())
        startShare()
    }

    fun startShare() {
       /* ENGINE = RtcEngine.create(
            context!!,
            data!!.agoraConfig!!.appId,
            iRtcEngineEventHandler
        )*/

        // Initialize Screen Share Client
        mSSClient = ScreenSharingClient.getInstance()
        mSSClient!!.setListener(mListener)


        // Check permission
        if (AndPermission.hasPermissions(
                Constants.activity!!,
                Permission.Group.STORAGE,
                Permission.Group.MICROPHONE,
                Permission.Group.CAMERA
            )
        ) {
            joinChannel(data!!.room!!.channel_name!!)
            return
        }
        // Request permission
        AndPermission.with(Constants.activity!!).runtime().permission(
            Permission.Group.STORAGE,
            Permission.Group.MICROPHONE,
            Permission.Group.CAMERA
        ).onGranted { _: List<String?>? ->
            // Permissions Granted
            joinChannel(data!!.room!!.channel_name!!)
        }.start()
    }

   /* fun stopShare() {
        if (Constant.ss_status == "session_start_by_customer") {
            SharedPref.saveBoolean(Constants.stop, true)
            endCall(data!!.room!!.id)
            val manager =
                context!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.cancel(0)
            val manager1 =
                context!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager1.cancel(1)
            if (mSSClient!=null)
                mSSClient!!.stop(Constants.sscontext)
            Constants.ssCallBack!!.callBack(false)
            RtcEngine.destroy()
        }
        else {
            val manager1 =
                context!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager1.cancel(1)
            if (mSSClient!=null)
                mSSClient!!.stop(Constants.sscontext)
            Constants.ssCallBack!!.callBack(false)
            RtcEngine.destroy()
        }
    }*/

    private fun joinChannel(channelId: String) {
        ssCallBack!!.callBack(true)
        mSSClient!!.start(
            context,
            data!!.agoraConfig!!.appId,
            data!!.customerToken!!.screenshare_rtc_token,
            data!!.room!!.channel_name,
            data!!.customerToken!!.user_uid!!,
            VideoEncoderConfiguration(
                getScreenDimensions(),
                VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_15,
                VideoEncoderConfiguration.STANDARD_BITRATE,
                VideoEncoderConfiguration.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE
            ),
            data!!.customerToken!!.stream_user_name,
            data!!.room!!.id,
            data!!.customerToken!!.rtc_token
        )

       /* ENGINE!!.setChannelProfile(io.agora.rtc.Constants.CHANNEL_PROFILE_LIVE_BROADCASTING)
        ENGINE!!.setClientRole(io.agora.rtc.Constants.CLIENT_ROLE_BROADCASTER)
        ENGINE!!.enableVideo()
        ENGINE!!.setDefaultAudioRoutetoSpeakerphone(false)
        ENGINE!!.setEnableSpeakerphone(false)

        accessToken = data!!.customerToken!!.rtc_token!!

        if (TextUtils.equals(accessToken, "") || TextUtils.equals(
                accessToken,
                "<#YOUR ACCESS TOKEN#>"
            )
        ) {
            accessToken = null.toString()
        }
        val option = ChannelMediaOptions()
        option.autoSubscribeAudio = true
        option.autoSubscribeVideo = true

       val res =  ENGINE!!.joinChannelWithUserAccount(
            accessToken,
            channelId,
            data!!.customerToken!!.stream_user_name
        )

        if (res != 0) {
            Log.d("dkkjdskjfskd", RtcEngine.getErrorDescription(kotlin.math.abs(res)))

            showAlert(RtcEngine.getErrorDescription(kotlin.math.abs(res)))
            return
        }*/

    }

    private val iRtcEngineEventHandler: IRtcEngineEventHandler = object : IRtcEngineEventHandler() {
        override fun onWarning(warn: Int) {
            Log.w(
                TAG,
                String.format(
                    "onWarning code %d message %s",
                    warn,
                    RtcEngine.getErrorDescription(warn)
                )
            )
        }

        override fun onError(err: Int) {
            Log.e(
                TAG,
                String.format("onError code %d message %s", err, RtcEngine.getErrorDescription(err))
            )
            showAlert(
                String.format(
                    "onError code %d message %s",
                    err,
                    RtcEngine.getErrorDescription(err)
                )
            )
        }

        override fun onLeaveChannel(stats: RtcStats) {
            super.onLeaveChannel(stats)
        }

        override fun onJoinChannelSuccess(channel: String, uid: Int, elapsed: Int) {
            Log.i(
                TAG,
                String.format("onJoinChannelSuccess channel %s uid %d", channel, uid)
            )
            //showLongToast(String.format("onJoinChannelSuccess channel %s uid %d", channel, uid))
           /* handler!!.post {
                Log.d("dfdsfsdfsdf", Build.VERSION.SDK_INT.toString())
                //progressDialog!!.dismiss()
              //  bindVideoService()
               // ENGINE!!.disableVideo()
                mSSClient!!.start(
                    context,
                    data!!.agoraConfig!!.appId,
                    data!!.customerToken!!.screenshare_rtc_token,
                    data!!.room!!.channel_name,
                    data!!.customerToken!!.user_uid!!,
                    VideoEncoderConfiguration(
                        getScreenDimensions(),
                        VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_15,
                        VideoEncoderConfiguration.STANDARD_BITRATE,
                        VideoEncoderConfiguration.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE
                    ),
                    data!!.customerToken!!.stream_user_name,
                    data!!.room!!.id
                )
            }*/
        }

        override fun onRemoteAudioStateChanged(uid: Int, state: Int, reason: Int, elapsed: Int) {
            super.onRemoteAudioStateChanged(uid, state, reason, elapsed)
            Log.i(
                TAG,
                "onRemoteAudioStateChanged->$uid, state->$state, reason->$reason"
            )
        }

        override fun onRemoteVideoStateChanged(uid: Int, state: Int, reason: Int, elapsed: Int) {
            super.onRemoteVideoStateChanged(uid, state, reason, elapsed)
            Log.i(
                TAG,
                "onRemoteVideoStateChanged->$uid, state->$state, reason->$reason"
            )
        }

        override fun onUserJoined(uid: Int, elapsed: Int) {
            super.onUserJoined(uid, elapsed)
            Log.i(
                TAG,
                "onUserJoined->$uid"
            )
            //showLongToast(String.format("user %d joined!", uid))
        }

        override fun onUserOffline(uid: Int, reason: Int) {
            Log.i(
                TAG,
                String.format("user %d offline! reason:%d", uid, reason)
            )
            //showLongToast(String.format("user %d offline! reason:%d", uid, reason))
        }
    }

    private fun getScreenDimensions(): VideoEncoderConfiguration.VideoDimensions {
        val manager = context!!.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val outMetrics = DisplayMetrics()
        manager.defaultDisplay.getMetrics(outMetrics)
        return VideoEncoderConfiguration.VideoDimensions(
            outMetrics.widthPixels / 2,
            outMetrics.heightPixels / 2
        )
    }

    fun showAlert(message: String?) {
        AlertDialog.Builder(activity!!).setTitle("Tips").setMessage(message)
            .setPositiveButton(
                "OK"
            ) { dialog: DialogInterface, _: Int -> dialog.dismiss() }
            .show()
    }

    private fun endCall(room_id : String?) {
        val call3: Call<ResponseCommon?> = MyApplication.apiInterface!!.endCall(
            SharedPref.getString(Constants.TOKEN)!!, room_id
        )

        RetrofitClass().retroCall(call3, object : RetrofitCallInterface {
            override fun onSuccess(response: Response<ResponseCommon?>?) {

                if (response?.body()?.status?.code.equals("200")) {
                    LoggerClass.d("dfdkfhd", response!!.body()!!.data?.toString())
                    CustomToast(activity).toast(response?.body()?.data?.msg, 1)
                    //  SharedPref.saveBoolean(Constants.stop, false)
                } else {
                    CustomToast(activity).toast(response?.body()?.data?.errorMsg, 0)
                }
            }

            override fun onFailure(response: Response<*>?) {

            }

            override fun onError(error: String?) {

            }
        }, activity!!)

    }




}
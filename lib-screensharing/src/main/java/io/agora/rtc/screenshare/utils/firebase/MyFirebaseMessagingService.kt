package io.agora.rtc.screenshare.utils.firebase

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.AudioAttributes
import android.os.Build
import android.provider.Settings
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import io.agora.rtc.RtcEngine
import io.agora.rtc.screenshare.Constants
import io.agora.rtc.screenshare.Share
import io.agora.rtc.screenshare.utils.LoggerClass
import io.agora.rtc.screenshare.utils.SharedPref
import io.agora.rtc.ss.Constant.ss_status
import io.agora.rtc.ss.HeadsUpNotificationActionReceiver
import io.agora.rtc.ss.R


@SuppressLint("MissingFirebaseInstanceTokenRefresh")
class MyFirebaseMessagingService : FirebaseMessagingService() {

    private val tag = "FirebaseMessagingService"
    val CHANNEL_ID = "my_channel_01" // The id of the channel.


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        try {
            LoggerClass.d("agshdasd", remoteMessage.priority.toString())
            LoggerClass.d("agshdasd", remoteMessage.data.toString())
            LoggerClass.d("agshdasd", remoteMessage.data["tokenType"].toString())
            LoggerClass.d("agshdasd", remoteMessage.data["roomId"].toString())
            LoggerClass.d("agshdasd", remoteMessage.notification.toString())
            LoggerClass.d("dsjfhjdf", SharedPref.contains(Constants.stop).toString())
            if (remoteMessage.data["tokenType"] == "endCall") {
                ss_status = "session_end_by_agent"
                LoggerClass.e("dfffffff", SharedPref.contains(Constants.stop).toString())
                if (SharedPref.contains(Constants.stop)) {
                    LoggerClass.e("dfffffff", SharedPref.getBoolean(Constants.stop).toString())
                    if (!SharedPref.getBoolean(Constants.stop)) {
                        stop(remoteMessage)
                    }
                }
                else
                    stop(remoteMessage)

            }

        } catch (e: Exception) {
            println("$tag error -->${e.message}")
        }
    }

    fun stop(remoteMessage: RemoteMessage) {
        LoggerClass.d("dsjfhjdf", "inside")
        if (remoteMessage.data["tokenType"] == "endCall") {
            Constants.activity!!.runOnUiThread(Runnable {
                addNotification(remoteMessage)
                val manager1 =
                    Constants.sscontext!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager1.cancel(1)
                if (Share.mSSClient !=null)
                    Share.mSSClient!!.stop(Constants.sscontext)
                Constants.ssCallBack!!.callBack(false)
                RtcEngine.destroy()
            })

          /*  val manager =
                Constants.sscontext!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.cancel(0)

            addNotification(remoteMessage)*/
        }
    }


    private fun addNotification(remoteMessage: RemoteMessage) {
        val name = "shas_customer"
        val CHANNEL_ID = "my_channel_01"
        val cancelCallAction = Intent(
            this,
            HeadsUpNotificationActionReceiver::class.java
        )
        cancelCallAction.putExtra(
            "CALL_RESPONSE_ACTION_KEY",
            "CALL_CANCEL_ACTION"
        )
        cancelCallAction.putExtra("roomId", remoteMessage.data["roomId"])
        cancelCallAction.action = "STOP"
        val cancelCallPendingIntent = PendingIntent.getBroadcast(
            this,
            1201,
            cancelCallAction,
            PendingIntent.FLAG_CANCEL_CURRENT
        )
        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Session closed")
            .setContentText(remoteMessage.data["message"])
            .setSmallIcon(R.drawable.ic_share)
            .setSound(Settings.System.DEFAULT_NOTIFICATION_URI)
            .setOngoing(false)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            //.addAction(R.drawable.ic_close, "Stop Screen Share", cancelCallPendingIntent)

        // Add as notification
        val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_HIGH
            val mChannel = NotificationChannel(CHANNEL_ID, name, importance)
            mChannel.setSound(
                Settings.System.DEFAULT_NOTIFICATION_URI, AudioAttributes.Builder().setUsage(
                    AudioAttributes.USAGE_NOTIFICATION
                ).build()
            )
            mChannel.lockscreenVisibility = Notification.VISIBILITY_PUBLIC
            builder.setChannelId(CHANNEL_ID)
            manager.createNotificationChannel(mChannel)
        }
        val mNotification = builder.build()
        mNotification.flags = mNotification.flags
        manager.notify(2, mNotification)
    }


}
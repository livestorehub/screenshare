package io.agora.rtc.ss

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import io.agora.rtc.MyApplication.Companion.apiInterface
import io.agora.rtc.RtcEngine
import io.agora.rtc.screenshare.Constants
import io.agora.rtc.screenshare.Constants.Companion.activity
import io.agora.rtc.screenshare.Constants.Companion.sscontext
import io.agora.rtc.screenshare.Share.Companion.mSSClient
import io.agora.rtc.screenshare.model.ResponseCommon
import io.agora.rtc.screenshare.utils.CustomToast
import io.agora.rtc.screenshare.utils.LoggerClass
import io.agora.rtc.screenshare.utils.SharedPref
import io.agora.rtc.screenshare.utils.retrofit.RetrofitCallInterface
import io.agora.rtc.screenshare.utils.retrofit.RetrofitClass
import retrofit2.Call
import retrofit2.Response


class HeadsUpNotificationActionReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null && intent.extras != null) {

            Log.d("sdlkjskd", intent.action.toString())

            if (intent.action == "CANCEL_CALL") {
                SharedPref.saveBoolean(Constants.stop, true)
                endCall(intent.getStringExtra("roomId"))
                val manager =
                    context!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager.cancel(0)
                val manager1 =
                    context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager1.cancel(1)
                if (mSSClient!=null)
                    mSSClient!!.stop(sscontext)
                Constants.ssCallBack!!.callBack(false)
                RtcEngine.destroy()
            }
            if (intent.action == "STOP") {
                val manager1 =
                    context!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager1.cancel(1)
                if (mSSClient!=null)
                    mSSClient!!.stop(sscontext)
                Constants.ssCallBack!!.callBack(false)
                RtcEngine.destroy()
            }
        }
    }

    private fun endCall(room_id : String?) {
        val call3: Call<ResponseCommon?> = apiInterface!!.endCall(
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
package io.agora.rtc.screenshare.utils.retrofit

import android.app.Activity
import android.content.Intent
import io.agora.rtc.screenshare.Constants.Companion.isNetworkAvailable
import io.agora.rtc.screenshare.model.ResponseCommon
import io.agora.rtc.screenshare.utils.CustomToast
import io.agora.rtc.screenshare.utils.LoggerClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitClass {
    fun retroCall(
        call: Call<ResponseCommon?>?,
        retrofitCallInterface: RetrofitCallInterface,
        activity: Activity
    ) {
        if (isNetworkAvailable(activity)) {
            call!!.enqueue(object : Callback<ResponseCommon?> {
                override fun onResponse(call: Call<ResponseCommon?>?, response: Response<ResponseCommon?>?) {

                    when {
                        response!!.code() == 200 -> {
                            retrofitCallInterface.onSuccess(response)
                        }
                        response.code() == 401 -> {
                            val intent = Intent()
                            /*SharedPref.cleardata()
                            Constants.gotoNextActivityClearAll(AuthenticationActivity::class.java, intent, activity)*/
                        }
                        else -> {
                            retrofitCallInterface.onFailure(response)
                            CustomToast(activity).toast( response.body()?.data?.errorMsg, 0)
                        }
                    }
                }
                override fun onFailure(call: Call<ResponseCommon?>?, t: Throwable?) {
                    LoggerClass.e("fnfdnf", t.toString())
                    retrofitCallInterface.onError(t!!.message)
                    call!!.cancel()
                }
            })
        } else {
            CustomToast(activity).toast( "Check your internet connection", 0)
           // Constants.gotoNextActivity(NoInternetActivity::class.java, null, activity)
        }
    }

}
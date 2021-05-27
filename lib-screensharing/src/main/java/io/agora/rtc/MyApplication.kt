package io.agora.rtc

import android.app.Application
import io.agora.rtc.screenshare.utils.SharedPref
import io.agora.rtc.screenshare.utils.retrofit.APIClient
import io.agora.rtc.screenshare.utils.retrofit.APIInterface


class MyApplication : Application() {

    companion object {
        var apiInterface: APIInterface? = null
    }

    override fun onCreate() {
        super.onCreate()
        SharedPref.initSharedPref(this)
        apiInterface = APIClient().client!!.create(APIInterface::class.java)
    }


}
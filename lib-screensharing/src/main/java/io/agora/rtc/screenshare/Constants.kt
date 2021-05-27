package io.agora.rtc.screenshare

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build

class Constants {

    companion object {
        var ENTERPRISEAPIKEY = "enterpriseApiKey"
        var ENTERPRISEKEY = "enterpriseKey"
        var ENTERPRISESECRET = "enterpriseSecret"
        var CUSTOMERID = "customerId"
        var CUSTOMERFIRSTNAME = "customerFirstName"
        var CUSTOMERLASTNAME = "customerLastName"
        var CUSTOMEREMAIL = "customerEmail"
        var CUSTOMERPHONE = "customerPhone"
        var CLASSOBJECT = "classobject"
        @JvmField
        var TOKEN = "token"
        var stop = "stop"
        var CONNECTION_DATA = "data"
        @JvmField
        //var ENGINE: RtcEngine? = null
       var sscontext : Context? = null
       var activity : Activity? = null
        @JvmField
       var ssCallBack : ShareCallBack? = null

        var BASE_URL = "https://test.dronisoft.com/lsh_screenshare/api/web/"

        fun isNetworkAvailable(context: Context): Boolean {
            val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val nw = connectivityManager.activeNetwork ?: return false
                val actNw = connectivityManager.getNetworkCapabilities(nw) ?: return false
                return when {
                    actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    //for other device how are able to connect with Ethernet
                    actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                    //for check internet over Bluetooth
                    actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH) -> true
                    else -> false
                }
            } else {
                return connectivityManager.activeNetworkInfo?.isConnected ?: false
            }
        }
    }
}
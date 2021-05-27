package io.agora.rtc.screenshare.utils

import android.os.Bundle
import android.util.Log
import io.agora.rtc.ss.BuildConfig

class LoggerClass {

    companion object {
      //  var logger = true

        fun bundle(activityname: String, bundle: Bundle) {
            try {
                if (BuildConfig.DEBUG) {
                    for (key in bundle.keySet()) {
                        Log.wtf(
                            "Bundle $activityname",
                            key + " = \"" + bundle[key] + "\""
                        )
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        fun i(activityname: String?, content: String?) {
            if (BuildConfig.DEBUG) {
                Log.wtf(activityname, content)
            }
        }

        fun d(activityname: String?, content: String?) {
            if (BuildConfig.DEBUG) {
                Log.d(activityname, content!!)
            }
        }

        fun e(activityname: String, content: String?) {
            if (BuildConfig.DEBUG) {
                Log.wtf(activityname + "Exception ", content)
            }
        }

    }

}
package com.livestorehub.shas.ss

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import io.agora.rtc.screenshare.AgentListActivity
import io.agora.rtc.screenshare.Constants
import io.agora.rtc.screenshare.Constants.Companion.activity
import io.agora.rtc.screenshare.Constants.Companion.ssCallBack
import io.agora.rtc.screenshare.Constants.Companion.sscontext
import io.agora.rtc.screenshare.ShareCallBack

class Screenshare(
    var enterpriseApiKey: String?,
    var enterpriseKey: String?,
    var enterpriseSecret: String?,
    var customerId: String?,
    var customerFirstName: String?,
    var customerLastName: String?,
    var customerEmail: String?,
    var customerPhone: String?
)  : ShareCallBack{

    var context :Context? = null
    var callBackSend : ScreenShareCallBack? = null

    private constructor(builder: Builder) : this(builder.enterpriseApiKey, builder.enterpriseKey, builder.enterpriseSecret, builder.customerId, builder.customerFirstName, builder.customerLastName, builder.customerEmail,builder.customerPhone) {
        context = builder.appContext
        sscontext = builder.appContext
        activity   = builder.context
        ssCallBack = this@Screenshare
        callBackSend = builder.callBack
        val intent = Intent(builder.context, AgentListActivity::class.java)
        intent.putExtra(Constants.ENTERPRISEAPIKEY, enterpriseApiKey)
        intent.putExtra(Constants.ENTERPRISEKEY, enterpriseKey)
        intent.putExtra(Constants.ENTERPRISESECRET, enterpriseSecret)
        intent.putExtra(Constants.CUSTOMERID, customerId)
        intent.putExtra(Constants.CUSTOMERFIRSTNAME, customerFirstName)
        intent.putExtra(Constants.CUSTOMERLASTNAME, customerLastName)
        intent.putExtra(Constants.CUSTOMEREMAIL, customerEmail)
        intent.putExtra(Constants.CUSTOMERPHONE, customerPhone)
        builder.context!!.startActivity(intent)
    }

    class Builder() {
        var enterpriseApiKey: String? = ""
        var enterpriseKey: String? = ""
        var enterpriseSecret: String? = ""
        var customerId: String? = ""
        var customerFirstName: String? = ""
        var customerLastName: String? = ""
        var customerEmail: String? = ""
        var customerPhone: String? = ""
        var context: Activity? = null
        var appContext: Context? = null
        var callBack : ScreenShareCallBack? = null

        fun withAppContext(appContext: Context) = apply { this.appContext = appContext }
        fun withContext(context: Activity) = apply { this.context = context }

        fun enterpriseApiKey(enterpriseApiKey: String) = apply { this.enterpriseApiKey = enterpriseApiKey }

        fun enterpriseKey(enterpriseKey: String) = apply { this.enterpriseKey = enterpriseKey }

        fun enterpriseSecret(enterpriseSecret: String) = apply { this.enterpriseSecret = enterpriseSecret }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun customerFirstName(customerFirstName: String) = apply { this.customerFirstName = customerFirstName }

        fun customerLastName(customerLastName: String) = apply { this.customerLastName = customerLastName }

        fun customerEmail(customerEmail: String) = apply { this.customerEmail = customerEmail }

        fun customerPhone(customerPhone: String) = apply { this.customerPhone = customerPhone }

        fun build() = Screenshare(this)

        fun callBack(callBack : ScreenShareCallBack) = apply { this.callBack = callBack }
    }


    override fun callBack(result: Boolean) {
        Log.d("dkjfhjsdhfd", result.toString())
        callBackSend!!.callBack(result)
    }


}
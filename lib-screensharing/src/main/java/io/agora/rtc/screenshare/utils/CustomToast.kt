package io.agora.rtc.screenshare.utils

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import io.agora.rtc.ss.R

class CustomToast(var activity: Activity?) {

    fun toast(message: String?, type: Int) {
        val inflater = activity!!.layoutInflater
        val layout: View = inflater.inflate(
            R.layout.custom_layout_toast,
            activity!!.findViewById<View>(R.id.toast_layout_root) as ViewGroup?
        )
        // get the reference of TextView and ImageVIew from inflated layout
        val toastTextView =
            layout.findViewById<View>(R.id.toastTextView) as TextView
        val toastImageView =
            layout.findViewById<View>(R.id.toastImageView) as ImageView
        val toast_layout_root =
            layout.findViewById<LinearLayout>(R.id.toast_layout_root)
        // set the text in the TextView
        toastTextView.text = message
        // set the Image in the ImageView
        toastImageView.setImageResource(R.drawable.ic_close1)
        if (type == 0) toast_layout_root.setBackgroundResource(R.drawable.toast_back) else toast_layout_root.setBackgroundResource(
            R.drawable.toast_back1
        )

        // create a new Toast using context
        val toast = Toast(activity)
        toast.duration = Toast.LENGTH_LONG // set the duration for the Toast
        toast.view = layout // set the inflated layout
        toast.show() // display the custom Toast
    }
}
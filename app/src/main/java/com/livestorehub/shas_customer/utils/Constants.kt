package com.livestorehub.shas_customer.utils

import android.app.Activity
import android.content.Intent
import com.livestorehub.shas_customer.R


class Constants {
    companion object {
        const val HORIZONTAL = 1
        const val VERTICAL = 2

        fun gotoNextActivity(aClass: Class<*>?, _intent: Intent?, activity: Activity) {
            val intent = Intent(activity, aClass)
            if (_intent != null) {
                intent.putExtras(_intent)
                intent.addFlags(_intent.flags)
            }
            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);userLogin
            activity.startActivity(intent)
            try {
                activity
                    .overridePendingTransition(
                        R.anim.enter_from_right,
                        R.anim.exit_to_left
                    )
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


        fun close(activity: Activity, animation: Int) {
            activity.finish()
            if (animation == HORIZONTAL) {
                activity.overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right)
            } else if (animation == VERTICAL) {
                activity.overridePendingTransition(R.anim.no_change, R.anim.slide_down)
            }
        }

    }

}
package com.livestorehub.shas_customer.utils

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.livestorehub.shas_customer.R

class FragmentTransition(private var activity: FragmentActivity?) {
    companion object {
        const val HORIZONTAL = "horizontal"
        const val NONE = "none"
    }

    private var fragmentChangeListener: FragmentChangeListener? = null

    private var fragmentManager: FragmentManager? = null
    private var whichFragment = ""

    fun replaceFragmentWithBackStack(
        fragmentName: String,
        fragment: Fragment,
        bundle: Bundle?,
        animDirection: String,
        addInBackStack: Boolean
    ) {
        whichFragment = fragmentName
        if (bundle != null) fragment.arguments = bundle
        if (fragmentManager == null) {
            fragmentManager = activity!!.supportFragmentManager
        }
        val fragmentTransaction =
            fragmentManager!!.beginTransaction()
        if (animDirection !== NONE && fragmentManager!!.backStackEntryCount > 0) {
            setAnimation(
                fragmentTransaction,
                animDirection
            )
        }
        fragmentTransaction.add(R.id.fl_fragment, fragment)
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        if (addInBackStack) {
            fragmentTransaction.addToBackStack(whichFragment)
        }
        fragmentTransaction.commit()
        fragmentManager!!.addOnBackStackChangedListener {
            val index = fragmentManager!!.backStackEntryCount - 1
            if (index >= 0) {
                whichFragment = fragmentManager!!.getBackStackEntryAt(index).name!!
                if (fragmentChangeListener != null) {
                    fragmentChangeListener!!.onFragmentChange(whichFragment)
                }
            }
        }
    }

    private fun setAnimation(
        fragmentTransaction: FragmentTransaction,
        direction: String
    ) {
        if (direction == HORIZONTAL) {
            fragmentTransaction.setCustomAnimations(
                R.anim.enter_from_right,
                R.anim.exit_to_left,
                R.anim.enter_from_left,
                R.anim.exit_to_right
            )
        } else {
            fragmentTransaction.setCustomAnimations(
                R.animator.bottom_top_animation,
                0,
                R.animator.no_change,
                R.animator.top_bottom_animation
            )
        }
    }


    fun getFragmentManager(): FragmentManager? {
        return fragmentManager
    }

    interface FragmentChangeListener {
        fun onFragmentChange(fragmentName: String?)
    }
}
package com.livestorehub.shas_customer

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.livestorehub.shas_customer.databinding.ActivityMainBinding
import com.livestorehub.shas_customer.utils.Constants
import com.livestorehub.shas_customer.utils.FragmentNames
import com.livestorehub.shas_customer.utils.FragmentTransition
import com.livestorehub.shas_customer.utils.Keys

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var binding: ActivityMainBinding
    }
    private var fragmentTransition: FragmentTransition? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR // for status bar text black
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var fragmentName = intent.getStringExtra(Keys.fragmentName)

        val bundle = intent.getBundleExtra(Keys.bundle)
        if (fragmentName == null) {
            fragmentName = FragmentNames.firstFragment
        }

        fragmentTransition = FragmentTransition(this)
        setFragment(fragmentName, bundle)
    }

    private fun setFragment(fragmentName: String?, bundle: Bundle?) {
        when (fragmentName) {
            FragmentNames.firstFragment -> {
                fragmentTransition!!.replaceFragmentWithBackStack(
                    fragmentName,
                    FirstFragment(),
                    bundle,
                    FragmentTransition.HORIZONTAL,
                    true
                )
            }

            FragmentNames.secondFragment -> {
                fragmentTransition!!.replaceFragmentWithBackStack(
                    fragmentName,
                    SecondFragment(),
                    bundle,
                    FragmentTransition.HORIZONTAL,
                    true
                )
            }
        }
    }
    fun onBack(view: View) {
        onBackPressed()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Constants.close(this, Constants.HORIZONTAL)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val fragments =
            supportFragmentManager.fragments
        for (fragment in fragments) {
            fragment.onActivityResult(requestCode, resultCode, data)
        }
    }

}
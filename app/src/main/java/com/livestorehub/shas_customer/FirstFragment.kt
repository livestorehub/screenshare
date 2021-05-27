package com.livestorehub.shas_customer

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.livestorehub.shas_customer.databinding.FragmentFirstBinding
import com.livestorehub.shas_customer.utils.Constants
import com.livestorehub.shas_customer.utils.FragmentNames
import com.livestorehub.shas_customer.utils.Keys

class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater,container,false)

        MainActivity.binding.iv.visibility = View.GONE
        MainActivity.binding.tv.visibility = View.GONE

        binding!!.btInsurance.setOnClickListener {
            nextPage("insurance")
        }

        binding!!.btFinance.setOnClickListener {
            nextPage("finance")
        }

        return binding!!.root
    }

    private fun nextPage(type: String) {
        val intent = Intent()
        val bundle = Bundle()
        bundle.putString(Keys.screen, type)
        intent.putExtra(Keys.fragmentName, FragmentNames.secondFragment)
        intent.putExtra(Keys.bundle, bundle)
        Constants.gotoNextActivity(MainActivity::class.java, intent, requireActivity())
    }


}
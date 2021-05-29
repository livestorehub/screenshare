package com.livestorehub.shas_customer

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.livestorehub.shas.ss.ScreenShareCallBack
import com.livestorehub.shas.ss.Screenshare
import com.livestorehub.shas_customer.databinding.FragmentSecondBinding
import com.livestorehub.shas_customer.utils.IOnBackPressed


class SecondFragment : Fragment() , IOnBackPressed {

    private var binding: FragmentSecondBinding? = null

    lateinit var ssBuilder :  Screenshare
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,container,false)

        MainActivity.binding.iv.visibility = View.VISIBLE
        MainActivity.binding.tv.visibility = View.VISIBLE

        binding!!.btnShare1.setOnClickListener {

            ssBuilder = Screenshare.Builder()
                .withContext(requireActivity())
                .withAppContext(requireActivity().applicationContext)
                .enterpriseApiKey(requireActivity().getString(R.string.enterpriseApiKey))
                .enterpriseKey(requireActivity().getString(R.string.enterpriseKey))
                .enterpriseSecret(requireActivity().getString(R.string.enterpriseSecret))
                .customerId("1234")
                .customerFirstName("Swapnali")
                .customerLastName("Jadhav")
                .customerEmail("jswap1992@gmail.com")
                .customerPhone("")
                .callBack(object : ScreenShareCallBack {
                    override fun callBack(result: Boolean) {
                        if (result) {
                            binding!!.btnShare1.visibility = View.GONE
                        } else {
                            binding!!.btnShare1.visibility = View.VISIBLE
                        }
                    }
                }).build()

        }


        binding!!.etType.setOnClickListener {
            val items = arrayOf<CharSequence>("Type1", "Type2", "Type3", "Type4")

            val builder = AlertDialog.Builder(requireActivity())
            builder.setTitle("Select Type")
            builder.setItems(items) { dialog, item ->
                binding!!.etType.setText(items[item])
                dialog.dismiss()
            }
            builder.show()
        }


        binding!!.btSubmit.setOnClickListener {
            showAlert("Thank you for your registration")
        }

        binding!!.btInsurance.setOnClickListener {
            binding!!.btInsurance.background = ContextCompat.getDrawable(requireContext(), R.drawable.background_red)
            binding!!.btFinance.background = ContextCompat.getDrawable(requireContext(), R.drawable.background_blue)
        }

        binding!!.btFinance.setOnClickListener {
            binding!!.btFinance.background = ContextCompat.getDrawable(requireContext(), R.drawable.background_red)
            binding!!.btInsurance.background = ContextCompat.getDrawable(requireContext(), R.drawable.background_blue)
        }

        return binding!!.root
    }

    override fun onBackPressed(): Boolean {
        return true
    }


    private fun showAlert(message: String?) {
        AlertDialog.Builder(requireActivity()).setTitle("LSH").setMessage(message)
            .setPositiveButton(
                "OK"
            ) { dialog: DialogInterface, _: Int -> dialog.dismiss() }
            .show()
    }



}
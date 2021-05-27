package com.livestorehub.shas_customer

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
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

   // lateinit var callbackManager: ShareCallbackManager

    lateinit var ssBuilder :  Screenshare
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,container,false)

     /*   callbackManager = ShareCallbackManager(requireActivity())
        callbackManager.onClick(binding!!.btnShare)
*/
        MainActivity.binding.iv.visibility = View.VISIBLE
        MainActivity.binding.tv.visibility = View.VISIBLE

        binding!!.btnShare1.setOnClickListener {

            ssBuilder = Screenshare.Builder()
                .withContext(activity!!)
                .withAppContext(activity!!.applicationContext)
                    .enterpriseApiKey(activity!!.getString(R.string.enterpriseApiKey))
                    .enterpriseKey(activity!!.getString(R.string.enterpriseKey))
                    .enterpriseSecret(activity!!.getString(R.string.enterpriseSecret))
                    .customerId("1234")
                    .customerFirstName("Swapnali")
                    .customerLastName("Jadhav")
                    .customerEmail("jswap1992@gmail.com")
                    .customerPhone("")
                .callBack(object : ScreenShareCallBack {
                    override fun callBack(result: Boolean) {
                        Log.d("dkjfhjsdhfd111", result.toString())
                        if (result) {
                            binding!!.btnShare1.visibility = View.GONE
                           // binding!!.btnStop.visibility = View.VISIBLE
                        }
                        else {
                            binding!!.btnShare1.visibility = View.VISIBLE
                            //binding!!.btnStop.visibility = View.GONE
                        }
                    }
                }).build()
        }


        binding!!.etType.setOnClickListener {
            val items = arrayOf<CharSequence>("Type1", "Type2", "Type3", "Type4")

            val builder = AlertDialog.Builder(activity!!)
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
            binding!!.btInsurance.background = ContextCompat.getDrawable(context!!, R.drawable.background_red)
            binding!!.btFinance.background = ContextCompat.getDrawable(context!!, R.drawable.background_blue)
        }

        binding!!.btFinance.setOnClickListener {
            binding!!.btFinance.background = ContextCompat.getDrawable(context!!, R.drawable.background_red)
            binding!!.btInsurance.background = ContextCompat.getDrawable(context!!, R.drawable.background_blue)
        }




        return binding!!.root
    }

    override fun onBackPressed(): Boolean {
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
       // callbackManager.onActivityResult(requestCode, resultCode, data)
    }

    private fun showAlert(message: String?) {
        AlertDialog.Builder(activity!!).setTitle("LSH").setMessage(message)
            .setPositiveButton(
                "OK"
            ) { dialog: DialogInterface, _: Int -> dialog.dismiss() }
            .show()
    }



}
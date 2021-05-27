package io.agora.rtc.screenshare

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.iid.FirebaseInstanceId
import io.agora.rtc.MyApplication
import io.agora.rtc.MyApplication.Companion.apiInterface
import io.agora.rtc.screenshare.Constants.Companion.sscontext
import io.agora.rtc.screenshare.adapter.UsersAdapter
import io.agora.rtc.screenshare.callback.OnItemClick
import io.agora.rtc.screenshare.model.CommonData
import io.agora.rtc.screenshare.model.ResponseCommon
import io.agora.rtc.screenshare.utils.CustomToast
import io.agora.rtc.screenshare.utils.LoggerClass
import io.agora.rtc.screenshare.utils.SharedPref
import io.agora.rtc.screenshare.utils.retrofit.RetrofitCallInterface
import io.agora.rtc.screenshare.utils.retrofit.RetrofitClass
import io.agora.rtc.ss.R
import io.agora.rtc.ss.databinding.ActivityAgentListBinding
import retrofit2.Call
import retrofit2.Response
import java.io.IOException
import java.util.*
import kotlin.collections.ArrayList

class AgentListActivity : AppCompatActivity(), OnItemClick {
    private lateinit var binding: ActivityAgentListBinding
    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 1000 //3 seconds
    var list : ArrayList<Any> = ArrayList()
    lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR // for status bar text black
        super.onCreate(savedInstanceState)
        binding = ActivityAgentListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.llProgress.visibility = View.VISIBLE
        SharedPref.saveBoolean(Constants.stop, false)

      //  getAuthToken()

        if (SharedPref.contains(Constants.TOKEN)) {
            if (SharedPref.getString(Constants.TOKEN) != null) {
                mDelayHandler = Handler(Looper.getMainLooper())
                mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)
            }
            else
                getAuthToken()
        }
        else {
            getAuthToken()
        }
    }


    private fun getAuthToken() {

        val call3: Call<ResponseCommon?> = apiInterface!!.getAuthToken(
            intent.getStringExtra(Constants.ENTERPRISEAPIKEY),
            encode(intent.getStringExtra(Constants.ENTERPRISEKEY)!!),
            encode(intent.getStringExtra(Constants.ENTERPRISESECRET)!!),
            intent.getStringExtra(Constants.CUSTOMERID),
            intent.getStringExtra(Constants.CUSTOMERFIRSTNAME),
            intent.getStringExtra(Constants.CUSTOMERLASTNAME),
            intent.getStringExtra(Constants.CUSTOMEREMAIL),
            intent.getStringExtra(Constants.CUSTOMERPHONE),
        )

        RetrofitClass().retroCall(call3, object : RetrofitCallInterface {
            override fun onSuccess(response: Response<ResponseCommon?>?) {
                if (response?.body()?.status?.code.equals("200")) {
                    LoggerClass.d("dfdkfhd", response!!.body()!!.data!!.token)
                    SharedPref.saveString(Constants.TOKEN, "Bearer " + response.body()!!.data!!.token)
                    mDelayHandler = Handler(Looper.getMainLooper())
                    mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)
                } else {
                    binding.llProgress.visibility = View.GONE
                    binding.rvAgentList.visibility = View.GONE
                    binding.tvNoData.visibility = View.VISIBLE
                    binding.tvNoData.text = response?.body()?.data?.errorMsg
                   // CustomToast(this@AgentListActivity).toast(response?.body()?.data?.errorMsg, 0)
                }
            }

            override fun onFailure(response: Response<*>?) {
                binding.llProgress.visibility = View.GONE
                binding.rvAgentList.visibility = View.GONE
                binding.tvNoData.visibility = View.VISIBLE
                binding.tvNoData.text = "Something went wrong"
            }

            override fun onError(error: String?) {
                binding.llProgress.visibility = View.GONE
                binding.rvAgentList.visibility = View.GONE
                binding.tvNoData.visibility = View.VISIBLE
                binding.tvNoData.text = "Something went wrong"
            }
        }, this)

    }

    private val mRunnable: Runnable = Runnable {
        if (!isFinishing) {
           getToken()
        }
    }


    private fun getToken() {
        Thread {
            try {
                FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener(
                    this@AgentListActivity
                ) {
                    val mToken = it.token
                    LoggerClass.e("dkgsjfgsfdf", mToken)

                    saveAppToken(mToken)
                }

            } catch (e: IOException) {
                e.printStackTrace()
            }
        }.start()
    }

    private fun saveAppToken(token: String) {
        val call3: Call<ResponseCommon?>?
        call3 = apiInterface!!.saveAppToken(
            SharedPref.getString(Constants.TOKEN)!!, token, "android"
        )

        RetrofitClass().retroCall(call3, object : RetrofitCallInterface {
            override fun onSuccess(response: Response<ResponseCommon?>?) {
                //Constants.hideProgressDialog()
               // CustomToast(this@AgentListActivity).toast("success", 1)
                getAgentList()
            }

            override fun onFailure(response: Response<*>?) {
                //Constants.hideProgressDialog()
                saveAppToken(token)
            }

            override fun onError(error: String?) {
                //Constants.hideProgressDialog()
                saveAppToken(token)
            }
        },this)
    }


    private fun getAgentList() {

        val call3: Call<ResponseCommon?> = apiInterface!!.getSalesAgents(
            SharedPref.getString(Constants.TOKEN)!!
        )

        RetrofitClass().retroCall(call3, object : RetrofitCallInterface {
            override fun onSuccess(response: Response<ResponseCommon?>?) {

                if (response?.body()?.status?.code.equals("200")) {
                    LoggerClass.d("dfdkfhd", response!!.body().toString())
                    list.clear()
                    list.addAll(response.body()!!.data!!.users!!)

                    if (list.size>0) {
                        val mdAdapter = UsersAdapter(
                            this@AgentListActivity,
                            list,
                            "",
                            this@AgentListActivity
                        )
                        /*var mdAdapter = SalesUserAdapter(
                            this@AgentListActivity!!,
                            list, "Sales", this@AgentListActivity, "salesPerson"
                        )
*/
                        binding.rvAgentList.layoutManager = LinearLayoutManager(
                            this@AgentListActivity,
                            LinearLayoutManager.VERTICAL,
                            false
                        )
                        binding.rvAgentList.itemAnimator = DefaultItemAnimator()
                        binding.rvAgentList.isNestedScrollingEnabled = false
                        binding.rvAgentList.adapter = mdAdapter

                        binding.llProgress.visibility = View.GONE
                        binding.rvAgentList.visibility = View.VISIBLE
                        binding.tvNoData.visibility = View.GONE
                    }
                    else {
                        binding.llProgress.visibility = View.GONE
                        binding.rvAgentList.visibility = View.GONE
                        binding.tvNoData.visibility = View.VISIBLE
                        binding.tvNoData.text =  "Agents are not available at this movement"
                    }
                } else {
                    binding.llProgress.visibility = View.GONE
                    binding.rvAgentList.visibility = View.GONE
                    binding.tvNoData.visibility = View.VISIBLE
                    binding.tvNoData.text =  response?.body()?.data?.errorMsg
                }

            }

            override fun onFailure(response: Response<*>?) {
                binding.llProgress.visibility = View.GONE
                binding.rvAgentList.visibility = View.GONE
                binding.tvNoData.visibility = View.VISIBLE
                binding.tvNoData.text = "Something went wrong"
            }

            override fun onError(error: String?) {
                binding.llProgress.visibility = View.GONE
                binding.rvAgentList.visibility = View.GONE
                binding.tvNoData.visibility = View.VISIBLE
                binding.tvNoData.text = "Something went wrong"
            }
        }, this)

    }

    private fun encode(text: String) : String{
        var authkey: String? = ""
        Log.d("ffffffff", Build.VERSION.SDK_INT.toString())

        if (Build.VERSION.SDK_INT >= 26)
            authkey = Base64.getEncoder().encodeToString(text.toByteArray())
        else
            authkey = android.util.Base64.encodeToString(text.toByteArray(), android.util.Base64.NO_WRAP)


        return authkey!!
    }

    fun onBack(view: View) {}
    override fun onItemClickCallBack(data: Any, screen: String, pos: Int) {
        if (screen == "share") {
            data as CommonData.Customer
            callProgressDailog(this@AgentListActivity, "Please wait")
            getConnectionRoom(data.id!!)
        }
    }

    private fun getConnectionRoom(agent_id : String) {
        val call3: Call<ResponseCommon?> = apiInterface!!.getConnectioRoom(
            SharedPref.getString(Constants.TOKEN)!!, agent_id
        )
        RetrofitClass().retroCall(call3, object : RetrofitCallInterface {
            override fun onSuccess(response: Response<ResponseCommon?>?) {
                hideProgressDialog()
                if (response?.body()?.status?.code.equals("200")) {
                    LoggerClass.d("dfdkfhd", response!!.body()!!.data?.toString())
                    LoggerClass.d("dfdkfhd", response!!.body()!!.data?.agoraConfig!!.appId)
                    LoggerClass.d("dfdkfhd", response!!.body()!!.data?.room!!.channel_name!!)
                    SharedPref.saveObject(response.body()!!.data, this@AgentListActivity, Constants.CONNECTION_DATA)
                    Share(sscontext!!,response.body()!!.data)
                    finish()

                } else {

                    CustomToast(this@AgentListActivity).toast(response?.body()?.data?.errorMsg, 0)
                }
            }

            override fun onFailure(response: Response<*>?) {
                CustomToast(this@AgentListActivity).toast("Something went wrong", 0)
                hideProgressDialog()
            }

            override fun onError(error: String?) {
                CustomToast(this@AgentListActivity).toast("Something went wrong", 0)
                hideProgressDialog()
            }
        }, this)

    }


    private fun callProgressDailog(activity: Activity, msg: String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        val customLayout: View = activity.layoutInflater.inflate(R.layout.progress, null)
        val tv = customLayout.findViewById<TextView>(R.id.loading_msg)
        tv.text = msg
        builder.setView(customLayout)
        dialog = builder.create()
        dialog.setCanceledOnTouchOutside(false)
        dialog.setCancelable(false)
        dialog.show()
    }

    fun hideProgressDialog() {
        dialog.dismiss()
    }
}
package io.agora.rtc.screenshare.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

import io.agora.rtc.screenshare.callback.OnItemClick
import io.agora.rtc.screenshare.model.CommonData
import io.agora.rtc.ss.R
import io.agora.rtc.ss.databinding.RowUserViewBinding

class UsersAdapter(
    context: Context,
    list: ArrayList<Any>,
    var screen: String,
    itemClick: OnItemClick
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var builder: AlertDialog.Builder? = null
    var list : ArrayList<Any>? = list
    var context: Context? = context
    private var itemClick: OnItemClick? = itemClick
    var selected = -1

    init {
        builder = AlertDialog.Builder(context)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        var viewHolder: RecyclerView.ViewHolder? = null
        val dataBinding = RowUserViewBinding.inflate(
            LayoutInflater.from(parent.context)
        )
        viewHolder =  ViewHolder(dataBinding)

        return viewHolder
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val data = this.list!![position] as CommonData.Customer
        holder as ViewHolder
        holder.dataBinding.tvFname.text = data.first_name
        holder.dataBinding.tvLname.text = data.last_name
       // holder.dataBinding.dataModel = data

        holder.dataBinding.ivStatus.visibility =  View.VISIBLE

        if (data.is_online == "1") {
            holder.dataBinding.tvStatus.text = "Available"
            holder.dataBinding.tvStatus.setTextColor(ContextCompat.getColor(context!!, R.color.darkMint))
            holder.dataBinding.ivStatus.setImageResource(R.drawable.background_green_circle)

        }
        else {
            holder.dataBinding.tvStatus.setTextColor(
                ContextCompat.getColor(
                    context!!,
                    R.color.warmGrey
                )
            )
            holder.dataBinding.tvStatus.text = "Offline"
            holder.dataBinding.ivStatus.setImageResource(R.drawable.background_red_circle)
        }

        Glide.with(context!!)
            .asBitmap()
            .apply(
                RequestOptions().placeholder(R.drawable.ic_profile_user)
            )
            .load(data.profile_pic!!.original)
            .into(holder.dataBinding.profileImage)


        holder.dataBinding.ivShare.setOnClickListener {
            itemClick!!.onItemClickCallBack(data, "share", position)
        }
    }

    override fun getItemCount(): Int {
        return list?.size!!
    }

    inner class ViewHolder(var dataBinding: RowUserViewBinding) :
        RecyclerView.ViewHolder(dataBinding.root)


}
package io.agora.rtc.screenshare.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.agora.rtc.screenshare.callback.OnItemClick
import io.agora.rtc.screenshare.model.CommonData
import io.agora.rtc.ss.R
import io.agora.rtc.ss.databinding.RowSalesViewBinding


class SalesUserAdapter
    (
    context: Context,
    list: ArrayList<Any>,
    var screen: String,
    itemClick: OnItemClick,
    var userType: String
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
        var viewholder : RecyclerView.ViewHolder? = null
        if (screen == "Sales") {
            val dataBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.row_sales_view,
                    parent,
                    false
                ) as RowSalesViewBinding
            viewholder =  ViewHolder(dataBinding)
        }

        return viewholder!!
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val data = this.list!![position] as CommonData.Customer
        if (screen == "Sales") {
            holder as ViewHolder
            holder.dataBinding.dataModel = data

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

        }


    }

    override fun getItemCount(): Int {
        return list?.size!!
    }

    inner class ViewHolder(var dataBinding: RowSalesViewBinding) :
        RecyclerView.ViewHolder(dataBinding.root)


}
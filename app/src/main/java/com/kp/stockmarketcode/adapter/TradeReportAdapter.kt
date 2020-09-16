package com.kp.stockmarketcode.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.model.TradeReport
import kotlinx.android.synthetic.main.item_protfolio_market_watch.view.*

class TradeReportAdapter(val list: List<TradeReport>) :
    RecyclerView.Adapter<TradeReportAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_protfolio_holding_position, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(item: TradeReport) {
            itemView.tv1.text = item.stock
            itemView.tv2.text = item.price
            itemView.tv3.text = item.qty
            itemView.tv4.text = item.status
        }
    }

}
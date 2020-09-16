package com.kp.stockmarketcode.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.model.FinancialLedger
import kotlinx.android.synthetic.main.item_protfolio_market_watch.view.*

class FinancialLedgerAdapter(private val list: List<FinancialLedger>) :
    RecyclerView.Adapter<FinancialLedgerAdapter.ViewHolder>() {

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
        fun bindItem(item: FinancialLedger) {
            itemView.tv1.text = item.clientName
            itemView.tv2.text = item.financialLedger
            //itemView.tv3.text = item.qut
            //itemView.tv4.text = item.holdingPosition
        }
    }

}
package com.kp.stockmarketcode.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.model.MarketWatch
import com.kp.stockmarketcode.model.ProtFolioMW
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_protfolio_market_watch.view.*
import java.util.*
import kotlin.collections.ArrayList

class ProtFolioMWAdapter(val list: ArrayList<MarketWatch>) : RecyclerView.Adapter<ProtFolioMWAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_protfolio_market_watch, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(marketWatch: MarketWatch) {
            itemView.tv1.text = marketWatch.stock
            itemView.tv2.text = marketWatch.price
            itemView.tv3.text = marketWatch.buySell
            itemView.tv4.text = marketWatch.prevClosePrice
            itemView.tv5.text = marketWatch.open
            itemView.tv6.text = marketWatch.lowPrice
            itemView.tv7.text = marketWatch.highPrice
            itemView.tv8.text = marketWatch.lastUpdate
            itemView.tv9.text = marketWatch.change
            itemView.tv10.text = marketWatch.changePersentage
            itemView.tv11.text = marketWatch.action
        }
    }

}
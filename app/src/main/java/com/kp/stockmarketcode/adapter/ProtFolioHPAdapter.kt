package com.kp.stockmarketcode.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.model.ProtFolioHP
import kotlinx.android.synthetic.main.item_protfolio_market_watch.view.*

class ProtFolioHPAdapter (val list: ArrayList<ProtFolioHP>) :
    RecyclerView.Adapter<ProtFolioHPAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_protfolio_holding_position, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(holdingPosition: ProtFolioHP) {
            itemView.tv1.text = holdingPosition.stock
            itemView.tv2.text = holdingPosition.price
            itemView.tv3.text = holdingPosition.qut
            itemView.tv4.text = holdingPosition.holdingPosition
        }
    }

}
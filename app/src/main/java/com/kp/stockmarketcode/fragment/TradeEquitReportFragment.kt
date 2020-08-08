package com.kp.stockmarketcode.fragment

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.adapter.ProtFolioHPAdapter
import com.kp.stockmarketcode.holdingPosition
import com.kp.stockmarketcode.model.ProtFolioHP
import kotlinx.android.synthetic.main.portfolio_holding_position.view.*
import kotlinx.android.synthetic.main.trade_equit_report.view.*
import kotlinx.android.synthetic.main.trade_equit_report.view.rvList
import kotlinx.android.synthetic.main.trade_equit_report.view.spType

class TradeEquitReportFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_equit_report, container, false)

        view.spExchange
        view.spType

        var list = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, arrayOf("All","NSE","BSE"))
        list.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        with(view.spExchange)
        {
            adapter = list
            setSelection(0, false)
            //onItemSelectedListener = root.context
            //prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        var aa = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, arrayOf("All","NSE","BSE"))
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        with(view.spType)
        {
            adapter = aa
            setSelection(0, false)
            //onItemSelectedListener = root.context
            //prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        view.rvList

        val holdingPositionn = ArrayList<ProtFolioHP>()
        val adapter1 = ProtFolioHPAdapter(holdingPositionn)
        holdingPositionn.add(holdingPosition.holdingPosition)
        view.rvList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        view.rvList.adapter = adapter1

        view.btView.setOnClickListener {
            holdingPositionn.add(holdingPosition.holdingPosition)
            adapter1.notifyDataSetChanged()
        }

        //EquitReport

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeEquitReportFragment {
            return TradeEquitReportFragment().apply {
            }
        }
    }

}
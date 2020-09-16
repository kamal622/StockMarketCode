package com.kp.stockmarketcode.fragments.EquitReport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R

class TradeEquitReportFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_equit_report, container, false)

        /*var list = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, arrayOf("All","NSE","BSE"))
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
        }*/

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
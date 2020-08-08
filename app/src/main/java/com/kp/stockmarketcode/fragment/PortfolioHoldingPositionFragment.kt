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
import com.kp.stockmarketcode.adapter.ProtFolioMWAdapter
import com.kp.stockmarketcode.holdingPosition.holdingPosition
import com.kp.stockmarketcode.marketWatch
import com.kp.stockmarketcode.model.MarketWatch
import com.kp.stockmarketcode.model.ProtFolioHP
import kotlinx.android.synthetic.main.portfolio_holding_position.view.*
import kotlinx.android.synthetic.main.portfolio_holding_position.view.btAdd
import kotlinx.android.synthetic.main.portfolio_holding_position.view.rvList
import kotlinx.android.synthetic.main.portfolio_market_watch.view.*

class PortfolioHoldingPositionFragment : Fragment() {

    //private lateinit var reportViewModel: ReportViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //reportViewModel = ViewModelProvider(this).get(ReportViewModel::class.java)
        val view = inflater.inflate(R.layout.portfolio_holding_position, container, false)
        /*reportViewModel.text.observe(viewLifecycleOwner, Observer {
            tv.text = it
        })*/

        val holdingPositionn = ArrayList<ProtFolioHP>()
        val adapter1 = ProtFolioHPAdapter(holdingPositionn)
        holdingPositionn.add(holdingPosition)
        view.rvList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        view.rvList.adapter = adapter1

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

        //view.spType
        //view.tvFomrDate
        //view.tvToDate
        //view.rvList
        view.btAdd.setOnClickListener {
            holdingPositionn.add(holdingPosition)
            adapter1.notifyDataSetChanged()
        }

        return view
    }

}
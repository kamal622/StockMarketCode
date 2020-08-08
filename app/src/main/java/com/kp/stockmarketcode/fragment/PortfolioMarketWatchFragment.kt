package com.kp.stockmarketcode.fragment

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.adapter.ProtFolioMWAdapter
import com.kp.stockmarketcode.marketWatch.marketWatch
import com.kp.stockmarketcode.model.MarketWatch
import kotlinx.android.synthetic.main.activity_edit_profile.*
import kotlinx.android.synthetic.main.portfolio_market_watch.*
import kotlinx.android.synthetic.main.portfolio_market_watch.view.*

class PortfolioMarketWatchFragment : Fragment() {

    //private lateinit var reportViewModel: ReportViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //reportViewModel = ViewModelProvider(this).get(ReportViewModel::class.java)
        val view = inflater.inflate(R.layout.portfolio_market_watch, container, false)
        /*reportViewModel.text.observe(viewLifecycleOwner, Observer {
            tv.text = it
        })*/

        //val mFields: MutableList<MarketWatch> = java.util.ArrayList()
        val marketWatchh = ArrayList<MarketWatch>()
        val adapter1 = ProtFolioMWAdapter(marketWatchh)
        view.etStock.text
        marketWatchh.add(marketWatch)

        view.rvList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        view.rvList.adapter = adapter1

        var aa = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, arrayOf("NSE","BSE"))
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        with(view.spExchange)
        {
            adapter = aa
            setSelection(0, false)
            //onItemSelectedListener = root.context
            //prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        view.btAdd.setOnClickListener {
            if (validateFields()) {
                etStock.setText("")
                marketWatchh.add(marketWatch)
                adapter1.notifyDataSetChanged()
            }
        }

        return view
    }

    private fun validateFields(): Boolean {
        if (etStock.text.trim().isEmpty()) {
            etStock.setError("Enter Stock")
            return false
        }
        return true
    }



}
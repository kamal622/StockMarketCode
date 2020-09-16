package com.kp.stockmarketcode.fragments.MarketWatch

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.adapter.ProtFolioMWAdapter
import com.kp.stockmarketcode.marketWatch.marketWatch
import com.kp.stockmarketcode.model.MarketWatch
import com.kp.stockmarketcode.utils.typeTwoList
import com.kp.stockmarketcode.utils.validateFields
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

        view.etStock.text
        marketWatchh.add(marketWatch)

        view.rvList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        view.rvList.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )
        view.rvList.adapter = ProtFolioMWAdapter(marketWatchh)

        val arrList = typeTwoList(view)
        arrList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        with(view.spExchange) {
            this.adapter = arrList
            setSelection(0, false)
            gravity = Gravity.CENTER
        }

        view.btAdd.setOnClickListener {
            if (validateFields(etStock)) {
                etStock.setText("")
                marketWatchh.add(marketWatch)
                //view.rvList.adapter.notifyDataSetChanged()
            }
        }

        return view
    }

}
package com.kp.stockmarketcode.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R

class TradeFandOReportFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_fando_report, container, false)

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeFandOReportFragment {
            return TradeFandOReportFragment().apply {
            }
        }
    }
}
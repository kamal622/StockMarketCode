package com.kp.stockmarketcode.fragments.FandOBuy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R

class TradeFandOBuyFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_fando_buy, container, false)

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeFandOBuyFragment {
            return TradeFandOBuyFragment().apply {
            }
        }
    }
}
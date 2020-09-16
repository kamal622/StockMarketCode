package com.kp.stockmarketcode.fragments.Portfolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.fragments.HoldingPosition.PortfolioHoldingPositionFragment
import com.kp.stockmarketcode.fragments.MarketWatch.PortfolioMarketWatchFragment
import com.kp.stockmarketcode.utils.Adapter
import kotlinx.android.synthetic.main.fragment_fixtures_tabs.view.*

class PortfolioFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fixtures_tabs, container, false)
        setupViewPager(view.viewpager)
        view.result_tabs.setupWithViewPager(view.viewpager)
        return view
    }

    // Add Fragments to Tabs
    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = Adapter(childFragmentManager)
        adapter.addFragment(PortfolioMarketWatchFragment(), "Market Watch")
        adapter.addFragment(PortfolioHoldingPositionFragment(), "Holding Position")
        viewPager.adapter = adapter
    }


}
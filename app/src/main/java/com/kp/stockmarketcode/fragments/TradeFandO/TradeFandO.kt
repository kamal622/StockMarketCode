package com.kp.stockmarketcode.fragments.TradeFandO

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.fragments.FandOBuy.TradeFandOBuyFragment
import com.kp.stockmarketcode.fragments.FandOReport.TradeFandOReportFragment
import com.kp.stockmarketcode.fragments.FandOSell.TradeFandOSellFragment
import kotlinx.android.synthetic.main.fragment_fixtures_tabs.view.*

class TradeFandO  : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sub_tabs, container, false)
        setupViewPager(view.viewpager)
        view.result_tabs.setupWithViewPager(view.viewpager)
        return view
    }

    // Add Fragments to Tabs
    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = Adapter(childFragmentManager)
        adapter.addFragment(TradeFandOBuyFragment(), "Buy")
        adapter.addFragment(TradeFandOSellFragment(), "Sell")
        adapter.addFragment(TradeFandOReportFragment(), "Report")
        viewPager.adapter = adapter
    }

    internal class Adapter(manager: FragmentManager?) :
        FragmentPagerAdapter(manager!!,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val mFragmentList: MutableList<Fragment> = java.util.ArrayList()
        private val mFragmentTitleList: MutableList<String> = java.util.ArrayList()

        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return mFragmentTitleList[position]
        }
    }

}
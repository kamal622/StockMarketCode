package com.kp.stockmarketcode.ui.report

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.fragment.*
import com.kp.stockmarketcode.ui.profile.ProfileViewModel
import kotlinx.android.synthetic.main.fragment_fixtures_tabs.view.*
import kotlinx.android.synthetic.main.fragment_profile.*

class ReportFragment : Fragment() {

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
        adapter.addFragment(ReportFinancialLedgerFragment(), "Financial Ledger")
        adapter.addFragment(ReportProfitLossFragment(), "Profit Loss")
        adapter.addFragment(ReportTradeReportFragment(), "Trade Report")
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

/*private lateinit var reportViewModel: ReportViewModel

override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {

    reportViewModel = ViewModelProvider(this).get(ReportViewModel::class.java)
    val view = inflater.inflate(R.layout.fragment_report, container, false)
    reportViewModel.text.observe(viewLifecycleOwner, Observer {
        //tv.text = it
    })

    //Profit and Loss
    //Financial Ledger
    //Trade Report

    return view
}*/

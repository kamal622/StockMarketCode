package com.kp.stockmarketcode.fragments.Report

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.fragments.FinancialLedger.ReportFinancialLedgerFragment
import com.kp.stockmarketcode.fragments.ProfitLoss.ProfitLossFragment
import com.kp.stockmarketcode.fragments.TradeReport.TradeReportFragment
import kotlinx.android.synthetic.main.fragment_fixtures_tabs.view.*

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
        adapter.addFragment(ProfitLossFragment(), "Profit Loss")
        adapter.addFragment(TradeReportFragment(), "Trade Report")
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

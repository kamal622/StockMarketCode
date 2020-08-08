package com.kp.stockmarketcode.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.ui.report.ReportViewModel

class ReportFinancialLedgerFragment : Fragment() {

    //private lateinit var reportViewModel: ReportViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //reportViewModel = ViewModelProvider(this).get(ReportViewModel::class.java)
        val view = inflater.inflate(R.layout.report_financial_ledger, container, false)
        /*reportViewModel.text.observe(viewLifecycleOwner, Observer {
            tv.text = it
        })*/


        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): ReportFinancialLedgerFragment {
            return ReportFinancialLedgerFragment().apply {

            }
        }
    }

}
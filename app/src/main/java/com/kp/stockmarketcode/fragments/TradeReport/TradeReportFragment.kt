package com.kp.stockmarketcode.fragments.TradeReport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R
import kotlinx.android.synthetic.main.portfolio_holding_position.*

class TradeReportFragment : Fragment() {

    //private lateinit var reportViewModel: ReportViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //reportViewModel = ViewModelProvider(this).get(ReportViewModel::class.java)
        /*val view = inflater.inflate(R.layout.report_trade_report, container, false)
        *//*reportViewModel.text.observe(viewLifecycleOwner, Observer {
            tv.text = it
        })*//*

        val arrList = typeThreeList(view)
        arrList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        with(view.spType) {
            this.adapter = arrList
            setSelection(0, false)
            //onItemSelectedListener = root.context
            //prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        view.tvFomrDate.setOnClickListener {
            datePickDiloge(view.context, view.tvFomrDate)
        }

        view.tvToDate.setOnClickListener {
            datePickDiloge(view.context, view.tvToDate)
        }

        view.btSubmit.setOnClickListener {
            if(validateFields()){
                Toast.makeText(
                    context,
                    "${view.spType.selectedItem} ${view.tvFomrDate.text}  ${view.tvToDate.text}",
                    Toast.LENGTH_SHORT
                ).show()
                tvFomrDate.text = getString(R.string.select_from_date)
                tvToDate.text = getString(R.string.select_to_date)
            }
        }

        view.rvList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        view.rvList.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        view.rvList.adapter = TradeReportAdapter(tradeReport)*/

        return view
    }


    private fun validateFields(): Boolean {
        if (tvFomrDate.text.trim().contains(getString(R.string.select_from_date))) {
//            tvFomrDate.setError(getString(R.string.select_from_date))
            tvFomrDate.setBackgroundResource(R.drawable.ic_spinner_border_error)
            return false
        }
        if (tvToDate.text.trim().contains(getString(R.string.select_to_date))) {
//            tvToDate.setError(getString(R.string.select_to_date))
            tvToDate.setBackgroundResource(R.drawable.ic_spinner_border_error)
            return false
        }
        return true
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeReportFragment {
            return TradeReportFragment().apply {

            }
        }
    }


}
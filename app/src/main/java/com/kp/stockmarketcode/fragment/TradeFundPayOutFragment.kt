package com.kp.stockmarketcode.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R
import kotlinx.android.synthetic.main.trade_fund_payout.*
import kotlinx.android.synthetic.main.trade_fund_payout.view.*

class TradeFundPayOutFragment : Fragment(){

    private val mFields: MutableList<EditText> = java.util.ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_fund_payout, container, false)

        view.btRevertFund.setOnClickListener {
            if(validateFields()) {

                for (items in mFields){
                    items.setError("")
                }
                Toast.makeText(context, "Fund Revert..!!", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    private fun validateFields(): Boolean {
        mFields.add(etFullName)
        mFields.add(etBankDetails)
        mFields.add(etEmail)
        mFields.add(etBrokerage)
        mFields.add(etPayOutAmount)

        var fieldValidationFlag:Boolean = true
        for (items in mFields){
            if (items.text.trim().isEmpty()) {
                items.setError("Enter "+items.hint)
                fieldValidationFlag = false
            }
        }
        return fieldValidationFlag
        /*if (etFullName.text.trim().isEmpty()) {
            etFullName.setError("Enter "+etFullName.hint)
            return false
        }
        if (etBankDetails.text.trim().isEmpty()) {
            etBankDetails.setError("Enter "+etBankDetails.hint)
            return false
        }
        if (etEmail.text.trim().isEmpty()) {
            etEmail.setError("Enter "+etEmail.hint)
            return false
        }
        if (etBrokerage.text.trim().isEmpty()) {
            etBrokerage.setError("Enter "+etBrokerage.hint)
            return false
        }
        if (etPayOutAmount.text.trim().isEmpty()) {
            etPayOutAmount.setError("Enter "+etPayOutAmount.hint)
            return false
        }
        return true*/
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeFundPayOutFragment {
            return TradeFundPayOutFragment().apply {
            }
        }
    }
}
package com.kp.stockmarketcode.fragments.FundPayIn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R
import kotlinx.android.synthetic.main.trade_fund_payin.*

class TradeFundPayInFragment : Fragment() {

    private val mFields: MutableList<EditText> = java.util.ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_fund_payin, container, false)

        /*view.tvBankDetails.text = "${bankDetails.accountDetails} \n${bankDetails.bankName} \n${bankDetails.accountNumber} \n${bankDetails.ifscCode} \n${bankDetails.acName}"

        view.btAddAmount.setOnClickListener {
            if (validateFields()) {
                val onlinePayment = OnlinePayment(etFN.text.trim().toString(),
                        etCardName.text.trim().toString(),
                        etCardNumber.text.trim().toString(),
                        etCvvNumber.text.trim().toString(),
                        etEmailAddress.text.trim().toString(),
                        etPayinAmount.text.trim().toString())

                for (items in mFields) {
                    items.setText("")
                }

                Toast.makeText(context, "Fund Added..!!", Toast.LENGTH_SHORT).show()
            }

        }*/

        return view
    }

    private fun validateFields(): Boolean {
        mFields.add(etFN)
        mFields.add(etCardName)
        mFields.add(etCardNumber)
        mFields.add(etCvvNumber)
        mFields.add(etEmailAddress)
        mFields.add(etPayinAmount)

        var fieldValidationFlag: Boolean = true
        for (items in mFields) {
            if (items.text.trim().isEmpty()) {
                items.error = "Enter " + items.hint
                fieldValidationFlag = false
            }
        }
        return fieldValidationFlag
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeFundPayInFragment {
            return TradeFundPayInFragment().apply {
            }
        }
    }

    /*fun validateFields(): Boolean {

        if (etFN.text.trim().isEmpty()) {
            etFN.setError("Enter "+etFN.hint)
            return false
        }
        if (etCardName.text.trim().isEmpty()) {
            etCardName.setError("Enter "+etCardName.hint)
            return false
        }
        if (etCardNumber.text.trim().isEmpty()) {
            etCardNumber.setError("Enter "+etCardNumber.hint)
            return false
        }
        if (etCvvNumber.text.trim().isEmpty()) {
            etCvvNumber.setError("Enter "+etCvvNumber.hint)
            return false
        }
        if (etEmail.text.trim().isEmpty()) {
            etEmail.setError("Enter "+etEmail.hint)
            return false
        }
        if (etPayinAmount.text.trim().isEmpty()) {
            etPayinAmount.setError("Enter "+etPayinAmount)
            return false
        }

        return true
    }*/

}
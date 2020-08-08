package com.kp.stockmarketcode.fragment

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R
import kotlinx.android.synthetic.main.trade_equit_sell.*
import kotlinx.android.synthetic.main.trade_equit_sell.view.*

class TradeEquitSellFragment: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_equit_sell, container, false)

        view.cbCase
        view.spExchange
        view.etStockCode
        view.etQuntity
        view.etPrice

        var aa = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, arrayOf("NSE","BSE"))
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        with(view.spExchange)
        {
            adapter = aa
            setSelection(0, false)
            //onItemSelectedListener = root.context
            //prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        view.btSellNow.setOnClickListener {
            if(validateFields()){
                Toast.makeText(context, "Share Buy Successfully..!!", Toast.LENGTH_SHORT).show()
                clearData()
            }

        }

        view.btClear.setOnClickListener {
            clearData()
        }

        return view
    }

    private fun clearData(){
        cbCase.isChecked = false
        etStockCode.setText("")
        etQuntity.setText("")
        etPrice.setText("")
    }

    fun validateFields(): Boolean {
        if (etStockCode.text.trim().isEmpty()) {
            etStockCode.setError("Enter StockCode")
            return false
        }
        if (etQuntity.text.trim().isEmpty()) {
            etQuntity.setError("Enter Quntity")
            return false
        }
        if (etPrice.text.trim().isEmpty()) {
            etPrice.setError("Enter Price")
            return false
        }
        return true
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeEquitSellFragment {
            return TradeEquitSellFragment().apply {
            }
        }
    }
}
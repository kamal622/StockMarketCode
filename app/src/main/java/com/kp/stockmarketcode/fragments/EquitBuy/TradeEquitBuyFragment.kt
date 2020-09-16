package com.kp.stockmarketcode.fragments.EquitBuy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R
import kotlinx.android.synthetic.main.trade_equit_buy.*

class TradeEquitBuyFragment : Fragment() {

    /*private var _binding: TradeEquitBuyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = TradeEquitBuyBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        _binding = null
    }*/


    //private lateinit var binding: TradeEquitBuyFragmentBinding
    //private lateinit var equitBuyViewModel: EquitBuyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_equit_buy, container, false)

        /*val arrList = typeTwoList(view)
        arrList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        with(view.spExchange) {
            this.adapter = arrList
            setSelection(0, false)
            gravity = Gravity.CENTER
        }

        view.btBuyNow.setOnClickListener {
            if(validateFields()){

                view.cbCase
                view.spExchange
                view.etStockCode
                view.etQuntity
                view.etPrice

                //EquitBuy(true,spExchange.get(0).toString(), view.etStockCode.text.toString(),view.etQuntity.text.toString(),view.etPrice.text.trim().toString())

                Toast.makeText(context, "Share Buy Successfully..!!", Toast.LENGTH_SHORT).show()
                clearData()
            }

        }

        view.btClear.setOnClickListener {

            clearData()
        }*/

        return view
    }

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.trade_equit_buy, container, false)
    }*/

    private fun clearData() {
        cbCase.isChecked = false
        etStockCode.setText("")
        etQuntity.setText("")
        etPrice.setText("")
    }

    fun validateFields(): Boolean {
        if (etStockCode.text!!.trim().isEmpty()) {
            etStockCode.error = "Enter StockCode"
            return false
        }
        if (etQuntity.text!!.trim().isEmpty()) {
            etQuntity.error = "Enter Quntity"
            return false
        }
        if (etPrice.text!!.trim().isEmpty()) {
            etPrice.error = "Enter Price"
            return false
        }
        return true
    }

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeEquitBuyFragment {
            return TradeEquitBuyFragment().apply {
            }
        }
    }

}
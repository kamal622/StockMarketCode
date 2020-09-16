package com.kp.stockmarketcode.fragments.EquitSell

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kp.stockmarketcode.R

class TradeEquitSellFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.trade_equit_sell, container, false)

        /*view.cbCase
        view.spExchange
        view.etStockCode
        view.etQuntity
        view.etPrice

        val arrList = typeTwoList(view)
        arrList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        with(view.spExchange) {
            this.adapter = arrList
            setSelection(0, false)
            //onItemSelectedListener = root.context
            //prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        view.btSellNow.setOnClickListener {
            if(validateFields()){

                EquitSell(true,"", view.etStockCode.text.toString(),view.etQuntity.text.toString(),view.etPrice.text.toString())

                Toast.makeText(context, "Share Buy Successfully..!!", Toast.LENGTH_SHORT).show()
                clearData()
            }

        }

        view.btClear.setOnClickListener {
            datePicker()
            //clearData()
        }*/

        return view
    }

    fun datePicker() {

        /*val builder : MaterialDatePicker.Builder<*> = MaterialDatePicker.Builder.datePicker()

        val constraintsBuilder = CalendarConstraints.Builder()  // 1
        val calendar = Calendar.getInstance()
        constraintsBuilder.setStart(calendar.timeInMillis)   //   2
        calendar.roll(Calendar.YEAR, 1)   //   3
        constraintsBuilder.setEnd(calendar.timeInMillis)   // 4
        builder.setCalendarConstraints(constraintsBuilder.build())   //  5
        val picker: MaterialDatePicker<*> = builder.build()
        activity?.supportFragmentManager?.let { picker.show(it, picker.toString()) }*/
    }

/*    class WeekDayValidator : CalendarConstraints.DateValidator {
        private val utc =
            Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        val CREATOR: Parcelable.Creator<WeekDayValidator?> =
            object : Parcelable.Creator<WeekDayValidator?> {
                override fun createFromParcel(source: Parcel): WeekDayValidator {
                    return WeekDayValidator()
                }
                override fun newArray(size: Int): Array<WeekDayValidator?> {
                    return arrayOfNulls(size)
                }
            }

        override fun writeToParcel(dest: Parcel?, flags: Int) {
        }

        override fun isValid(date: Long): Boolean {
            utc.timeInMillis = date
            val dayOfWeek = utc[Calendar.DAY_OF_WEEK]
            return dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY
        }

        override fun describeContents(): Int {
            return 0
        }

        override fun hashCode(): Int {
            val hashedFields = arrayOf<Any>()
            return hashedFields.contentHashCode()
        }
    }

    private fun clearData(){
        cbCase.isChecked = false
        etStockCode.setText("")
        etQuntity.setText("")
        etPrice.setText("")
    }

    fun validateFields(): Boolean {
        if (etStockCode.text!!.trim().isEmpty()) {
            etStockCode.setError("Enter StockCode")
            return false
        }
        if (etQuntity.text!!.trim().isEmpty()) {
            etQuntity.setError("Enter Quntity")
            return false
        }
        if (etPrice.text!!.trim().isEmpty()) {
            etPrice.setError("Enter Price")
            return false
        }
        return true
    }*/

    companion object {
        @JvmStatic
        fun newInstance(sectionNumber: Int): TradeEquitSellFragment {
            return TradeEquitSellFragment().apply {
            }
        }
    }

}
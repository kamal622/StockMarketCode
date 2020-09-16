package com.kp.stockmarketcode.utils

import android.R
import android.app.DatePickerDialog
import android.content.Context
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.*


/**
 * Returns [Boolean] based on current time.
 * Returns true if hours are between 06:00 pm - 07:00 am
 */
fun isNight(): Boolean {
    val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    return (currentHour <= 7 || currentHour >= 18)
}

fun typeTwoList(view: View): ArrayAdapter<String> {
    return ArrayAdapter(
        view.context,
        R.layout.simple_spinner_item,
        arrayOf("NSE", "BSE")
    )
}

fun typeThreeList(view: View): ArrayAdapter<String> {
    return ArrayAdapter(
        view.context,
        R.layout.simple_spinner_item,
        arrayOf("All", "NSE", "BSE")
    )
}

var MONTHS =
    arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC")

/*enum class Months {
    JAN,
    FEB,
    MAR,
    APR,
    MAY,
    JUN,
    JUL,
    AUG,
    SEP,
    OCT,
    NOV,
    DEC
}*/

fun datePickDiloge(context: Context, textView: TextView) {
    val c = Calendar.getInstance()
    val year = c.get(Calendar.YEAR)
    val month = c.get(Calendar.MONTH)
    val day = c.get(Calendar.DAY_OF_MONTH)
    val dpd = DatePickerDialog(
        context, { view, year, monthOfYear, dayOfMonth ->
            textView.text = "$dayOfMonth ${MONTHS[monthOfYear]} $year"
            textView.setBackgroundResource(com.kp.stockmarketcode.R.drawable.ic_spinner_border)
        }, year, month, day
    )
    dpd.show()
}

fun validateFields(etStock: EditText): Boolean {
    if (etStock.text.trim().isEmpty()) {
        etStock.error = etStock.hint
        return false
    }
    return true
}


class Adapter(manager: FragmentManager?) :
    FragmentPagerAdapter(manager!!, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
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
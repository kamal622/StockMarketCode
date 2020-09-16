package com.kp.stockmarketcode.fragments.Trade

import java.util.*
internal object ExpandableListData {
    val data: HashMap<String, List<String>>
        get() {
            val expandableListDetail = HashMap<String, List<String>>()
            val equityItem: MutableList<String> = ArrayList()
            equityItem.add("Buy")
            equityItem.add("Sell")
            equityItem.add("Report")
            val fandOItem: MutableList<String> = ArrayList()
            fandOItem.add("Buy")
            fandOItem.add("Sell")
            fandOItem.add("Report")
            val fundItem: MutableList<String> = ArrayList()
            fundItem.add("PayIn")
            fundItem.add("PayOut")
            expandableListDetail["Equity"] = equityItem
            expandableListDetail["F and O"] = fandOItem
            expandableListDetail["FUND(0.0000)"] = fundItem
            return expandableListDetail
        }

}
package com.kp.stockmarketcode.model

data class MarketWatch(
    val stock:String,
    val price:String,
    val buySell :String,
    val prevClosePrice:String,
    val open:String,
    val lowPrice:String,
    val highPrice:String,
    val lastUpdate:String,
    val change:String,
    val changePersentage:String,
    val action:String)
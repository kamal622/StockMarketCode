package com.kp.stockmarketcode.model

data class TradeReport(
    val orderValidDate: String,
    val exch: String,
    val stock: String,
    val price: String,
    val buyOrSell: String,
    val qty: String,
    val status: String
)
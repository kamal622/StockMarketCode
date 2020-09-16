package com.kp.stockmarketcode.model

data class EquitSell(
    val isCash: Boolean,
    val exchange: String,
    val stockCode: String,
    val quntity: String,
    val price: String
)
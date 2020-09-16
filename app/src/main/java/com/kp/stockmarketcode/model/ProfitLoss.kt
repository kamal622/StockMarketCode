package com.kp.stockmarketcode.model

data class ProfitLoss(
    val symbol: String,
    val expDate: String,
    val tradedQty: String,
    val tradePrice: String,
    val lotSize: String,
    val brokerage: String,
    val purchaseValue: String,
    val sellValue: String
)


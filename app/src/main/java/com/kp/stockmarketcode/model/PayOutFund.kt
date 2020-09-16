package com.kp.stockmarketcode.model

data class PayOutFund(
    val fullName: String,
    val bankDetails: String,
    val email: String,
    val brokerage: String,
    val payOutAmount: String
)
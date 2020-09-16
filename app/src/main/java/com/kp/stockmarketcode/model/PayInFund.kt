package com.kp.stockmarketcode.model

data class PayInFund(
    val fullName: String,
    val cardName: String,
    val cardNumber: Number,
    val cvv: Int,
    val email: String,
    val payInAmount: Double
)
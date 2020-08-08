package com.kp.stockmarketcode.model

data class User(val sourceUrl: String?,
                val name: String,
                val email: String,
                val phoneNo: Number,
                val opening_balance: Double,
                val current_balance: Double,
                val pancard: String,
                val address: String,
                val bank_details: String,
                val limit: String,
                val brokerage: Double)
package com.kp.stockmarketcode.model

import android.icu.util.CurrencyAmount
import android.provider.ContactsContract

data class OnlinePayment(val name: String,
                         val cardName: String,
                         val cardNumber: String,
                         val cvvNumber: String,
                         val email: String,
                         val payINAmount: String )





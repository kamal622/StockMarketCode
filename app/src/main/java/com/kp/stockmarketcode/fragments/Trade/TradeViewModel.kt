package com.kp.stockmarketcode.fragments.Trade

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TradeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is TradeViewModel Fragment"
    }

    val text: LiveData<String> = _text

}
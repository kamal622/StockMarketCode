package com.kp.stockmarketcode.ui.portfolio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProtfolioViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is ProtfolioViewModel Fragment"
    }
    val text: LiveData<String> = _text

}
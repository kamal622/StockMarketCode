package com.kp.stockmarketcode.fragments.Portfolio

import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProtfolioViewModel : ViewModel(), Observable {

    private val _text = MutableLiveData<String>().apply {
        value = "This is ProtfolioViewModel Fragment"
    }
    val text: LiveData<String> = _text

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

}
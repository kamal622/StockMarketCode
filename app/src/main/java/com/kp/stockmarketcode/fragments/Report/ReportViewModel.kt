package com.kp.stockmarketcode.fragments.Report

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReportViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is ReportViewModel Fragment"
    }
    val text: LiveData<String> = _text

}
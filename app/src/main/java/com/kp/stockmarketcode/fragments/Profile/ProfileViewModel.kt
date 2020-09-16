package com.kp.stockmarketcode.fragments.Profile

import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kp.stockmarketcode.model.User

class ProfileViewModel : ViewModel(), Observable {

    /*private val _text = MutableLiveData<String>().apply {
        value = "This is ProfileViewModel Fragment"
    }
    val text: LiveData<String> = _text*/

    private val _user = MutableLiveData<User>().apply {

    }

    val user: LiveData<User> = _user

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    /*val name:LiveData<String> = _user.name

    val email
    val phoneNo
    val opening_balance
    val current_balance
    val pancard
    val address
    val bank_details
    val limit
    val brokerage*/

}
package com.kp.stockmarketcode.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kp.stockmarketcode.model.User

class ProfileViewModel : ViewModel() {

    /*private val _text = MutableLiveData<String>().apply {
        value = "This is ProfileViewModel Fragment"
    }
    val text: LiveData<String> = _text*/

    private val _user = MutableLiveData<User>().apply {

    }

    val user:LiveData<User> = _user

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
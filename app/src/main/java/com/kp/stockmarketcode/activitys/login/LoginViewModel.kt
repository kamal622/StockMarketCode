package com.kp.stockmarketcode.activitys.login

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kp.stockmarketcode.utils.Event

class LoginViewModel : ViewModel(), Observable {

    private val statusMessage = MutableLiveData<Event<String>>()
    val messageLogin: LiveData<Event<String>>
        get() = statusMessage

    private val loginState = MutableLiveData<Boolean>()
    val loginStatus: LiveData<Boolean>
        get() = loginState

    @Bindable
    val uname = MutableLiveData<String>()

    @Bindable
    val password = MutableLiveData<String>()

    fun loginClicked() {
        if (uname.value == null) {
            statusMessage.value = Event("Enter UserName or Email")
            loginState.value = false
        } else if (password.value == null) {
            statusMessage.value = Event("Enter Password")
            loginState.value = false
        } else {
            uname.value = null
            password.value = null
            loginState.value = true
            statusMessage.value = Event("Login Successfully")
        }
        //Log.d("clicked","L clicked")
    }


    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

}
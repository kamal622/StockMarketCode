package com.kp.stockmarketcode.activitys.registration

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kp.stockmarketcode.utils.Event

class RegistrationViewModel : ViewModel(), Observable {

    private val statusMessage = MutableLiveData<Event<String>>()
    val messageRegistration: LiveData<Event<String>>
        get() = statusMessage

    @Bindable
    val name = MutableLiveData<String>()

    @Bindable
    val email = MutableLiveData<String>()

    @Bindable
    val password = MutableLiveData<String>()

    @Bindable
    val repassword = MutableLiveData<String>()

    fun registrationClick() {

        if (name.value == null) {
            statusMessage.value = Event("Enter Name")
        } else if (email.value == null) {
            statusMessage.value = Event("Enter Emaile")
        } else if (password.value == null) {
            statusMessage.value = Event("Enter Password")
        } else if (repassword.value == null) {
            statusMessage.value = Event("Enter Re-Password")
        } else if (password.value != repassword.value) {
            statusMessage.value = Event("Password not matched")
        } else {

            name.value.toString()
            email.value.toString()
            password.value.toString()

            name.value = null
            email.value = null
            password.value = null
            repassword.value = null
            statusMessage.value = Event("Registration Successfully Successfully")
        }
        //Log.d("clicked","R clicked")
    }

    fun loginClick() {
        //Log.d("clicked","L clicked")
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

}
package com.kp.stockmarketcode.activitys.editProfile

import android.util.Patterns
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kp.stockmarketcode.model.User
import com.kp.stockmarketcode.user.user
import com.kp.stockmarketcode.utils.Event

class EditProfileViewModel : ViewModel(), Observable {

    @Bindable
    val name = MutableLiveData<String>()

    @Bindable
    val email = MutableLiveData<String>()

    @Bindable
    val phone = MutableLiveData<String>()

    @Bindable
    val panno = MutableLiveData<String>()

    @Bindable
    val address = MutableLiveData<String>()

    @Bindable
    val bankDetails = MutableLiveData<String>()

    private val statusMessage = MutableLiveData<Event<String>>()
    val message: LiveData<Event<String>>
        get() = statusMessage

    fun onClicked() {
        if (name.value == null) {
            statusMessage.value = Event("Please Enter Name")
        } else if (email.value == null) {
            statusMessage.value = Event("Please Enter Email")
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email.value!!).matches()) {
            statusMessage.value = Event("Please Enter Correct Email address")
        } else if (phone.value == null) {
            statusMessage.value = Event("Please Enter Phone No")
        } else if (panno.value == null) {
            statusMessage.value = Event("Please Enter Pan No")
        } else if (address.value == null) {
            statusMessage.value = Event("Please Enter Address")
        } else if (bankDetails.value == null) {
            statusMessage.value = Event("Please Enter Bank Details")
        } else {

            user = User(
                "https://photos.google.com/photo/AF1QipOkVqBm81TFd_ftbOhSSNsJ-lW1RUoIGuR8UEhu",
                name.value.toString(),
                email.value.toString(),
                phone.value.toString().toInt(),
                0.0,
                0.0,
                panno.value.toString(),
                address.value.toString(),
                bankDetails.value.toString(),
                "ABC",
                0.0
            )
            clearData()
            statusMessage.value = Event("Update Successfully")
        }
    }

    fun clearData() {
        name.value = null
        email.value = null
        phone.value = null
        panno.value = null
        address.value = null
        bankDetails.value = null
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }
}
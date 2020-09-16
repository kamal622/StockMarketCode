package com.kp.stockmarketcode.activitys.registration

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.activitys.login.LoginActivity
import com.kp.stockmarketcode.databinding.ActivityRegistrationBinding
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding
    private lateinit var registrationViewModel: RegistrationViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_edit_profile)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_registration)

        registrationViewModel = ViewModelProvider(this).get(RegistrationViewModel::class.java)
        binding.viewmodelRegistration = registrationViewModel
        binding.lifecycleOwner = this

        registrationViewModel.messageRegistration.observe(this, Observer {
            it.getContentIfNotHandled()?.let {
                Toast.makeText(this, it, Toast.LENGTH_LONG).show()
            }
        })

        btLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}
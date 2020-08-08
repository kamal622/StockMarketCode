package com.kp.stockmarketcode

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kp.stockmarketcode.model.UpdateUserData
import kotlinx.android.synthetic.main.activity_edit_profile.*

class EditProfileActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        //etName = findViewById(R.id.etName)

        btUpdate.setOnClickListener {

            if (validateFields()) {
                val updateUser = UpdateUserData(
                    etName.text.trim().toString(),
                    etEmail.text.trim().toString(),
                    etPhoneNo.text.trim().toString(),
                    etPanNo.text.trim().toString(),
                    etAddress.text.trim().toString(),
                    etBankDetails.text.trim().toString())

                intent.putExtra("name",etName.text.trim().toString())

                /*
                intent.putExtr"name",etEmail.text.trim().toString())
                intent.putExtra("name",etPhoneNo.text.trim().toString())
                intent.putExtra("name",etPanNo.text.trim().toString())
                intent.putExtra("name",etAddress.text.trim().toString())
                intent.putExtra("name",etBankDetails.text.trim().toString())*/

                val intent = Intent()
                setResult(1, intent)

                //intent.putExtra("name",updateUser)
                Toast.makeText(this, "Updated..!!", Toast.LENGTH_SHORT).show()
                finish()
            }

        }

        //supportFragmentManager.beginTransaction().add(R.id.countenur, FixturesTabs()).commit()

    }


    fun validateFields(): Boolean {
        if (etName.text.trim().isEmpty()) {
            etName.setError("Enter Name")
            return false
        }
        if (etEmail.text.trim().isEmpty()) {
            etEmail.setError("Enter Email")
            return false
        }
        if (etPhoneNo.text.trim().isEmpty()) {
            etPhoneNo.setError("Enter PhoneNo")
            return false
        }
        if (etPanNo.text.trim().isEmpty()) {
            etPanNo.setError("Enter PanNo")
            return false
        }
        if (etAddress.text.trim().isEmpty()) {
            etAddress.setError("Enter Address")
            return false
        }
        if (etBankDetails.text.trim().isEmpty()) {
            etBankDetails.setError("Enter Bank Details")
            return false
        }

        return true
    }

}
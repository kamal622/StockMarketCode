package com.kp.stockmarketcode.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kp.stockmarketcode.EditProfileActivity
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.model.User
import com.kp.stockmarketcode.user.user
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        profileViewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        setData(view,user)

        view.btEditProfile.setOnClickListener {
            val intent = Intent(context, EditProfileActivity::class.java)
            startActivityForResult(intent,0)
        }

        return view
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==0 && resultCode==1){
            //val getData: String? = data!!.getExtras()!!.getString("name")

            //val getDataa = UpdateUserData()

            //tvName.text = getData
        }
    }

    fun setData(view: View,user: User){
        view.tvName.text = user.name
        view.tvEmail.text = user.email
        view.tvPhoneNo.text = ""+user.phoneNo
        view.tvOpeningBalance.text = "Opening balance\n${user.opening_balance}"
        view.tvCurrentBalance.text = "Current balance\n${user.current_balance}"
        view.tvPanCard.text = "Pan Card : ${user.pancard}"
        view.tvAddress.text = "Address : ${user.address}"
        view.tvBankDetails.text = "Bank Details : ${user.bank_details}"
        view.tvLimit.text = "Limit : ${user.limit}"
        view.tvBrokerage.text = "Brokerage : ${user.brokerage}"
    }

}
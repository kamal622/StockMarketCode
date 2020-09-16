package com.kp.stockmarketcode.activitys.editProfile

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kamal.foodium.utils.NetworkUtils
import com.kamal.foodium.utils.hide
import com.kamal.foodium.utils.show
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.activitys.login.getColorRes
import com.kp.stockmarketcode.databinding.ActivityEditProfileBinding
import kotlinx.android.synthetic.main.network_status_view.*

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding
    private lateinit var editProfileViewModel: EditProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_profile)
        editProfileViewModel = ViewModelProvider(this).get(EditProfileViewModel::class.java)


        binding.viewModel = editProfileViewModel
        binding.lifecycleOwner = this

        editProfileViewModel.message.observe(this, Observer {
            it.getContentIfNotHandled()?.let {
                if (it.equals("Update Successfully")) {
                    setResult(1)
                    finish()
                }

            }
        })

        handleNetworkChanges()
    }

    fun handleNetworkChanges() {
        NetworkUtils.getNetworkLiveData(applicationContext).observe(this, Observer { isConnected ->
            if (!isConnected) {
                textViewNetworkStatus.text = getString(R.string.text_no_connectivity)
                networkStatusLayout.apply {
                    show()
                    setBackgroundColor(getColorRes(R.color.colorStatusNotConnected))
                }
            } else {
                textViewNetworkStatus.text = getString(R.string.text_connectivity)
                networkStatusLayout.apply {
                    setBackgroundColor(getColorRes(R.color.colorStatusConnected))
                    animate()
                        .alpha(1f)
                        .setStartDelay(ANIMATION_DURATION)
                        .setDuration(ANIMATION_DURATION)
                        .setListener(object : AnimatorListenerAdapter() {
                            override fun onAnimationEnd(animation: Animator) {
                                hide()
                            }
                        })
                }
            }
        })

    }

    companion object {
        const val ANIMATION_DURATION = 1000.toLong()
    }

}
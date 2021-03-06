package com.appslokal.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appslokal.app.R
import com.appslokal.app.databinding.ActivityMainBinding
import com.appslokal.app.ui.auth.AppsLokalAuth
import com.appslokal.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            AppsLokalAuth.logout(this) {
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}
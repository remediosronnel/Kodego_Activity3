package com.remedios.activity3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.remedios.activity3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        val btnLogin = binding.button1
        val edUsername = binding.accountName
        val edPassword = binding.password
        val textView = binding.textview4
        val btnRegister = binding.btnRegister

        val sharePreference = getSharedPreferences("REMEDY", Context.MODE_PRIVATE)
        val getUsername = sharePreference.getString("USERNAME", "")
        val getPassword = sharePreference.getString("PASSWORD", "")

        if ((getUsername != "") && (getPassword != "")){
            val i = Intent(this, ProcessActivity::class.java)
            startActivity(i)
        }else{

        }
        btnLogin.setOnClickListener {
            val username = edUsername.text.toString()
            val password = edPassword.text.toString()
            val editor = sharePreference.edit()

            editor.putString("USERNAME", username)
            editor.putString("PASSWORD", password)
            editor.apply()

            val i = Intent(this, ProcessActivity::class.java)
            startActivity(i)
        }


        textView.setOnClickListener {
            val i = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(i)
        }
        btnRegister.setOnClickListener {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }

    }

}
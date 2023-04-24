package com.remedios.activity3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.remedios.activity3.databinding.ForgotFragmentBinding

class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var binding:ForgotFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ForgotFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Forgot Password"

        binding.button3.setOnClickListener {
        val message = "Message sent to!!"

            binding.ViewText.tag = message

        }

    }
}
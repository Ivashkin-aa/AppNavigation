package com.example.appnavigation.intentflags

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appnavigation.databinding.SecondActvBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = SecondActvBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            finish()
        }
        binding.button2.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        binding.buttonAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
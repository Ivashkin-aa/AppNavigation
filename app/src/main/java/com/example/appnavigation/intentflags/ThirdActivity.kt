package com.example.appnavigation.intentflags

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appnavigation.databinding.ThirdActvBinding

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ThirdActvBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java).addFlags(FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            finish()
        }

        binding.buttonAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }

}
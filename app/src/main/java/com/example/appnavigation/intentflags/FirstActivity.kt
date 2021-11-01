package com.example.appnavigation.intentflags

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NO_HISTORY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appnavigation.databinding.FirstActvBinding

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FirstActvBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).addFlags(FLAG_ACTIVITY_NO_HISTORY)
            startActivity(intent)
        }
        binding.buttonAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }

}
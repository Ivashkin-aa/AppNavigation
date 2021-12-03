package com.example.appnavigation.startactivityforresult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appnavigation.databinding.AboutActvBinding

class AboutActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = AboutActvBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

}
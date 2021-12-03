package com.example.appnavigation.intentflags

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import com.example.appnavigation.databinding.ThirdActvBinding
import com.example.appnavigation.startactivityforresult.AbstractActivity

class ThirdActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ThirdActvBinding.inflate(layoutInflater)
        binding.navView.setNavigationItemSelectedListener(this)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java).addFlags(FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        binding.bnToSecond.setOnClickListener {
            finish()
        }

    }

}
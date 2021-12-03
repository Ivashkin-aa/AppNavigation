package com.example.appnavigation.intentflags

import android.content.Intent
import android.os.Bundle
import com.example.appnavigation.databinding.SecondActvBinding
import com.example.appnavigation.startactivityforresult.AbstractActivity

class SecondActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = SecondActvBinding.inflate(layoutInflater)
        binding.navView.setNavigationItemSelectedListener(this)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener {
            finish()
        }
        binding.bnToThird.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

}
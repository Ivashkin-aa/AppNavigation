package com.example.appnavigation.startactivityforresult

import android.os.Bundle
import com.example.appnavigation.databinding.ThirdActvBinding

class ThirdActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ThirdActvBinding.inflate(layoutInflater)
        binding.navView.setNavigationItemSelectedListener(this)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener {
            setResult(1)
            finish()
        }
        binding.bnToSecond.setOnClickListener {
            setResult(2)
            finish()
        }
    }

}
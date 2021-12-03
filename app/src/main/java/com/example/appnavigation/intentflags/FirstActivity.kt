package com.example.appnavigation.intentflags

import android.content.Intent
import android.os.Bundle
import com.example.appnavigation.databinding.FirstActvBinding
import com.example.appnavigation.startactivityforresult.AbstractActivity

class FirstActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FirstActvBinding.inflate(layoutInflater)
        binding.navView.setNavigationItemSelectedListener(this)
        setContentView(binding.root)

        binding.bnToSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
                //task with special flag
                //.addFlags(FLAG_ACTIVITY_NO_HISTORY)
            startActivity(intent)
        }
    }


}
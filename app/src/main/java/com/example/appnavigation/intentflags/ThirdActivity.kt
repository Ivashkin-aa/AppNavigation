package com.example.appnavigation.intentflags

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.appnavigation.R
import com.example.appnavigation.databinding.ThirdActvBinding
import com.google.android.material.navigation.NavigationView

class ThirdActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

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

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.activityAbout -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
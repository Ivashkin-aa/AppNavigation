package com.example.appnavigation.intentflags

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NO_HISTORY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.appnavigation.R
import com.example.appnavigation.databinding.FirstActvBinding
import com.google.android.material.navigation.NavigationView

class FirstActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

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
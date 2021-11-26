package com.example.appnavigation.navgrap


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.appnavigation.R
import com.example.appnavigation.databinding.ThirdActvBinding
import com.google.android.material.navigation.NavigationView

class ThirdFragment : Fragment(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = ThirdActvBinding.inflate(layoutInflater)
        binding.navView.setNavigationItemSelectedListener(this)
        val controller = this.findNavController()

        binding.bnToFirst.setOnClickListener {
            controller.navigate(R.id.action_thirdFragment_to_firstFragment)
        }
        binding.bnToSecond.setOnClickListener {
            controller.navigate(R.id.action_thirdFragment_to_secondFragment)
        }

        return binding.root
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.activityAbout -> {
                val intent = Intent(activity, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
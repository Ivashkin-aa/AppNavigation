package com.example.appnavigation.navgrap


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.R
import com.example.appnavigation.databinding.FirstActvBinding
import com.google.android.material.navigation.NavigationView


class FirstFragment : Fragment(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FirstActvBinding.inflate(layoutInflater)
        binding.navView.setNavigationItemSelectedListener(this)
        val controller = this.findNavController()

        binding.bnToSecond.setOnClickListener {
            controller.navigate(R.id.action_firstFragment_to_secondFragment)
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




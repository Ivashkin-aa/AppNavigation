package com.example.appnavigation.navgrap


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.R
import com.example.appnavigation.databinding.ThirdActvBinding

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = ThirdActvBinding.inflate(layoutInflater)
        val controller = this.findNavController()

        binding.bnToFirst.setOnClickListener {
            controller.navigate(R.id.action_thirdFragment_to_firstFragment)
        }
        binding.bnToSecond.setOnClickListener {
            controller.navigate(R.id.action_thirdFragment_to_secondFragment)
        }
        binding.buttonAbout.setOnClickListener {
            controller.navigate(R.id.action_thirdFragment_to_aboutActivity)
        }

        return binding.root
    }

}
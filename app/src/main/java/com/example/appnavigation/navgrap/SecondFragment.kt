package com.example.appnavigation.navgrap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.R
import com.example.appnavigation.databinding.SecondActvBinding

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = SecondActvBinding.inflate(layoutInflater)
        val controller = this.findNavController()

        binding.button.setOnClickListener {
            controller.navigate(R.id.action_secondFragment_to_firstFragment)
        }
        binding.button2.setOnClickListener {
            controller.navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        binding.buttonAbout.setOnClickListener {
            controller.navigate(R.id.action_secondFragment_to_aboutActivity)
        }

        return binding.root
    }

}
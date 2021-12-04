package com.example.appnavigation.navgrap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.R

class Fragment1 : Fragments(R.layout.fragment1)
class Fragment2 : Fragments(R.layout.fragment2)
class Fragment3 : Fragments(R.layout.fragment3)

abstract class Fragments(private val fragment: Int) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val layout = inflater.inflate(fragment, container, false)
        val controller = this.findNavController()

        layout.findViewById<View>(R.id.bnToSecond)?.setOnClickListener {
            controller.navigate(R.id.to_SecondFragment)
        }
        layout.findViewById<View>(R.id.bnToThird)?.setOnClickListener {
            controller.navigate(R.id.to_ThirdFragment)
        }
        layout.findViewById<View>(R.id.bnToFirst)?.setOnClickListener {
            controller.navigate(R.id.to_FirstFragment)
        }

        return layout
    }
}
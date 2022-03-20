package com.example.navapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_fragment, container, false)
        val button2:Button = view.findViewById(R.id.button2)
        button2.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        val button3:Button = view.findViewById(R.id.button3)
        button3.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        val button4:Button = view.findViewById(R.id.button4)
        button4.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_firstFragment_to_fourFragment)
        }
        return view
    }
}
package com.example.navapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.second_fragment, container, false)
        val button2:Button = view.findViewById(R.id.button5)
        button2.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_secondFragment_to_fiveFragment)
        }
        val button3:Button = view.findViewById(R.id.button6)
        button3.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_secondFragment_to_sixFragment)
        }
        return view
    }
}
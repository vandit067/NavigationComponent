package com.sample.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_screen1.button1
import kotlinx.android.synthetic.main.fragment_screen1.button2

class Screen1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button1.setOnClickListener{
            findNavController().navigate(R.id.action_screen1Fragment_to_screen4Fragment)
        }

        button2.setOnClickListener{
            val direction = Screen1FragmentDirections.actionScreen1FragmentToScreen2Fragment(name = "test", id = 300)
            findNavController().navigate(direction)
        }
    }
}

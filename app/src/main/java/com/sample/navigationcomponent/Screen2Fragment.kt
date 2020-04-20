package com.sample.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_screen2.button

class Screen2Fragment : Fragment() {

    private val args: Screen2FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Snackbar.make(view, "Bundle value for name is : ${args.name} and id is : ${args.id}", Snackbar.LENGTH_LONG).show()
        button.setOnClickListener {
            val direction = Screen2FragmentDirections.actionScreen2FragmentToScreen3Frgament(id = 100)
            Navigation.findNavController(it).navigate(direction)
        }
    }

}

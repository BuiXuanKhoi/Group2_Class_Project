package com.example.week2_group2.Fragment

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentOnboarding3Binding

class Onboarding_3 : Fragment() {

    lateinit var onboard3Bind : FragmentOnboarding3Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        onboard3Bind = FragmentOnboarding3Binding.inflate(inflater,container,false)
        return onboard3Bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onboard3Bind.button6.setOnClickListener {
            var editor: SharedPreferences.Editor = requireContext().getSharedPreferences("NewPrefences", Context.MODE_PRIVATE).edit()
            editor.putBoolean("On3",true)
            editor.apply()
            val onboard3nav = findNavController()
            onboard3nav.navigate(R.id.action_onboarding_3_to_signupFragment2)
        }
    }

}
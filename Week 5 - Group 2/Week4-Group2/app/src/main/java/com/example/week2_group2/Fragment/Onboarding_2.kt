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
import com.example.week2_group2.databinding.FragmentOnboarding2Binding

class Onboarding_2 : Fragment() {

    lateinit var onboard2Bind : FragmentOnboarding2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        onboard2Bind = FragmentOnboarding2Binding.inflate(inflater,container,false)
        return onboard2Bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onboard2Bind.button4.setOnClickListener {
            val onboard2nav = findNavController()
            onboard2nav.navigate(R.id.action_onboarding_2_to_onboarding_3)
        }
    }


}
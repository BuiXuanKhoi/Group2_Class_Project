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
import com.example.week2_group2.databinding.FragmentOnboarding1Binding


class Onboarding_1 : Fragment() {

    lateinit var onboardBind : FragmentOnboarding1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        onboardBind = FragmentOnboarding1Binding.inflate(inflater,container,false)
        return onboardBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onboardBind.button5.setOnClickListener {
            var editor: SharedPreferences.Editor = requireContext().getSharedPreferences("NewPrefences",Context.MODE_PRIVATE).edit()
            editor.putBoolean("On1",true)
            editor.apply()
            val nav = findNavController()
            nav.navigate(R.id.action_onboarding_1_to_onboarding_2)
        }


    }


}
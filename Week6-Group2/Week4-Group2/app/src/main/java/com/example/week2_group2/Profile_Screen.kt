package com.example.week2_group2

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.week2_group2.Data.state
import com.example.week2_group2.databinding.FragmentProfileScreenBinding


class Profile_Screen : Fragment() {

    lateinit var profileBind : FragmentProfileScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileBind = FragmentProfileScreenBinding.inflate(inflater,container,false)
        return profileBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val displayInfo = state.getLoginInfo(requireContext())

        profileBind.TXTEmail.text = displayInfo.email
        profileBind.TXTPass.text = displayInfo.pass
        profileBind.TXTName.text = displayInfo.name



        profileBind.button.setOnClickListener {
            state.saveLoginInfo("","",requireContext(),false)
            findNavController().navigate(R.id.action_profile_Screen_to_loginFragment)
        }
    }


}
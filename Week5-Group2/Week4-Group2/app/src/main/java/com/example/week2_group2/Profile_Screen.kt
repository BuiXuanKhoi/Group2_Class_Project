package com.example.week2_group2

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.week2_group2.Data.UserInfo
import com.example.week2_group2.Data.state
import com.example.week2_group2.databinding.FragmentProfileScreenBinding
import com.example.week2_group2.databinding.FragmentProfileScreenBindingImpl


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
        profileBind.TXTEmail.text = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getString("loginEmail","")!!
        profileBind.TXTPass.text = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getString("loginPass","")!!
        profileBind.TXTName.text = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getString("loginName","")!!



        profileBind.button.setOnClickListener {
            val editor : SharedPreferences.Editor = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.edit()
            editor.putBoolean("login",false)
            editor.apply()
            findNavController().navigate(R.id.action_profile_Screen_to_loginFragment)
        }
    }


}
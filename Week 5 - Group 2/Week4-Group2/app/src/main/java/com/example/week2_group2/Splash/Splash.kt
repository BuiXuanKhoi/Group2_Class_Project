package com.example.week2_group2.Splash

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.week2_group2.Data.UserInfo
import com.example.week2_group2.Data.state
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentSplashBinding


class Splash : Fragment() {

    lateinit var splashBind : FragmentSplashBinding
    lateinit var splashView : SplashVM


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        splashBind = FragmentSplashBinding.inflate(inflater,container,false)
        return splashBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        splashView = ViewModelProvider(this).get(SplashVM::class.java)
        splashBind.splashId.setOnClickListener {
            splashView.checkLoginState(requireContext())
        }
        isLogin()
    }


    fun isLogin(){
        splashView.passLogin.observe(viewLifecycleOwner){Login->
            if(Login){
                    UserInfo.loadUserInfo(requireContext()) // Nếu trạng thái login đã được set, load data vào list
                findNavController().navigate(R.id.action_splash_to_home_Screen)
            }
            else{
                findNavController().navigate(R.id.action_splash_to_welcome2)
            }
        }

    }








}
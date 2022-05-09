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
            state.loginState = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getBoolean("login",false)
            splashView.checkLoginState()
        }
        isLogin()
    }


    fun isLogin(){
        splashView.passLogin.observe(viewLifecycleOwner){Login->
            if(Login){
                    loadUserInfo() // Nếu trạng thái login đã được set, load data vào list
                findNavController().navigate(R.id.action_splash_to_home_Screen)
            }
            else{
                findNavController().navigate(R.id.action_splash_to_welcome2)
            }
        }

    }



    fun loadUserInfo(){


        val position = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getInt("position",0) // Sô phần tử có trong Shared Prefences

        val newposition = UserInfo.listOfUser.size

        for(i in newposition ..position-1){

            val name = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getString("name_"+i,null)!!
            val email = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getString("email_"+i,null)!!
            val pass = context?.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getString("pass_"+i,null)!!


            UserInfo.addNewUser(name,email,pass)

        }



    }




}
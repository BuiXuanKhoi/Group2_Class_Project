package com.example.week2_group2.Login

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.PackageManagerCompat
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.week2_group2.Data.UserInfo
import com.example.week2_group2.Data.state
import com.example.week2_group2.Fragment.ManageVM
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    lateinit var bindingLogin : FragmentLoginBinding
    lateinit var  viewlog : LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingLogin = FragmentLoginBinding.inflate(inflater,container,false)
        return bindingLogin.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewlog = ViewModelProvider(this).get(LoginViewModel::class.java)
        bindingLogin.btnLogin.setOnClickListener {

            val emailLog = bindingLogin.emailLogin2.text.toString().trim()
            val passLog = bindingLogin.passLogin2.text.toString().trim()

            viewlog.CheckEmailAndPassword(emailLog,passLog)
        }

        bindingLogin.btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment2)
        }

        loginSuccess()
        loginFail()
    }

    fun loginSuccess(){
        viewlog.right.observe(viewLifecycleOwner){success->
            if(success){
                val emailLog: String = bindingLogin.emailLogin2.text.toString().trim()
                val passLog: String = bindingLogin.passLogin2.text.toString().trim()

                state.userEmail = emailLog
                state.userPass = passLog
                state.userName = UserInfo.searchNameInfo(emailLog) // Vì chưa chắc sẽ dùng tài khoản Sign Up để đăng nhập, cho nên những thông tin đăng nhập của User sẽ được set khi đăng nhập

                var editor: SharedPreferences.Editor = requireContext().getSharedPreferences("NewPrefences", Context.MODE_PRIVATE).edit()
                editor.putBoolean("login",true)
                editor.putString("loginEmail",state.userEmail)
                editor.putString("loginName",state.userName)
                editor.putString("loginPass",state.userPass)

                editor.apply()
                findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
            }
        }
    }

    fun loginFail(){
        viewlog.wrong.observe(viewLifecycleOwner){fail->
            Toast.makeText(context,fail,Toast.LENGTH_SHORT).show()
        }
    }




}
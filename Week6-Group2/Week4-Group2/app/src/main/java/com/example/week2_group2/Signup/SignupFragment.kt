package com.example.week2_group2.Signup

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.week2_group2.Data.User
import com.example.week2_group2.Data.UserInfo
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentSignupBinding


class SignupFragment : Fragment(R.layout.fragment_signup) {

    lateinit var bindingSignup : FragmentSignupBinding
    lateinit var signView: SignUpViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        signView = ViewModelProvider(this).get(SignUpViewModel::class.java)
        bindingSignup = FragmentSignupBinding.inflate(inflater,container,false)
        return bindingSignup.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signView = ViewModelProvider(this).get(SignUpViewModel::class.java)
        bindingSignup.btnSignup.setOnClickListener {
            val email = bindingSignup.email.text.toString().trim()
            val pass = bindingSignup.pass.text.toString().trim()
            signView.CheckEmailAndPassword(email,pass)
        }
        bindingSignup.alreadySign.setOnClickListener {
            UserInfo.loadUserInfo(requireContext()) // Nếu chọn không đăng ký info, load data cũ vào list và nhảy tới màn hình login
            findNavController().navigate(R.id.action_signupFragment2_to_loginFragment)
        }
        successEvent()
        errorEvent()
    }





    fun successEvent(){  // Nếu đăng ký thành công, load data mới thêm vào file data và load cả file data vào list và nhảy tới màn hình login
        signView.successNotice.observe(viewLifecycleOwner){Success->
            if(Success){
                val email = bindingSignup.email.text.toString().trim()
                val pass = bindingSignup.pass.text.toString().trim()
                val name = bindingSignup.name.text.toString().trim()
                UserInfo.saveNewUser(name,email,pass,requireContext())
                UserInfo.loadUserInfo(requireContext())
                findNavController().navigate(R.id.action_signupFragment2_to_loginFragment)
            }
        }
    }

    private fun errorEvent(){
        signView.notice.observe(viewLifecycleOwner){fail->
            Toast.makeText(context,fail,Toast.LENGTH_SHORT).show()
        }
    }


   // Class load từng phần tử vào trong Shared Prefences



    // size = 0 => phần tử số 0, size = 1 => phần tử số 1

    // Class load các phần tử ra khỏi Shared Prefences để ghi vào list data



    // Bằng cách này, dữ liệu mỗi lần user sign up đều sẽ được lưu trữ lại mà không cần thiết phải sign up trở lại mỗi lần mở lại app


}
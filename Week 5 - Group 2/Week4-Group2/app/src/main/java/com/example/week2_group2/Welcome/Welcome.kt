package com.example.week2_group2.Welcome

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.week2_group2.Data.state
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentWelcomeBinding


class Welcome : Fragment() {

    lateinit var welcomeBind : FragmentWelcomeBinding
    lateinit var welcomeView : WelcomeVM


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        welcomeBind = FragmentWelcomeBinding.inflate(inflater,container,false)

        return welcomeBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        welcomeView = ViewModelProvider(this).get(WelcomeVM::class.java)
        welcomeBind.imageskip2.setOnClickListener {
            welcomeView.checkPassed(requireContext())
        }
        ifWePassed()
    }

    fun ifWePassed(){
        welcomeView.successNotice.observe(viewLifecycleOwner){Pass->
            if(Pass){
                findNavController().navigate(R.id.action_welcome2_to_signupFragment2)
            }
            else{

                findNavController().navigate(R.id.action_welcome2_to_onboarding_1)

            }
        }
    }



}
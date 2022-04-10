package com.example.week2_group2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.week2_group2.databinding.FragmentChoiceBinding


class Choice : Fragment() {
    lateinit var choiceBind : FragmentChoiceBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        choiceBind = FragmentChoiceBinding.inflate(inflater,container,false)
        return choiceBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        choiceBind.mvMenu.setOnClickListener {
            //findNavController().navigate(R.id.action_choice_to_welcome2)
        }
    }


}
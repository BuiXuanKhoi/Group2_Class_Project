package com.example.week2_group2.Fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ManageVM : ViewModel() {

    private var _successMessage : MutableLiveData<Boolean> = MutableLiveData()
    val successMessage : LiveData<Boolean>
    get() = _successMessage

    private var _errorMessage : MutableLiveData<String> = MutableLiveData()
    val errorMessage : LiveData<String>
    get() = _errorMessage

    fun CheckEmailAndPasswordValid(email: String,pass: String){

    }

    fun CheckEmailAndPasswordCorrect(email: String,pass: String,OldEmail:String,OldPass:String){

    }
}
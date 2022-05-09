package com.example.week2_group2.Splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.week2_group2.Data.state

class SplashVM: ViewModel() {

    private var _passLogin : MutableLiveData<Boolean> = MutableLiveData()
    val passLogin : LiveData<Boolean>
        get() = _passLogin

    fun checkLoginState(){
        if(state.loginState){
            return _passLogin.postValue(true)
        }
        else{
            return _passLogin.postValue(false)
        }
    }
}
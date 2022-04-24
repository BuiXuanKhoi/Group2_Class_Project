package com.example.week2_group2.Welcome

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.week2_group2.Data.state

class WelcomeVM: ViewModel() {

    private var _successNotice : MutableLiveData<Boolean> = MutableLiveData()
    val successNotice : LiveData<Boolean>
        get() = _successNotice


    //Function có nhiệm vụ đưa ra kết quả đúng sai dựa trên việc đã vượt qua Onboarding hay chưa
    fun checkPassed(context: Context){

        if(state.checkOnboard(context)){
            return _successNotice.postValue(true)
        }
        else{
            return _successNotice.postValue(false)
        }
    }
}
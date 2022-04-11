package com.example.week2_group2.Data

import android.content.Context
import android.content.SharedPreferences


object state{


        // Function có nhiệm vụ check xem đã login hay chưa

        fun checkLogin(context: Context) : Boolean{
                val loginState = context.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE)!!.getBoolean("login",false)
                return loginState
        }

        //Function có nhiệm vụ check xem đã vượt qua 3 lần Onboard hay chưa

        fun checkOnboard(context: Context): Boolean{
                val On = context.getSharedPreferences("NewPrefences", Context.MODE_PRIVATE)!!.getBoolean("On3",false)
                return On
        }

        // Function có tác dụng lưu những thông tin về User login sau khi login thành công

        fun saveLoginInfo(email:String,pass:String, context: Context,loginState: Boolean){

               val loginUserInfo =  UserInfo.searchEmailInfo(email)

                var editor: SharedPreferences.Editor = context.getSharedPreferences("NewPrefences", Context.MODE_PRIVATE).edit()

                editor.putBoolean("login",loginState)
                editor.putString("loginEmail",loginUserInfo.email)
                editor.putString("loginName",loginUserInfo.name)
                editor.putString("loginPass",loginUserInfo.pass)
                editor.putInt("LoginID",loginUserInfo.id)

                editor.apply()
        }

        // Function lấy những thông tin về User đã login

        fun getLoginInfo(context: Context): User{

        val loginName = context.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE).getString("loginName","")

        val loginEmail = context.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE).getString("loginEmail","")

        val loginPass = context.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE).getString("loginPass","")

        val loginID = context.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE).getInt("loginID",0)

        val loginUser = User(loginID,loginName,loginEmail,loginPass)

        return loginUser

    }



}


package com.example.week2_group2.Data

import android.content.Context
import android.content.SharedPreferences


object UserInfo{

    var listOfUser = mutableListOf<User>()


    // Function có nhiệm vụ trả về tài khoản User đúng email cần tìm

    fun searchEmailInfo(oldemail: String): User { // EMAIL NHẬP TỪ TEXT

        var trueEmail = User(0,null,null,null)
        val position = listOfUser.size-1
        for(i in 0..position) {
            val searchForUser = listOfUser.elementAt(i) // Lấy phần tử ở vị trí i ra
            val compareToUser = searchForUser.copy(email = oldemail) // Tạo bản sao phần tử ở vị trí i với email khác
            if(compareToUser == searchForUser){        // So sánh phần tử mới và cũ để xác định email là khác hay giống
                trueEmail = compareToUser // Nếu như giống nhau về email, lấy ra phần tử đó
            }
        }
        return trueEmail // Trả về phần tử có email chính xác, chính là account của người dùng
    }

     // Function có nhiệm vụ kiểm tra password có đúng với tài khoản có email chính xác

    fun searchPassInfo(oldemail: String,oldpass : String): Boolean{

        val searchForPass = searchEmailInfo(oldemail) // Lấy ra phần tử có email trùng
        val compareToPass = searchForPass.copy(pass = oldpass) // Tạo bản sao với pass khác nhau
        return searchForPass == compareToPass // Trả về giá trị liệu chúng có bằng nhau
    }


    // Function có nhiệm vụ trả về tên của User trong tài khoản đúng với email


    fun searchNameInfo(oldemail: String ): String{
        val searchForName = searchEmailInfo(oldemail)
        return searchForName.name!!
    }


    // Function có nhiệm vụ thêm tài khoản User mới vào


    fun addNewUser(name:String,email:String,pass:String){
        val id = listOfUser.size + 1
        listOfUser.add(User(id,name,email,pass))

    }


    // Function có nhiệm vụ lấy ra danh sách tài khoản User

    fun getData(): MutableList<User>{
        return listOfUser
    }


    //Function làm nhiệm vụ load thông tin user từ Shared Prefences (NewPrefences) vào list user

    fun loadUserInfo(context: Context){


        val position = context.getSharedPreferences("NewPrefences", Context.MODE_PRIVATE).getInt("position",0) // Sô phần tử có trong Shared Prefences

        val newposition = UserInfo.listOfUser.size

        for(i in newposition ..position-1){

            val name = context.getSharedPreferences("NewPrefences", Context.MODE_PRIVATE).getString("name_"+i,null)!!
            val email = context.getSharedPreferences("NewPrefences", Context.MODE_PRIVATE).getString("email_"+i,null)!!
            val pass = context.getSharedPreferences("NewPrefences", Context.MODE_PRIVATE).getString("pass_"+i,null)!!


           addNewUser(name,email,pass)

        }
    }


   // Function làm nhiệm vụ thêm thông tin user vào Shared Prefences : NewPrefences

    fun saveNewUser(name:String,email:String,pass:String, context: Context){

        var editor: SharedPreferences.Editor = context.getSharedPreferences("NewPrefences", Context.MODE_PRIVATE).edit()

        var position = context.getSharedPreferences("NewPrefences",Context.MODE_PRIVATE).getInt("position",0) // position là vị trí hiện tại của phần tử trong Shared Prefences, cũng như là 1 biến count đếm số phần tử

        editor.putString("name_"+position,name)
        editor.putString("email_"+position,email)
        editor.putString("pass_"+position,pass)

        position++

        editor.putInt("position", position)

        editor.apply()

    }


}




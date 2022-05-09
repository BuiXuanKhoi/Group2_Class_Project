package com.example.week2_group2.Data




object UserInfo{

    var listOfUser = mutableListOf<User>()


    // Class có nhiệm vụ trả về tài khoản User đúng email cần tìm

    fun searchEmailInfo(oldemail: String): User { // EMAIL NHẬP TỪ TEXT

        var trueEmail = User(null,null,null,null)
        for(i in 0..(listOfUser.size-1)) {
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
}




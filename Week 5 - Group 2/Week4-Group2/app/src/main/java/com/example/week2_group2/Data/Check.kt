package com.example.week2_group2.Data

class Check {

    companion object{
        fun EmailValidCheck(MailCheck: String): Boolean {
            if(MailCheck.length>10){
                val MailCheck1 = MailCheck.substring(MailCheck.length-10,MailCheck.length)
                return MailCheck1 == "@gmail.com"
            }
            else return false
        }

        fun PasswordValidCheck(PassCheck: String): Boolean{
            var num = 0
            var spec = 0
            var normal = 0
            var Alpha = 0
            var SpecChar = arrayOf('!','@','#','$','%','^','&','*','(',')')
            var x = 0
            while(x<PassCheck.length){
                if(PassCheck[x] in 'A'..'Z') Alpha++
                else if(PassCheck[x] in 'a'..'z') normal++
                else if(PassCheck[x] in '0'..'9') num++
                else if(PassCheck[x] in SpecChar) spec++
                x++
            }
            return PassCheck.length >8 && Alpha>=1&&normal>=1&&num>=1&&spec>=1
        } // Hàm check password có đầy đủ ký tự đề cập

        fun CompareToValidMail(email: String): Boolean{
            return !(UserInfo.searchEmailInfo(email) == User(0,null,null,null))
        } // Hàm so sánh email đăng nhập và email trong kho dữ liệu

        fun CompareToValidPass(email: String,password: String): Boolean{
            return UserInfo.searchPassInfo(email,password)
        } // Hàm so sánh password đăng nhập và password trong kho dữ liệu
    }
}
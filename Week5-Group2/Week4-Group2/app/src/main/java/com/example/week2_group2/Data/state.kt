package com.example.week2_group2.Data

import android.content.Context

object state{

        var On : Boolean = false // Thuộc tính kiểm tra liệu đã qua các Onboarding 1, Onboarding 2, Onboarding 3 hay chưa
        var loginState: Boolean = false // Thuộc tính kiểm tra đã đăng nhập tài khoản hay chưa
        var userEmail: String ="" // Thuộc tính lưu trữ email của tài khoản đang đăng nhập vào ứng dụng
        var userPass: String ="" // Thuộc tính lưu trữ password của tài khoản đang đăng nhập vào ứng dụng
        var userName: String = "" // Thuộc tính lưu trữ tên của tài khoản đang đăng nhập vào ứng dụng

}
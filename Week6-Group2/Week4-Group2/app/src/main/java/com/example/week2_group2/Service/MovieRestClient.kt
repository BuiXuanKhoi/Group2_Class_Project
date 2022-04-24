package com.example.week2_group2.Service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieRestClient {

    private var _api: MovieAPI

    val api: MovieAPI
        get() = _api

    init {
        _api = createMovieDB()
    }

    companion object {
        private var mInstance: MovieRestClient? = null

        fun getInstance() = mInstance ?: synchronized(this) {
            mInstance ?: MovieRestClient().also { mInstance = it }
        }
    }

    fun createMovieDB(): MovieAPI {
        val httpClient = OkHttpClient.Builder()
            .build()


    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient)
        .build()

    return retrofit.create(MovieAPI::class.java)
}



}
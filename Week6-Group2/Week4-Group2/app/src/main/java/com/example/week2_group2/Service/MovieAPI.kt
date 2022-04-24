package com.example.week2_group2.Service

import com.example.week2_group2.Data.Movie.StoreMovie
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {


    @GET("movie/now_playing")
    suspend fun listNowPlayMovies(
        @Query("language") language: String,
        @Query("page") page: Int,
        @Query("api_key") key : String
    ): StoreMovie

    //    ///movie/upcoming
    @GET("movie/top_rated")
    suspend fun listTopRatedMovies(
        @Query("language") language: String,
        @Query("page") page: Int,
        @Query("api_key") key : String
    ): StoreMovie
}
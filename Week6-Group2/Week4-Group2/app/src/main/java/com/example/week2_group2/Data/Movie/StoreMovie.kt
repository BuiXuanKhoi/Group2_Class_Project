package com.example.week2_group2.Data.Movie

import com.example.week2_group2.Data.Movie.Dates
import com.example.week2_group2.Data.Movie.MovieInfo

data class StoreMovie(
    val dates: Dates,
    val page: Long,
    val results: List<MovieInfo>,
    val totalPages: Long,
    val totalResults: Long
)

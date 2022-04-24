package com.example.week2_group2.Data.Movie

import com.google.gson.annotations.SerializedName

data class MovieInfo (
    val adult: Boolean? = null,
    val backdropPath: String?,
    val genreIDS: List<Long>,
    val id: Long,
    val originalLanguage: OriginalLanguage,
    val originalTitle: String,
    val overview: String? = null,
    val popularity: Double,

    @SerializedName("poster_path")
    val posterPath: String? = null,
    val releaseDate: String,
    val title: String? = null,
    val video: Boolean,
    val voteAverage: Double,
    val voteCount: Long
)

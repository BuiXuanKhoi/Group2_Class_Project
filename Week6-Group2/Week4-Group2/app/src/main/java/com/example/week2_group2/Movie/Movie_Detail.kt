package com.example.week2_group2.Movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.week2_group2.Data.Movie.MovieDetail
import com.example.week2_group2.Data.Movie.StoreMovie
import com.example.week2_group2.Data.state
import com.example.week2_group2.Menu.MovieAdapter
import com.example.week2_group2.R
import com.example.week2_group2.Service.MovieRestClient
import com.example.week2_group2.databinding.FragmentMovieDetailBinding

class Movie_Detail : Fragment() {

    lateinit var detailBinding: FragmentMovieDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    // get the item at the clicked position

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        detailBinding = FragmentMovieDetailBinding.inflate(inflater,container,false)
        settingDisplay()
        return detailBinding.root
    }

    fun settingDisplay(){
        detailBinding.overView.text = MovieDetail.overview
        detailBinding.releaseDay.text = MovieDetail.releaseDay
        detailBinding.titleDetail.text = MovieDetail.name
        detailBinding.voteArage.text = MovieDetail.voteAverage.toString().trim()

        val urlLink = "https://image.tmdb.org/t/p/w500${MovieDetail.posterPath}"
        Glide.with(requireContext()).load(urlLink).into(detailBinding.poster)
    }

    }




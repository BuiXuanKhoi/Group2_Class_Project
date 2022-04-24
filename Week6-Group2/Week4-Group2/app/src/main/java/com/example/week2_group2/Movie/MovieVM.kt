package com.example.week2_group2.Movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.example.week2_group2.Data.Movie.MovieInfo
import com.example.week2_group2.Service.MovieRestClient
import kotlinx.coroutines.launch

class MovieVM: ViewModel() {

    var _movieData : MutableLiveData<List<MovieInfo>> = MutableLiveData<List<MovieInfo>>()
    val movieData: LiveData<List<MovieInfo>>
        get() = _movieData

    fun getNowPlaying(){
        viewModelScope.launch {
            val movieResp = MovieRestClient.getInstance().api.listNowPlayMovies(
                language ="en-US",
                page = 1,
                key = "7519cb3f829ecd53bd9b7007076dbe23"
            )
            _movieData.postValue(movieResp.results!!)
        }

    }

    fun getTopRated(){

        viewModelScope.launch {
            val movieResp = MovieRestClient.getInstance().api.listTopRatedMovies(
                language ="en-US",
                page = 1,
                key = "7519cb3f829ecd53bd9b7007076dbe23"
            )
            _movieData.postValue(movieResp.results!!)
        }

    }

}
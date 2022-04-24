package com.example.week2_group2.Menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.week2_group2.Data.Movie.MovieInfo
import com.example.week2_group2.Data.Restaurant.Info
import com.example.week2_group2.Data.Restaurant.ResInfo
import com.example.week2_group2.Service.MovieAPI
import com.example.week2_group2.Service.MovieRestClient
import kotlinx.coroutines.launch

class MenuViewModel: ViewModel() {

    var _listOfRestaurant: MutableLiveData<List<Info>> = MutableLiveData()
    val listOfRestaurant: LiveData<List<Info>>
    get() = _listOfRestaurant



    fun getDatafrom(){
        val dataStore = ResInfo.getData()
        _listOfRestaurant.postValue(dataStore)
    }


}
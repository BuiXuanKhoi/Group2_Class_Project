package com.example.week2_group2.Movie

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week2_group2.Data.Info
import com.example.week2_group2.Data.Movie.MovieDetail
import com.example.week2_group2.Data.state
import com.example.week2_group2.Menu.MovieAdapter
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentTopRatedMovieBinding


class Top_rated_movie : Fragment() {

    lateinit var topBind: FragmentTopRatedMovieBinding
    lateinit var topView: MovieVM
    lateinit var topAdapter: MovieAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        topBind = FragmentTopRatedMovieBinding.inflate(inflater,container,false)
        topView = ViewModelProvider(this).get(MovieVM::class.java)
        return topBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registTopRated()

        topAdapter = MovieAdapter()
        topBind.rcViewTopRated.layoutManager = LinearLayoutManager(context)
        topBind.rcViewTopRated.adapter = topAdapter


        settingNavigationItemClicked()

        setClickItem()
    }

    fun registTopRated(){

        topView.movieData.observe(viewLifecycleOwner){data->
            topAdapter.submitList(data)
        }
    }

    fun settingNavigationItemClicked(){

        topBind.bottomTopRated.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.movie_upcoming ->{
                    findNavController().navigate(R.id.action_top_rated_movie2_to_upcoming_movie)
                    true
                }
                R.id.food_hub ->{
                    findNavController().navigate(R.id.action_top_rated_movie2_to_home_Screen)
                    true
                }
                R.id.Profile ->{
                    findNavController().navigate(R.id.action_top_rated_movie2_to_profile_Screen)
                    true
                }

                else -> super.onOptionsItemSelected(item)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        topView.getTopRated()
    }

    fun setClickItem(){
        topAdapter.setOnItemClickListener(object: MovieAdapter.onItemClicked{
            override fun onItemClick(position: Int) {
                topView.movieData.observe(viewLifecycleOwner){top->
                    val searchForInfo = top.elementAt(position)
                        MovieDetail.name = searchForInfo.title
                        MovieDetail.overview = searchForInfo.overview
                        MovieDetail.posterPath = searchForInfo.posterPath
                        MovieDetail.releaseDay = searchForInfo.releaseDate
                        MovieDetail.voteAverage = searchForInfo.voteAverage
                }
                findNavController().navigate(R.id.action_top_rated_movie2_to_movie_Detail)
            }

        })
    }



}
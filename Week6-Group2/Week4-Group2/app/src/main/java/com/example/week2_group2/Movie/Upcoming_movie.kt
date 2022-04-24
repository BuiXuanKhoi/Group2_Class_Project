package com.example.week2_group2.Movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week2_group2.Data.Movie.MovieDetail
import com.example.week2_group2.Data.state
import com.example.week2_group2.Menu.MovieAdapter
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentUpcomingMovieBinding


class Upcoming_movie : Fragment() {

    lateinit var upcomingBind: FragmentUpcomingMovieBinding
    lateinit var upcomingView: MovieVM
    lateinit var upcomingAdapter: MovieAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        upcomingBind = FragmentUpcomingMovieBinding.inflate(inflater,container,false)

        upcomingView = ViewModelProvider(this).get(MovieVM::class.java)

        return upcomingBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registerUpcoming()


        upcomingAdapter = MovieAdapter()
        upcomingBind.rcViewUpcoming.layoutManager = LinearLayoutManager(context)
        upcomingBind.rcViewUpcoming.adapter = upcomingAdapter

        settingNavigationItemClicked()

        setClickItem()

    }

    override fun onStart() {
        super.onStart()
        upcomingView.getNowPlaying()
    }



    fun settingNavigationItemClicked(){
        upcomingBind.bottomUpcoming.setOnItemSelectedListener { item->
            when(item.itemId){

                R.id.top_rated_movie ->{
                    findNavController().navigate(R.id.action_upcoming_movie_to_top_rated_movie2)
                    true
                }

                R.id.Profile ->{
                    findNavController().navigate(R.id.action_upcoming_movie_to_profile_Screen)
                    true
                }
                R.id.food_hub ->{
                    findNavController().navigate(R.id.action_upcoming_movie_to_home_Screen)
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }

        }
    }

    fun registerUpcoming(){
        upcomingView.movieData.observe(viewLifecycleOwner){data->
            upcomingAdapter.submitList(data)
        }
    }

    fun setClickItem(){
        upcomingAdapter.setOnItemClickListener(object: MovieAdapter.onItemClicked{
            override fun onItemClick(position: Int) {
                upcomingView.movieData.observe(viewLifecycleOwner){upcoming->
                    val searchForInfo = upcoming.elementAt(position)
                    MovieDetail.name = searchForInfo.title
                    MovieDetail.overview = searchForInfo.overview
                    MovieDetail.posterPath = searchForInfo.posterPath
                    MovieDetail.releaseDay = searchForInfo.releaseDate
                    MovieDetail.voteAverage = searchForInfo.voteAverage
            }
                findNavController().navigate(R.id.action_upcoming_movie_to_movie_Detail)

        }
    })

}
}
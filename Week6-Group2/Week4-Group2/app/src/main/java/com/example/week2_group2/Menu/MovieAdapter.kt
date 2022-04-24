package com.example.week2_group2.Menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.week2_group2.Data.Movie.MovieInfo
import com.example.week2_group2.Data.state
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentMovieDetailBinding

class MovieAdapter :ListAdapter<MovieInfo, MovieAdapter.MovieViewHolder>(MovieDiffUtil())
{

    private lateinit var mlistener: onItemClicked

    fun setOnItemClickListener(listener: onItemClicked){
        mlistener = listener
    }

    interface onItemClicked{
        fun onItemClick(position: Int)
    }

    class MovieDiffUtil: DiffUtil.ItemCallback<MovieInfo>(){
        override fun areItemsTheSame(oldItem: MovieInfo, newItem: MovieInfo): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MovieInfo, newItem: MovieInfo): Boolean {
            return oldItem.id == newItem.id
        }

    }

    class MovieViewHolder(itemView: View, listener: onItemClicked): RecyclerView.ViewHolder(itemView) {

        companion object{
            fun from(parent: ViewGroup,mlistener: onItemClicked): MovieViewHolder{
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_restaurant,parent,false)
                return MovieViewHolder(view,mlistener)
            }

            }

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }


        fun findData(movie: MovieInfo){
            val titleOfMovie = itemView.findViewById<TextView>(R.id.txt_name)
            val overviewOfMovie = itemView.findViewById<TextView>(R.id.txt_address)
            val posterOfMovie = itemView.findViewById<ImageView>(R.id.avt_res)

            titleOfMovie.text = movie.title
            overviewOfMovie.text = movie.overview

            val urlLink = "https://image.tmdb.org/t/p/w500${movie.posterPath}"

            Glide.with(itemView.context).load(urlLink).into(posterOfMovie)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder.from(parent, mlistener)
    }

    override fun onBindViewHolder(holder: MovieViewHolder,position: Int) {
        val movie = getItem(position)
        holder.findData(movie)
    }


}


//Lam the nao de lay ham searchData ra ngoai va truyen vao khi Movie_Detail chay ?

// Dung interface searchData de viewmodel hoat dong ?
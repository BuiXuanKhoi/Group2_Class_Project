package com.example.week2_group2.Menu


import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week2_group2.Data.ResInfo
import com.example.week2_group2.Data.state
import com.example.week2_group2.R
import com.example.week2_group2.databinding.FragmentHomeScreenBinding

class Home_Screen : Fragment() {

    lateinit var homeBind : FragmentHomeScreenBinding
    lateinit var homeView : MenuViewModel
    lateinit var homeAdapter : MenuAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeAdapter = MenuAdapter()

        homeBind = FragmentHomeScreenBinding.inflate(inflater,container,false)
        homeBind.newRcView.layoutManager = LinearLayoutManager(context)
        homeBind.newRcView.adapter = homeAdapter

        homeView = ViewModelProvider(this).get(MenuViewModel::class.java)

        return homeBind.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerData()

        homeBind.bottNav.setOnItemSelectedListener(){item->
            when(item.itemId){

                R.id.movie_upcoming ->{
                    findNavController().navigate(R.id.action_home_Screen_to_upcoming_movie)
                    true
                }

                R.id.top_rated_movie ->{
                    findNavController().navigate(R.id.action_home_Screen_to_top_rated_movie2)
                    true
                }

                R.id.profile ->{
                    findNavController().navigate(R.id.action_home_Screen_to_profile_Screen)
                    true
                }

                else -> super.onOptionsItemSelected(item)
            }

        }




        homeAdapter.setOnItemClickListener(object: MenuAdapter.onItemClickListener{
            override fun onItemClick(postion: Int) {
                val builder = AlertDialog.Builder(context!!)
                builder.apply {
                    setMessage("Xóa chứ ? ")
                    setPositiveButton("Xóa luôn"){dialog, _->
                        ResInfo.listOfRestaurant.removeAt(postion)
                        homeBind.newRcView.adapter = homeAdapter
                        dialog.dismiss()
                    }
                    setNegativeButton("Nghĩ lại rồi"){dialog, _->
                        dialog.dismiss()
                    }
                }
                builder.show()
            }
        })


    }

    override fun onStart() {
        super.onStart()
        homeView.getDatafrom()
    }



    fun registerData(){
        homeView.listOfRestaurant.observe(viewLifecycleOwner){data->
           homeAdapter.submitList(data)
        }
    }



    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_restaurant,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.layoutnew ->{
                Toast.makeText(context,"Please choose a layout", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.grid ->{
                val layoutManager = GridLayoutManager(context,2)
                homeBind.newRcView.layoutManager = layoutManager
                homeBind.newRcView.adapter = homeAdapter
                Toast.makeText(context,"Hình ảnh sẽ không được đẹp lắm, xin phép không hiển thị",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.linear ->{
                val layoutManager = LinearLayoutManager(context)
                homeBind.newRcView.layoutManager = layoutManager
                homeBind.newRcView.adapter = homeAdapter
                true
            }
            R.id.Profile->{
                findNavController().navigate(R.id.action_home_Screen_to_profile_Screen)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}
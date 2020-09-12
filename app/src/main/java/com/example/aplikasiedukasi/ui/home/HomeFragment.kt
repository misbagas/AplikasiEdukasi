package com.example.aplikasiedukasi.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.ActivityNavigator
import com.example.aplikasiedukasi.R
import com.example.aplikasiedukasi.intentAndroidDeveloper.ActivityAndroidDeveloper
import com.example.aplikasiedukasi.intentCyberSecurity.ActivityCyberSecurity
import com.example.aplikasiedukasi.intentLearnDatabase.ActivityLearnDataBase
import com.example.aplikasiedukasi.intentWebDeveloper.ActivityWebDeveloper
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {


    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)


        homeViewModel.text.observe(viewLifecycleOwner, Observer {

        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonAdroid.setOnClickListener {
            val intent = Intent(activity, ActivityAndroidDeveloper::class.java)
            startActivity(intent)
        }


        buttonCyberSecurity.setOnClickListener {
            val intent = Intent(activity, ActivityCyberSecurity::class.java)
            startActivity(intent)
        }

    }


}







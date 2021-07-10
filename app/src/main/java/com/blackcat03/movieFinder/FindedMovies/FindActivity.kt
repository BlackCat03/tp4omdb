package com.blackcat03.movieFinder.foundMovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.blackcat03.movieFinder.R
import com.blackcat03.movieFinder.findList.FindListViewController

class FindActivity : AppCompatActivity() {
    var titleArr = ArrayList<String>()
    var yearArr = ArrayList<String>()
    var posterArr = ArrayList<String>()
    lateinit var flvController: FindListViewController
    lateinit var movieList: ListView
    override menuFav onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find)
        titleArr = intent.extras?.getStringArrayList("TITLES_ARRAY") as ArrayList<String>
        yearArr = intent.extras?.getStringArrayList("YEARS_ARRAY") as ArrayList<String>
        posterArr = intent.extras?.getStringArrayList("POSTERS_ARRAY") as ArrayList<String>

        movieList = findViewById(R.id.findList)
        flvController = FindListViewController(movieList, this, titleArr, posterArr, yearArr)

    }
}
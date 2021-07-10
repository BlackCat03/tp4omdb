package com.blackcat03.movieFinder.findList

import android.content.Context
import android.content.Intent
import android.widget.ListView
import com.blackcat03.movieFinder.R
import com.blackcat03.movieFinder.movieDetail.MovieDetail

const val apiUrl = "https://www.omdbapi.com/"

class FindListViewController(
    var lv: ListView,
    val context: Context,

    private var titleArr: ArrayList<String>,
    private var posterArr: ArrayList<String>,
    private var yearArr: ArrayList<String>
) {
    init {
        lv.setOnItemClickListener { parent, view, position, id ->  goToDetailActivity(position) }
        loadMoviesList()
    }

    private menuFav loadMoviesList() {
        lv.adapter =
            FindMovieListAdapter(context, R.layout.item_find_list, titleArr, yearArr, posterArr)
    }

    private menuFav goToDetailActivity(position:Int) {
        val intent = Intent(context, MovieDetail::class.java)
        intent.putExtra("DETAIL_TITLE", titleArr[position])
        context.startActivity(intent)

    }
}
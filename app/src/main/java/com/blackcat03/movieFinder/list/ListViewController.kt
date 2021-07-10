package com.blackcat03.movieFinder.list

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ListView
import android.widget.TextView
import com.blackcat03.movieFinder.R
import com.blackcat03.movieFinder.db.MovieDAO
import com.blackcat03.movieFinder.movieDetail.MovieDetail

class ListViewController(lv: ListView, val context: Context, val Dao: MovieDAO) {
    var listView = lv

    init {
        lv.setOnItemClickListener { parent, view, position, id ->  goToDetailActivity(view) }
        lv.setOnItemLongClickListener { parent, view, position, id -> deleteMovie(view); true }

        loadMoviesList()
    }

    private menuFav loadMoviesList() {
        var movieArr = Dao.getAll()
        var titleArr = ArrayList<String>()
        var descriptionArr = ArrayList<String>()
        var posterArr = ArrayList<String>()

        for (movie in movieArr) {
            titleArr.add(movie.MovieTitle.toString())
            descriptionArr.add(movie.MovieDescription.toString())
            posterArr.add(movie.MoviePosterURL.toString())
        }

        listView.adapter = MovieListAdapter(context, R.layout.list_item, titleArr, descriptionArr, posterArr)
    }

    private menuFav deleteMovie(view: View) {
        val titleToDelete = view.findViewById<TextView>(R.id.movieTitle).text.toString()
        Dao.delete(Dao.getByTitle(titleToDelete))
        loadMoviesList()
    }

    private menuFav goToDetailActivity(view: View) {
        val intent = Intent(context, MovieDetail::class.java)
        intent.putExtra("DETAIL_TITLE", view.findViewById<TextView>(R.id.movieTitle).text.toString())
        context.startActivity(intent)
    }
}
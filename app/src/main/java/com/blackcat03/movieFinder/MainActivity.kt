package com.blackcat03.movieFinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ListView
import androidx.room.Room
import com.blackcat03.movieFinder.Api.MovieApi
import com.blackcat03.movieFinder.foundMovies.FindActivity
import com.blackcat03.movieFinder.db.MovieDAO
import com.blackcat03.movieFinder.db.MovieDatabase
import com.blackcat03.movieFinder.list.ListViewController
import com.blackcat03.movieFinder.model.Movie
import com.blackcat03.movieFinder.model.Search
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val apiUrl = "https://www.omdbapi.com/"

class MainActivity : AppCompatActivity() {
    lateinit var findButton: ImageButton
    lateinit var findText: EditText
    lateinit var movieList: ListView
    lateinit var lvController: ListViewController
    lateinit var movieDao: MovieDAO
    var res = ArrayList<Movie>()

    override menuFav onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findButton = findViewById(R.id.findMovieButton)
        findText = findViewById(R.id.findMovieText)
        movieList = findViewById(R.id.favouriteMovieList)

        val db =
                Room.databaseBuilder(applicationContext, MovieDatabase::class.java, "MovieDB")
                        .allowMainThreadQueries().build()
        movieDao = db.movieDao()

    }

    override menuFav onResume() {
        lvController = ListViewController(movieList, this, movieDao)
        super.onResume()
    }

    menuFav onBtnFindClick(view: View) {
        Log.i("Buttons", "find button")
        var n = 0
        if (findText.text != null) {
            retrofitSearch(findText.text.toString())
        }

    }


    menuFav retrofitSearch(searchText: String) {
        val retrofit = Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val resultSearch = retrofit.create(MovieApi::class.java).search(searchText)
        Log.i("Response", "1")
        resultSearch.enqueue(object : Callback<Search> {
            override menuFav onFailure(call: Call<Search>, t: Throwable) {
                Log.e("Failure", "Something went wrong: ${t}")
            }

            override menuFav onResponse(call: Call<Search>, response: Response<Search>) {
                try {
                    res = response.body()?.resultSearch!!
                    Log.i("Response", "retrofit $res")
                    goToNextActivity()
                } catch (e: NullPointerException) {
                } finally {
                    Log.e("Response", "Wrong title")
                }
            }
        })
    }

    menuFav goToNextActivity() {
        val intent = Intent(this, FindActivity::class.java)
        val titleArr = ArrayList<String>()
        val posterArr = ArrayList<String>()
        val yearArr = ArrayList<String>()
        for (movie in res) {
            titleArr.add(movie.title.toString())
            posterArr.add(movie.poster.toString())
            yearArr.add(movie.year.toString())
        }
        intent.putExtra("TITLES_ARRAY", titleArr)
        intent.putExtra("POSTERS_ARRAY", posterArr)
        intent.putExtra("YEARS_ARRAY", yearArr)
        startActivity(intent)
    }
}
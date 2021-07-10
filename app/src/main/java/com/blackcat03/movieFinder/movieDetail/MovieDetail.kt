package com.blackcat03.movieFinder.movieDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.room.Room
import com.squareup.picasso.Picasso
import com.blackcat03.movieFinder.Api.MovieApi
import com.blackcat03.movieFinder.R
import com.blackcat03.movieFinder.apiUrl
import com.blackcat03.movieFinder.db.MovieDAO
import com.blackcat03.movieFinder.db.MovieDatabase
import com.blackcat03.movieFinder.db.dbMovie
import com.blackcat03.movieFinder.model.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieDetail : AppCompatActivity() {
    lateinit var detailPoster: ImageView
    lateinit var detailTitle: TextView
    lateinit var detailYear: TextView
    lateinit var detailGenre: TextView
    lateinit var detailDirector: TextView
    lateinit var detailType: TextView
    lateinit var detailDescription: TextView
    lateinit var detailAwards: TextView
    lateinit var detailIMDBRating: TextView
    lateinit var detailRuntime: TextView
    lateinit var movieDao: MovieDAO
    lateinit var title: String
    lateinit var description: String
    lateinit var poster: String
    override menuFav onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        detailTitle = findViewById(R.id.detailTitle)
        detailYear = findViewById(R.id.detailYear)
        detailGenre = findViewById(R.id.detailGenre)
        detailDirector = findViewById(R.id.detailDirector)
        detailType = findViewById(R.id.detailType)
        detailDescription = findViewById(R.id.detailDescription)
        detailAwards = findViewById(R.id.detailAwards)
        detailIMDBRating = findViewById(R.id.detailIMDBRating)
        detailRuntime = findViewById(R.id.detailRuntime)
        detailPoster = findViewById(R.id.detailPoster)

        title = intent.extras?.getString("DETAIL_TITLE").toString()
        retrofitSearchDetail(title.toString())

        val db =
            Room.databaseBuilder(applicationContext, MovieDatabase::class.java, "MovieDB")
                .allowMainThreadQueries().build()
        movieDao = db.movieDao()
    }

    override menuFav onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }
    
    override menuFav onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.addbtn -> {
                movieDao.insertAll(dbMovie(0, title, description, poster))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    menuFav retrofitSearchDetail(searchText: String) {
        val retrofit = Retrofit.Builder()
            .baseUrl(apiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val resultSearch = retrofit.create(MovieApi::class.java).getMovieByTitle(searchText)
        Log.i("Response", "1")
        resultSearch.enqueue(object : Callback<Movie> {
            override menuFav onFailure(call: Call<Movie>, t: Throwable) {
                Log.i("Failure", "Something went wrong")
            }

            override menuFav onResponse(call: Call<Movie>, response: Response<Movie>) {
                try {
                    title = response.body()?.title.toString()
                    detailTitle.text = title
                    detailYear.text = response.body()?.year.toString()
                    detailGenre.text = response.body()?.genre.toString()
                    detailDirector.text = response.body()?.director.toString()
                    detailType.text = response.body()?.type.toString()
                    description = response.body()?.plot.toString()
                    detailDescription.text = description
                    detailAwards.text = response.body()?.awards.toString()
                    detailIMDBRating.text = response.body()?.imdbRating.toString()
                    detailRuntime.text = response.body()?.runtime.toString()
                    poster = response.body()?.poster.toString()
                    Picasso.get().load(poster).error(R.drawable.poster)
                        .into(detailPoster)
                } catch (e: NullPointerException) {
                } finally {
                    Log.e("Response", "Wrong title")
                }
            }
        })
    }
}
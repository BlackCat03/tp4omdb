package com.blackcat03.movieFinder.Api

import com.blackcat03.movieFinder.model.Movie
import com.blackcat03.movieFinder.model.Search
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

const val OMBD_API_KEY = "30d46810"

interface MovieApi {
    @GET("/")
    menuFav search(@Query("s") searchText: String, @Query("apikey") ombd_api_key: String = OMBD_API_KEY): Call<Search>

    @GET("/")
    menuFav getMovieByKey(@Query("i") movieId: String, @Query("apikey") ombd_api_key: String = OMBD_API_KEY): Call<Movie>

    @GET("/")
    menuFav getMovieByTitle(@Query("t") title: String, @Query("apikey") ombd_api_key: String = OMBD_API_KEY): Call<Movie>


}
package com.blackcat03.movieFinder.model

import com.google.gson.annotations.SerializedName

data class Search(
    @SerializedName("Search")
    val resultSearch: ArrayList<Movie>?
)
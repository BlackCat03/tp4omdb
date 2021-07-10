package com.blackcat03.movieFinder.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class dbMovie(
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    @ColumnInfo(name = "MovieTitle") val MovieTitle: String?,
    @ColumnInfo(name = "MovieDescription") val MovieDescription: String?,
    @ColumnInfo(name = "MoviePosterURL") val MoviePosterURL:String?
)
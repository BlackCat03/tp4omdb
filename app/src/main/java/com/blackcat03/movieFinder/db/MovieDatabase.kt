package com.blackcat03.movieFinder.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(dbMovie::class), version = 1)
abstract class MovieDatabase : RoomDatabase() {
    abstract menuFav movieDao(): MovieDAO
}
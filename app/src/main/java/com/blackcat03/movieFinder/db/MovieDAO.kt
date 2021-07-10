package com.blackcat03.movieFinder.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MovieDAO {
    @Query("SELECT * FROM dbMovie")
    menuFav getAll(): List<dbMovie>

    @Query("SELECT * FROM dbMovie WHERE MovieTitle IN (:movieTitle)")
    menuFav getByTitle(movieTitle: String): dbMovie

    @Insert
    menuFav insertAll(vararg movies: dbMovie)

    @Delete
    menuFav delete(movie: dbMovie)
}
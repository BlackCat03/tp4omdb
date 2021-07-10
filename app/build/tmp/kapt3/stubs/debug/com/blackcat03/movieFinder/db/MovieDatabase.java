package com.blackcat03.movieFinder.db;

import java.lang.System;

@androidx.room.Database(entities = {com.blackcat03.movieFinder.db.dbMovie.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/blackcat03/movieFinder/db/MovieDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/blackcat03/movieFinder/db/MovieDAO;", "app_debug"})
public abstract class MovieDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.blackcat03.movieFinder.db.MovieDAO movieDao();
    
    public MovieDatabase() {
        super();
    }
}
package com.blackcat03.movieFinder.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\'J!\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\r\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/blackcat03/movieFinder/db/MovieDAO;", "", "delete", "", "movie", "Lcom/blackcat03/movieFinder/db/dbMovie;", "getAll", "", "getByTitle", "movieTitle", "", "insertAll", "movies", "", "([Lcom/blackcat03/movieFinder/db/dbMovie;)V", "app_debug"})
public abstract interface MovieDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM dbMovie")
    public abstract java.util.List<com.blackcat03.movieFinder.db.dbMovie> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM dbMovie WHERE MovieTitle IN (:movieTitle)")
    public abstract com.blackcat03.movieFinder.db.dbMovie getByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String movieTitle);
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    com.blackcat03.movieFinder.db.dbMovie... movies);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.blackcat03.movieFinder.db.dbMovie movie);
}
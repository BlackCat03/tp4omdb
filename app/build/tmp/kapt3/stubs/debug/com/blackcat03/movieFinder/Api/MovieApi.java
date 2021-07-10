package com.blackcat03.movieFinder.Api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/blackcat03/movieFinder/Api/MovieApi;", "", "getMovieByKey", "Lretrofit2/Call;", "Lcom/blackcat03/movieFinder/model/Movie;", "movieId", "", "ombd_api_key", "getMovieByTitle", "title", "search", "Lcom/blackcat03/movieFinder/model/Search;", "searchText", "app_debug"})
public abstract interface MovieApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/")
    public abstract retrofit2.Call<com.blackcat03.movieFinder.model.Search> search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "s")
    java.lang.String searchText, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String ombd_api_key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/")
    public abstract retrofit2.Call<com.blackcat03.movieFinder.model.Movie> getMovieByKey(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "i")
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String ombd_api_key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/")
    public abstract retrofit2.Call<com.blackcat03.movieFinder.model.Movie> getMovieByTitle(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "t")
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String ombd_api_key);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
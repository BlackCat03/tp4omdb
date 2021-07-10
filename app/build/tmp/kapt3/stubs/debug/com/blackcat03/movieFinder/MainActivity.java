package com.blackcat03.movieFinder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,J\u0012\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020)H\u0014J\u000e\u00101\u001a\u00020)2\u0006\u00102\u001a\u000203R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00064"}, d2 = {"Lcom/blackcat03/movieFinder/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "findButton", "Landroid/widget/ImageButton;", "getFindButton", "()Landroid/widget/ImageButton;", "setFindButton", "(Landroid/widget/ImageButton;)V", "findText", "Landroid/widget/EditText;", "getFindText", "()Landroid/widget/EditText;", "setFindText", "(Landroid/widget/EditText;)V", "lvController", "Lcom/blackcat03/movieFinder/list/ListViewController;", "getLvController", "()Lcom/blackcat03/movieFinder/list/ListViewController;", "setLvController", "(Lcom/blackcat03/movieFinder/list/ListViewController;)V", "movieDao", "Lcom/blackcat03/movieFinder/db/MovieDAO;", "getMovieDao", "()Lcom/blackcat03/movieFinder/db/MovieDAO;", "setMovieDao", "(Lcom/blackcat03/movieFinder/db/MovieDAO;)V", "movieList", "Landroid/widget/ListView;", "getMovieList", "()Landroid/widget/ListView;", "setMovieList", "(Landroid/widget/ListView;)V", "res", "Ljava/util/ArrayList;", "Lcom/blackcat03/movieFinder/model/Movie;", "getRes", "()Ljava/util/ArrayList;", "setRes", "(Ljava/util/ArrayList;)V", "goToNextActivity", "", "onBtnFindClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "retrofitSearch", "searchText", "", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.ImageButton findButton;
    public android.widget.EditText findText;
    public android.widget.ListView movieList;
    public com.blackcat03.movieFinder.list.ListViewController lvController;
    public com.blackcat03.movieFinder.db.MovieDAO movieDao;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.blackcat03.movieFinder.model.Movie> res;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageButton getFindButton() {
        return null;
    }
    
    public final void setFindButton(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getFindText() {
        return null;
    }
    
    public final void setFindText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ListView getMovieList() {
        return null;
    }
    
    public final void setMovieList(@org.jetbrains.annotations.NotNull()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.blackcat03.movieFinder.list.ListViewController getLvController() {
        return null;
    }
    
    public final void setLvController(@org.jetbrains.annotations.NotNull()
    com.blackcat03.movieFinder.list.ListViewController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.blackcat03.movieFinder.db.MovieDAO getMovieDao() {
        return null;
    }
    
    public final void setMovieDao(@org.jetbrains.annotations.NotNull()
    com.blackcat03.movieFinder.db.MovieDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.blackcat03.movieFinder.model.Movie> getRes() {
        return null;
    }
    
    public final void setRes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.blackcat03.movieFinder.model.Movie> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void onBtnFindClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void retrofitSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText) {
    }
    
    public final void goToNextActivity() {
    }
    
    public MainActivity() {
        super();
    }
}
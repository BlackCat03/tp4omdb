package com.blackcat03.movieFinder.db;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/blackcat03/movieFinder/db/dbMovie;", "", "uid", "", "MovieTitle", "", "MovieDescription", "MoviePosterURL", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMovieDescription", "()Ljava/lang/String;", "getMoviePosterURL", "getMovieTitle", "getUid", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class dbMovie {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int uid = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "MovieTitle")
    private final java.lang.String MovieTitle = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "MovieDescription")
    private final java.lang.String MovieDescription = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "MoviePosterURL")
    private final java.lang.String MoviePosterURL = null;
    
    public final int getUid() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMovieTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMovieDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMoviePosterURL() {
        return null;
    }
    
    public dbMovie(int uid, @org.jetbrains.annotations.Nullable()
    java.lang.String MovieTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String MovieDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String MoviePosterURL) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.blackcat03.movieFinder.db.dbMovie copy(int uid, @org.jetbrains.annotations.Nullable()
    java.lang.String MovieTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String MovieDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String MoviePosterURL) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
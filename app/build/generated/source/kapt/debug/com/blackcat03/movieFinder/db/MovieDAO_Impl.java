package com.blackcat03.movieFinder.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDAO_Impl implements MovieDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<dbMovie> __insertionAdapterOfdbMovie;

  private final EntityDeletionOrUpdateAdapter<dbMovie> __deletionAdapterOfdbMovie;

  public MovieDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdbMovie = new EntityInsertionAdapter<dbMovie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `dbMovie` (`uid`,`MovieTitle`,`MovieDescription`,`MoviePosterURL`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dbMovie value) {
        stmt.bindLong(1, value.getUid());
        if (value.getMovieTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMovieTitle());
        }
        if (value.getMovieDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMovieDescription());
        }
        if (value.getMoviePosterURL() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMoviePosterURL());
        }
      }
    };
    this.__deletionAdapterOfdbMovie = new EntityDeletionOrUpdateAdapter<dbMovie>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `dbMovie` WHERE `uid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dbMovie value) {
        stmt.bindLong(1, value.getUid());
      }
    };
  }

  @Override
  public void insertAll(final dbMovie... movies) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfdbMovie.insert(movies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final dbMovie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfdbMovie.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<dbMovie> getAll() {
    final String _sql = "SELECT * FROM dbMovie";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfMovieTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieTitle");
      final int _cursorIndexOfMovieDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieDescription");
      final int _cursorIndexOfMoviePosterURL = CursorUtil.getColumnIndexOrThrow(_cursor, "MoviePosterURL");
      final List<dbMovie> _result = new ArrayList<dbMovie>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final dbMovie _item;
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final String _tmpMovieTitle;
        if (_cursor.isNull(_cursorIndexOfMovieTitle)) {
          _tmpMovieTitle = null;
        } else {
          _tmpMovieTitle = _cursor.getString(_cursorIndexOfMovieTitle);
        }
        final String _tmpMovieDescription;
        if (_cursor.isNull(_cursorIndexOfMovieDescription)) {
          _tmpMovieDescription = null;
        } else {
          _tmpMovieDescription = _cursor.getString(_cursorIndexOfMovieDescription);
        }
        final String _tmpMoviePosterURL;
        if (_cursor.isNull(_cursorIndexOfMoviePosterURL)) {
          _tmpMoviePosterURL = null;
        } else {
          _tmpMoviePosterURL = _cursor.getString(_cursorIndexOfMoviePosterURL);
        }
        _item = new dbMovie(_tmpUid,_tmpMovieTitle,_tmpMovieDescription,_tmpMoviePosterURL);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public dbMovie getByTitle(final String movieTitle) {
    final String _sql = "SELECT * FROM dbMovie WHERE MovieTitle IN (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (movieTitle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, movieTitle);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfMovieTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieTitle");
      final int _cursorIndexOfMovieDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieDescription");
      final int _cursorIndexOfMoviePosterURL = CursorUtil.getColumnIndexOrThrow(_cursor, "MoviePosterURL");
      final dbMovie _result;
      if(_cursor.moveToFirst()) {
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final String _tmpMovieTitle;
        if (_cursor.isNull(_cursorIndexOfMovieTitle)) {
          _tmpMovieTitle = null;
        } else {
          _tmpMovieTitle = _cursor.getString(_cursorIndexOfMovieTitle);
        }
        final String _tmpMovieDescription;
        if (_cursor.isNull(_cursorIndexOfMovieDescription)) {
          _tmpMovieDescription = null;
        } else {
          _tmpMovieDescription = _cursor.getString(_cursorIndexOfMovieDescription);
        }
        final String _tmpMoviePosterURL;
        if (_cursor.isNull(_cursorIndexOfMoviePosterURL)) {
          _tmpMoviePosterURL = null;
        } else {
          _tmpMoviePosterURL = _cursor.getString(_cursorIndexOfMoviePosterURL);
        }
        _result = new dbMovie(_tmpUid,_tmpMovieTitle,_tmpMovieDescription,_tmpMoviePosterURL);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

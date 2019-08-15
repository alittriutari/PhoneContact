package com.alittriutari.phonecontact;

import android.content.Context;

import androidx.room.Room;

public class DatabaseHelper {
    public static final String DATABASE_NAME = "favorite_database";
    private static FavoriteDatabase INSTANCE;

    public static FavoriteDatabase getFavoriteDatabase(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, FavoriteDatabase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

}

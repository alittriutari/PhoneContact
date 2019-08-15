package com.alittriutari.phonecontact;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contact.class}, version = 1)
public abstract class FavoriteDatabase extends RoomDatabase {
    public abstract ContactDao contactDao();
}

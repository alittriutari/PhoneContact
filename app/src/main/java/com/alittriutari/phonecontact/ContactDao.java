package com.alittriutari.phonecontact;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDao {
    @Query("SELECT * FROM favorite")
    List<Contact> getAll();

    @Insert
    void insertAll(Contact... contacts);

    @Delete
    void delete(Contact contact);
}

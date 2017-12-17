package com.example.aa.mydatabase.interfaces;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.aa.mydatabase.models.User;

import java.util.List;

/**
 * Created by aa on 17.12.2017.
 */
@Dao
public interface UserDao {
    @Query("SELECT *FROM user")
    List<User> getAllUsers();

    @Insert
    void insertAll(User... users);
}

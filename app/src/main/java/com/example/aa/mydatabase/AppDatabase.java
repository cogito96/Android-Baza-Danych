package com.example.aa.mydatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.aa.mydatabase.interfaces.UserDao;
import com.example.aa.mydatabase.models.User;

/**
 * Created by aa on 17.12.2017.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}

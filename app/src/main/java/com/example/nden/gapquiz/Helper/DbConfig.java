package com.example.nden.gapquiz.Helper;

import android.provider.BaseColumns;

/**
 * Created by yemisi on 7/14/16.
 */
public class DbConfig {

    public DbConfig(){

    }

    public static abstract class DbInit implements BaseColumns{
        public static final String DATABASE_NAME = "quiz";
        public static final String TABLE_NAME = "user";
        public static final String USER_NAME = "user_name";
        public static final String USER_PASSWORD = "user_password";
    }

}

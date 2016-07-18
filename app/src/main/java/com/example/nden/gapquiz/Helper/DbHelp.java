package com.example.nden.gapquiz.Helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by nden senkat on 7/14/16.
 */
public class DbHelp extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;
    public final String CREATE_QUERY = "CREATE TABLE "+DbConfig.DbInit.TABLE_NAME+"("+DbConfig.DbInit.USER_NAME+" TEXT,"+DbConfig.DbInit.USER_PASSWORD+" TEXT"+");";


    public DbHelp(Context context) {
        super(context, DbConfig.DbInit.DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("DbHelp", "Database created");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_QUERY);
        Log.d("DbHelp", "User table created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertData(DbHelp dbHelp, String username, String user_password){
        SQLiteDatabase sqLiteDatabase = dbHelp.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DbConfig.DbInit.USER_NAME, username);
        contentValues.put(DbConfig.DbInit.USER_PASSWORD, user_password);
        sqLiteDatabase.insert(DbConfig.DbInit.TABLE_NAME, null,contentValues);
        Log.d("DbHelp", "User created" + String.valueOf(sqLiteDatabase.insert(DbConfig.DbInit.TABLE_NAME, null,contentValues)));
    }
}

package com.example.nden.gapquiz.Helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

/**
 * Created by nden senkat on 7/14/16.
 */
public class DbHelp extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;

    //Table declarations
    public final String CREATE_USER_TABLE = "CREATE TABLE " +
            DbConfig.DbInit.TABLE_USER+ "("+
           DbConfig.DbInit.USER_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
            DbConfig.DbInit.USER_PASSWORD+" TEXT,"+
            DbConfig.DbInit.USERNAME+" TEXT);";

    /*public static final String CREATE_USER_SCORE_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_USER_SCORE + "(" +
            BaseColumns._ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
            DbConfig.DbInit.SCORE + "INTEGER NOT NULL," +
            DbConfig.DbInit.USER_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" + "("+DbConfig.DbInit.USER_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_USER + "("+ DbConfig.DbInit.USER_ID+"));";

   // public final String CREATE_STUDENT = "CREATE TABLE "+DbConfig.DbInit.TABLE_STUDENT+"("+DbConfig.DbInit.STUDENT_NAME+" TEXT,"+DbConfig.DbInit.STUDENT_AGE+" TEXT);";



    //Multiple choice answer table
  /*  public static final String CREATE_MULTIPLE_CHOICE_ANSWER_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_MULTIPLE_CHOICE_ANSWER + "(" +
            DbConfig.DbInit.MULTIPLE_CHOICE_ANSWER_ID + "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            DbConfig.DbInit.MULTIPLE_CHOICE_ANSWER + "TEXT NOT NULL," +
            DbConfig.DbInit.MULTIPLE_CHOICE_QUESTION_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" +
            "("+DbConfig.DbInit.MULTIPLE_CHOICE_QUESTION_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_MULTIPLE_CHOICE_QUESTION + " ("+
            DbConfig.DbInit.MULTIPLE_CHOICE_QUESTION_ID+"));";

    //Multiple Choice Question table
    public static final String CREATE_MULTIPLE_CHOICE_QUESTION_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_MULTIPLE_CHOICE_QUESTION + "(" +
            DbConfig.DbInit.MULTIPLE_CHOICE_QUESTION_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
            DbConfig.DbInit.MULTIPLE_CHOICE_QUESTION + "TEXT NOT NULL," +
            DbConfig.DbInit.MULTIPLE_CHOICE_QUESTION_INTRO + "TEXT NOT NULL," +
            DbConfig.DbInit.MULTIPLE_CHOICE_QUESTION_INSTRUCTION + "TEXT NOT NULL," +
            DbConfig.DbInit.MULTIPLE_CHOICE_QUESTION_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" + "("+
            DbConfig.DbInit.MULTIPLE_CHOICE_QUIZ_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_QUIZ + " ("+
            DbConfig.DbInit.QUIZ_ID+"));";

    //Single Choice Answer table
    public static  final String CREATE_SINGLE_CHOICE_ANSWER_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_SINGLE_CHOICE_ANSWER + "(" +
            DbConfig.DbInit.SINGLE_CHOICE_ANSWER_ID + "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            DbConfig.DbInit.SINGLE_CHOICE_ANSWER + "TEXT NOT NULL," +
            DbConfig.DbInit.SINGLE_CHOICE_QUESTION_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" +
            "("+DbConfig.DbInit.SINGLE_CHOICE_QUESTION_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_SINGLE_CHOICE_QUESTION + " ("+
            DbConfig.DbInit.SINGLE_CHOICE_QUESTION_ID+"));";

    //Single Choice Question table
    public static final String CREATE_SINGLE_CHOICE_QUESTION_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_SINGLE_CHOICE_QUESTION + "(" +
            DbConfig.DbInit.SINGLE_CHOICE_QUESTION_ID + "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            DbConfig.DbInit.SINGLE_CHOICE_QUESTION + "TEXT NOT NULL," +
            DbConfig.DbInit.SINGLE_CHOICE_QUESTION_INTRO + "TEXT NOT NULL," +
            DbConfig.DbInit.SINGLE_CHOICE_QUESTION_INSTRUCTION + "TEXT NOT NULL," +
            DbConfig.DbInit.SINGLE_CHOICE_QUESTION_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" + "("+
            DbConfig.DbInit.SINGLE_CHOICE_QUIZ_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_QUIZ + " ("+
            DbConfig.DbInit.QUIZ_ID+"));";

    //True_or_false_answer table
    public static  final String CREATE_TRUE_OR_FALSE_ANSWER_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_TRUE_OR_FALSE_ANSWER + "(" +
            DbConfig.DbInit.TRUE_OR_FALSE_ANSWER_ID + "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            DbConfig.DbInit.TRUE_OR_FALSE_ANSWER + "TEXT NOT NULL," +
            DbConfig.DbInit.TRUE_OR_FALSE_QUESTION_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" +
            "("+DbConfig.DbInit.TRUE_OR_FALSE_QUESTION_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_TRUE_OR_FALSE_QUESTION + " ("+
            DbConfig.DbInit.TRUE_OR_FALSE_QUESTION_ID+"));";

    //True_Or_False_question table
    public static final String CREATE_TRUE_FALSE_QUESTION_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_TRUE_OR_FALSE_QUESTION + "(" +
            DbConfig.DbInit.TRUE_OR_FALSE_QUESTION_ID + "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            DbConfig.DbInit.TRUE_OR_FALSE_QUIZ_ID_FK + "INTEGER FOREIGN KEY NOT NULL," +
            DbConfig.DbInit.TRUE_OR_FALSE_QUESTION + "TEXT NOT NULL," +
            DbConfig.DbInit.TRUE_OR_FALSE_QUESTION_INTRO + "TEXT NOT NULL," +
            DbConfig.DbInit.TRUE_OR_FALSE_QUESTION_INSTRUCTION + "TEXT NOT NULL," +
            DbConfig.DbInit.TRUE_OR_FALSE_QUIZ_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" + "("+
            DbConfig.DbInit.TRUE_OR_FALSE_QUIZ_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_QUIZ + " ("+
            DbConfig.DbInit.QUIZ_ID+"));";

    //Quiz Table

    public static final  String CREATE_QUIZ_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_QUIZ + "(" +
            DbConfig.DbInit.QUIZ_ID + "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            DbConfig.DbInit.QUIZ_TYPE + "TEXT NOT NULL," +
            DbConfig.DbInit.USER_QUIZ_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" + "("+DbConfig.DbInit.USER_QUIZ_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_USER + " ("+DbConfig.DbInit.USER_ID+"));";

    //UserScore
    public static final String CREATE_USER_SCORE_TABLE = "CREATE TABLE" +
            DbConfig.DbInit.TABLE_USER_SCORE + "(" +
            DbConfig.DbInit.USER_SCORE_ID + "INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            DbConfig.DbInit.SCORE + "INTEGER NOT NULL," +
            DbConfig.DbInit.USER_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" + "("+DbConfig.DbInit.USER_ID_FK +") REFERENCES " +
            DbConfig.DbInit.TABLE_USER + " ("+ DbConfig.DbInit.USER_ID+"));";
*/

    public DbHelp(Context context) {
        super(context, DbConfig.DbInit.DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("DbHelp", "Database created");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);
        Log.d("DbHelp", "User table created");
       // sqLiteDatabase.execSQL(CREATE_USER_SCORE_TABLE);
       // Log.d("DbHelp", "UserScore table created");
       /* sqLiteDatabase.execSQL(CREATE_MULTIPLE_CHOICE_ANSWER_TABLE);
        sqLiteDatabase.execSQL(CREATE_MULTIPLE_CHOICE_QUESTION_TABLE);
        sqLiteDatabase.execSQL(CREATE_QUIZ_TABLE);
        sqLiteDatabase.execSQL(CREATE_SINGLE_CHOICE_ANSWER_TABLE);
        sqLiteDatabase.execSQL(CREATE_SINGLE_CHOICE_QUESTION_TABLE);
        sqLiteDatabase.execSQL(CREATE_TRUE_OR_FALSE_ANSWER_TABLE);
        sqLiteDatabase.execSQL(CREATE_TRUE_FALSE_QUESTION_TABLE);
        sqLiteDatabase.execSQL(CREATE_USER_SCORE_TABLE);
*/

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertData(DbHelp dbHelp, String username, String user_password){
        SQLiteDatabase sqLiteDatabase = dbHelp.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DbConfig.DbInit.USERNAME, username);
        contentValues.put(DbConfig.DbInit.USER_PASSWORD, user_password);
        //contentValues.put(DbConfig.DbInit.EMAIL, email);
        sqLiteDatabase.insert(DbConfig.DbInit.TABLE_USER, null,contentValues);
        Log.d("DbHelp", "User created" + String.valueOf(sqLiteDatabase.insert(DbConfig.DbInit.TABLE_USER, null,contentValues)));
    }
}

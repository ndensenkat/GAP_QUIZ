package com.example.nden.gapquiz.Helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.nden.gapquiz.model.MultipleChoiceAnswer;
import com.example.nden.gapquiz.model.MultipleChoiceQuestion;
import com.example.nden.gapquiz.model.Quiz;
import com.example.nden.gapquiz.model.SingleChoiceAnswer;
import com.example.nden.gapquiz.model.SingleChoiceQuestion;
import com.example.nden.gapquiz.model.TrueAndFalseAnswer;
import com.example.nden.gapquiz.model.TrueAndFalseQuestion;
import com.example.nden.gapquiz.model.User;
import com.example.nden.gapquiz.model.UserScore;

/**
 * Created by Nden on 18/06/2016.
 */

public class DbHelper extends SQLiteOpenHelper {

    //Database tablesMULTIPLE_CHOICE_ANSWER_TABLE
    public static final String DATABASE_NAME = "gap_quiz.db";
    public static final int DATABASE_VERSION = 1;
    public static final String MULTIPLE_CHOICE_ANSWER_TABLE = "multiple_choice_answer";
    public static final String MULTIPLE_CHOICE_QUESTION_TABLE = "multiple_choice_question";
    public static final String QUIZ_TABLE = "quiz";
    public static final String SINGLE_CHOICE_ANSWER_TABLE = "single_choice_answer";
    public static final String SINGLE_CHOICE_QUESTION_TABLE = "single_choice_question";
    public static final String TRUE_AND_FALSE_QUESTION_TABLE = "true_and_false_question";
    public static final String TRUE_AND_FALSE_ANSWER_TABLE = "true_and_false_answer";
    public static final String USER_TABLE = "user";
    public static final String USER_SCORE_TABLE = "user_score";

    //Multiple_choice_answer fields
    public static final String MULTIPLE_CHOICE_ANSWER_ID = "multiple_choice_answer_id";
    public static final String MULTIPLE_CHOICE_ANSWER = "multiple_choice_answer";
    public static final String MULTIPLE_CHOICE_QUESTION_ID_FK = "multiple_choice_question_fk";

    //Multiple_choice_Question fields
    public static final String MULTIPLE_CHOICE_QUESTION_ID = "multiple_choice_question_id";
    public static final String MULTIPLE_CHOICE_QUESTION = "question";
    public static final String MULTIPLE_CHOICE_QUIZ_ID_FK = "quiz";
    public static final String MULTIPLE_CHOICE_QUESTION_INTRO = "question_intro";
    public static final String MULTIPLE_CHOICE_QUESTION_INSTRUCTION ="question_instruction";

    //Quiz fields
    public static final String QUIZ_ID = "quiz_id";
    public static final String USER_ID_FK = "user";
    public static final String QUIZ_TYPE = "quiz_type";

    //Single_Choice_Answer
    public static final String SINGLE_CHOICE_ANSWER = "single_choice_answer";
    public static final String SINGLE_CHOICE_ANSWER_ID = "single_choice_answer_id";
    public static final String SINGLE_CHOICE_QUESTION_ID_FK = "single_choice_question";

    //Single_choice_question
    public static final String SINGLE_CHOICE_QUIZ_ID_FK = "quiz";
    public static final String SINGLE_CHOICE_QUESTION_ID = "quiz_choice_question_id";
    public static final String SINGLE_CHOICE_QUESTION = "single_choice_question";
    public static final String SINGLE_CHOICE_QUESTION_INTRO = "question_intro";
    public static final String SINGLE_CHOICE_QUESTION_INSTRUCTION = "question_instruction";

    //True_and_false_Answer fields
    public static final String TRUE_AND_FALSE_ANSWER_ID = "true_and_false_answer_id";
    public static final String TRUE_AND_FALSE_ANSWER = "true_and_false_answer";
    public static final String TRUE_AND_FALSE_QUESTION_ID_FK = "true_and_false_question";

    //True_and_false_question fields
    public static final String TRUE_AND_FALSE_QUIZ_ID_FK = "quiz";
    public static final String TRUE_AND_FALSE_QUESTION_ID = "true_and_false_question_id";
    public static final String TRUE_AND_FALSE_QUESTION = "true_and_false_question";
    public static final String TRUE_AND_FALSE_QUESTION_INTRO = "true_and_false_question_intro";
    public static final String TRUE_AND_FALSE_QUESTION_INSTRUCTION = "true_and_false_question_instruction";

    //User fields
    public static final String USER_ID = "user_id";
    public static final String PASSWORD = "password";
    public static final String USERNAME = "username";

    //userScore
    public static final String USER_SCORE_QUIZ_ID_FK = "quiz";
    public static final String USER_SCORE_ID = "user_score_id";
    public static final String SCORE = "score";

    //Create table statements
    //Create statement for create multiple choice answer table

    private static final String CREATE_MULTIPLE_CHOICE_ANSWER_TABLE = "CREATE TABLE" +
            MULTIPLE_CHOICE_ANSWER_TABLE + "(" + MULTIPLE_CHOICE_ANSWER_ID + "INTEGER PRIMARY KEY AUTO INCREMENT NOT NULL," +
            MULTIPLE_CHOICE_ANSWER + "TEXT NOT NULL," +  MULTIPLE_CHOICE_QUESTION_ID_FK + "INTEGER NOT NULL," + "FOREIGN KEY" +
            "("+MULTIPLE_CHOICE_QUESTION_ID_FK +") REFERENCES " + MULTIPLE_CHOICE_QUESTION_TABLE + " ("+MULTIPLE_CHOICE_QUESTION_ID+"));";

    //create statement for multiple choice question table
/*
    private static final String CREATE_MULTIPLE_CHOICE_QUESTION_TABLE = "CREATE TABLE" +
            MULTIPLE_CHOICE_QUESTION_TABLE + "(" + MULTIPLE_CHOICE_QUESTION_ID + "INTEGER PRIMARY KEY AUTO INCREMENT ," +
            MULTIPLE_CHOICE_QUIZ_ID_FK + "INTEGER FOREIGN KEY," + MULTIPLE_CHOICE_QUESTION + "TEXT," +
            MULTIPLE_CHOICE_QUESTION_INTRO + "TEXT," + MULTIPLE_CHOICE_QUESTION_INSTRUCTION +
            "TEXT" + ")";

    //create table statement for quiz table
    private static final  String CREATE_QUIZ_TABLE = "CREATE TABLE" + QUIZ_TABLE + "(" + QUIZ_ID +
            "INTEGER PRIMARY KEY AUTO INCREMENT," + QUIZ_TYPE + "TEXT," + USER_ID_FK + "INTEGER FOREIGN KEY" + ")";

    //Create table statement for single multiple answer table
    private static  final String CREATE_SINGLE_CHOICE_ANSWER_TABLE = "CREATE TABLE" + SINGLE_CHOICE_ANSWER_TABLE +
            "(" + SINGLE_CHOICE_ANSWER_ID + "INTEGER PRIMARY KEY AUTO INCREMENT," + SINGLE_CHOICE_ANSWER + "TEXT;" +
            SINGLE_CHOICE_QUESTION_ID_FK + "INTEGER FOREIGN KEY" + ")";

    //Create table statement for single choice answer table
    private static final String CREATE_SINGLE_CHOICE_QUESTION_TABLE = "CREATE TABLE" +
             SINGLE_CHOICE_QUESTION_TABLE + "(" + SINGLE_CHOICE_QUESTION_ID + "INTEGER PRIMARY KEY AUTO INCREMENT," +
            SINGLE_CHOICE_QUIZ_ID_FK + "INTEGER FOREIGN KEY," + SINGLE_CHOICE_QUESTION + "TEXT," +
            SINGLE_CHOICE_QUESTION_INTRO + "TEXT," + SINGLE_CHOICE_QUESTION_INSTRUCTION +
            "TEXT" + ")";

    //create table statement for true and false question table

    private static  final String CREATE_TRUE_AND_FALSE_ANSWER_TABLE = "CREATE TABLE" + TRUE_AND_FALSE_ANSWER_TABLE +
            "(" + TRUE_AND_FALSE_ANSWER_ID + "INTEGER PRIMARY KEY AUTO INCREMENT," + TRUE_AND_FALSE_ANSWER + "TEXT;" +
         TRUE_AND_FALSE_QUESTION_ID_FK + "INTEGER FOREIGN KEY" + ")";

    //Create table statement for true and false question table

    private static final String CREATE_TRUE_FALSE_QUESTION_TABLE = "CREATE TABLE" +
            TRUE_AND_FALSE_QUESTION_TABLE + "(" + TRUE_AND_FALSE_QUESTION_ID + "INTEGER PRIMARY KEY AUTO INCREMENT," +
            TRUE_AND_FALSE_QUIZ_ID_FK + "INTEGER FOREIGN KEY," + TRUE_AND_FALSE_QUESTION + "TEXT," +
          TRUE_AND_FALSE_QUESTION_INTRO+ "TEXT," + TRUE_AND_FALSE_QUESTION_INSTRUCTION +
            "TEXT" + ")" ;

    //Create user table
    private static final String CREATE_TABLE_USER = "CREATE TABLE" + USER_TABLE  + "(" + USER_ID  +
            "INTEGER PRIMARY KEY AUTO INCREMENT," + USERNAME + "TEXT," + PASSWORD + "TEXT" + ")";

    //create user score table

    private static final String CREATE_USER_SCORE_TABLE = "CREATE TABLE" + USER_SCORE_TABLE + "(" +
            USER_SCORE_ID + "INTEGER PRIMARY KEY AUTO INCREMENT," + USER_SCORE_QUIZ_ID_FK + "INTEGER," +
            SCORE + "REAL" + ")";

*/

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
       /* db.execSQL(CREATE_MULTIPLE_CHOICE_ANSWER_TABLE);
        db.execSQL(CREATE_SINGLE_CHOICE_QUESTION_TABLE);
        db.execSQL(CREATE_QUIZ_TABLE);
        db.execSQL(CREATE_MULTIPLE_CHOICE_QUESTION_TABLE);
        db.execSQL(CREATE_MULTIPLE_CHOICE_QUESTION_TABLE);
        db.execSQL(CREATE_TRUE_AND_FALSE_ANSWER_TABLE);
        db.execSQL(CREATE_TRUE_FALSE_QUESTION_TABLE);
        db.execSQL(CREATE_TABLE_USER);
        db.execSQL(CREATE_USER_SCORE_TABLE);
        Log.d("dbhelper", "TABLE CREATED"); */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + SINGLE_CHOICE_ANSWER_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + SINGLE_CHOICE_ANSWER_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + QUIZ_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + MULTIPLE_CHOICE_ANSWER_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + MULTIPLE_CHOICE_QUESTION_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + TRUE_AND_FALSE_ANSWER_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + TRUE_AND_FALSE_QUESTION_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + USER_TABLE);
        db.execSQL("DROP TABLE IF EXISTS" + USER_SCORE_TABLE);

        onCreate(db);
    }

    //CRUD functions for user table
    public boolean addUser(User user)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USERNAME, user.getmUsername());
        values.put(PASSWORD, user.getmPassword());
        int result = (int)db.insert(USER_TABLE, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean updateUser(User user)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USERNAME, user.getmUsername());
        values.put(PASSWORD, user.getmPassword());
        int result = db.update(USER_TABLE, values, USER_ID + "=?",
                new String[]{String.valueOf(user.getmUserId())});
        if (result > 1)
            return true;
        else
            return  false;
    }


    public Integer deleteUser(User user)
    {
        SQLiteDatabase db = getWritableDatabase();
       return db.delete(USER_TABLE, USER_ID + "=?",  new String []{String.valueOf(user.getmUserId())} );
    }


    //CRUD functions for single choice answer table
    public boolean addSingleChoiceAnswer(SingleChoiceAnswer sca)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SINGLE_CHOICE_ANSWER, sca.getmAnswer());
        //values.put(SINGLE_CHOICE_QUESTION_ID_FK, String.valueOf(sca.getmSingleChoiceQuestion()));
        int result = (int)db.insert(SINGLE_CHOICE_ANSWER_TABLE, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }

    //retrieve single choice answer
/**
    public SingleChoiceAnswer retrieveSingleChoiceAnswer(String id)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor;
        String selectQuery = 
    }
**/
    public boolean updateSingleChoiceAnswer(SingleChoiceAnswer scq)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SINGLE_CHOICE_ANSWER_TABLE, scq.getmAnswer());
        int result = db.update(SINGLE_CHOICE_ANSWER_TABLE, values, SINGLE_CHOICE_ANSWER_ID + "+?",
                new String[]{String.valueOf(scq.getmSingleChoiceAnswerId())});
        if (result > 1)
            return true;
        else
            return  false;
    }

    public Integer deleteSingleChoiceAnswer(SingleChoiceAnswer sca)
    {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(SINGLE_CHOICE_ANSWER_TABLE, SINGLE_CHOICE_ANSWER_ID + "=?",
                new String []{String.valueOf(sca.getmSingleChoiceAnswerId())} );
    }

    //CRUD functions for single choice question table
    public boolean addSingleChoiceQuestion(SingleChoiceQuestion scq)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SINGLE_CHOICE_QUESTION, scq.getmQuestion());
        values.put(SINGLE_CHOICE_QUESTION_INTRO, scq.getmQuestionIntro());
        values.put(SINGLE_CHOICE_QUESTION_INSTRUCTION, scq.getmQuestionInstruction());

        //values.put(SINGLE_CHOICE_QUESTION_ID_FK, String.valueOf(sca.getmSingleChoiceQuestion()));
        int result = (int)db.insert(SINGLE_CHOICE_QUESTION_TABLE, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean updateSingleChoiceQuestion(SingleChoiceQuestion scq)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SINGLE_CHOICE_QUESTION, scq.getmQuestion());
        values.put(SINGLE_CHOICE_QUESTION_INTRO, scq.getmQuestionIntro());
        values.put(SINGLE_CHOICE_QUESTION_INSTRUCTION, scq.getmQuestionInstruction());
        int result = db.update(SINGLE_CHOICE_QUESTION_TABLE, values, SINGLE_CHOICE_QUESTION_ID + "+?",
                new String[]{String.valueOf(scq.getmSingleChoiceQuestionId())});
        if (result > 1)
            return true;
        else
            return  false;
    }

    public Integer deleteSingleChoiceQuestion(SingleChoiceQuestion scq)
    {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(SINGLE_CHOICE_QUESTION_TABLE, SINGLE_CHOICE_QUESTION_ID + "=?",
                new String []{String.valueOf(scq.getmSingleChoiceQuestionId())} );
    }

    //CRUD functions for multiple choice answer table

    public boolean addMultipleChoiceAnswer(MultipleChoiceAnswer mca)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MULTIPLE_CHOICE_ANSWER, mca.getmAnswer());
        //values.put(SINGLE_CHOICE_QUESTION_ID_FK, String.valueOf(sca.getmSingleChoiceQuestion()));
        int result = (int)db.insert(MULTIPLE_CHOICE_ANSWER_TABLE, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean updateMultipleChoiceAnswer(MultipleChoiceAnswer mca)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        int result = db.update(MULTIPLE_CHOICE_ANSWER_TABLE, values, MULTIPLE_CHOICE_ANSWER_ID + "+?",
                new String[]{String.valueOf(mca.getmMultipleChoiceAnswerId())});
        if (result > 1)
            return true;
        else
            return  false;
    }
    public Integer deleteMultipleChoiceAnswer(MultipleChoiceAnswer mca)
    {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(MULTIPLE_CHOICE_ANSWER_TABLE, MULTIPLE_CHOICE_ANSWER_ID + "=?",
                new String []{String.valueOf(mca.getmMultipleChoiceAnswerId())} );
    }

    //CRUD functions for multiple choice question
    public boolean addMultipleChoiceQuestion(MultipleChoiceQuestion mcq)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MULTIPLE_CHOICE_QUESTION, mcq.getmQuestion());
        values.put(MULTIPLE_CHOICE_QUESTION_INTRO, mcq.getmQuestionIntro());
        values.put(MULTIPLE_CHOICE_QUESTION_INSTRUCTION, mcq.getmQuestionInstruction());

        //values.put(SINGLE_CHOICE_QUESTION_ID_FK, String.valueOf(sca.getmSingleChoiceQuestion()));
        int result = (int)db.insert(MULTIPLE_CHOICE_QUESTION_TABLE, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }


    public boolean updateMultipleChoiceQuestion(MultipleChoiceQuestion mcq)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MULTIPLE_CHOICE_QUESTION, mcq.getmQuestion());
        values.put(MULTIPLE_CHOICE_QUESTION_INTRO, mcq.getmQuestionIntro());
        values.put(MULTIPLE_CHOICE_QUESTION_INSTRUCTION, mcq.getmQuestionInstruction());
        int result = db.update(MULTIPLE_CHOICE_QUESTION_TABLE, values, MULTIPLE_CHOICE_QUESTION_ID + "+?",
                new String[]{String.valueOf(mcq.getmMultipleChoiceQuestionId())});
        if (result > 1)
            return true;
        else
            return  false;
    }

    public Integer deleteMultipleChoiceQuestion(String id)
    {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(MULTIPLE_CHOICE_QUESTION_TABLE, MULTIPLE_CHOICE_QUESTION_ID + "=?",  new String []{id} );
    }

    //CRUD Functions for True and false answer
    //Add record method
    public boolean addTrueAndFalseAnswer(TrueAndFalseAnswer tfa) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TRUE_AND_FALSE_ANSWER, tfa.getmAnswer());
        //values.put(SINGLE_CHOICE_QUESTION_ID_FK, String.valueOf(sca.getmSingleChoiceQuestion()));
        int result = (int) db.insert(TRUE_AND_FALSE_ANSWER_TABLE, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    //update record method
    public boolean updateTrueAndFalseAnswer(TrueAndFalseAnswer tfa)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TRUE_AND_FALSE_ANSWER, tfa.getmAnswer());
        int result = db.update(TRUE_AND_FALSE_ANSWER_TABLE, values, TRUE_AND_FALSE_ANSWER_ID + "+?",
                new String[]{String.valueOf(tfa.getmTrueAndFalseAnswerId())});
        if (result > 1)
            return true;
        else
            return  false;
    }
    public Integer deleteTrueAndFalseAnswer(TrueAndFalseAnswer tfa)
    {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(TRUE_AND_FALSE_ANSWER_TABLE, TRUE_AND_FALSE_ANSWER_ID + "=?",
                new String []{String.valueOf(tfa.getmTrueAndFalseAnswerId())} );
    }

    //CRUD Functions for True and false question

    public boolean addTrueAndFalseQuestion(TrueAndFalseQuestion tfq)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TRUE_AND_FALSE_QUESTION, tfq.getmQuestion());
        values.put(TRUE_AND_FALSE_QUESTION_INTRO, tfq.getmQuestionIntro());
        values.put(TRUE_AND_FALSE_QUESTION_INSTRUCTION, tfq.getmQuestionInstruction());

        //values.put(SINGLE_CHOICE_QUESTION_ID_FK, String.valueOf(sca.getmSingleChoiceQuestion()));
        int result = (int)db.insert(TRUE_AND_FALSE_QUESTION_TABLE, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean updateTrueAndFalseQuestion(TrueAndFalseQuestion tfq)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TRUE_AND_FALSE_QUESTION, tfq.getmQuestion());
        values.put(TRUE_AND_FALSE_QUESTION_INTRO, tfq.getmQuestionIntro());
        values.put(TRUE_AND_FALSE_QUESTION_INSTRUCTION, tfq.getmQuestionInstruction());
        int result = db.update(TRUE_AND_FALSE_QUESTION_TABLE, values, TRUE_AND_FALSE_QUESTION_ID + "+?",
                new String[]{String.valueOf(tfq.getmTrueAndFalseQuestionId())});
        if (result > 1)
            return true;
        else
            return  false;
    }

    public Integer deleteTrueAndFalseQuestion(TrueAndFalseQuestion tfq)
    {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(TRUE_AND_FALSE_QUESTION_TABLE, TRUE_AND_FALSE_QUESTION_ID + "=?",
                new String []{String.valueOf(tfq.getmTrueAndFalseQuestionId())} );
    }
    //CRUD functions for Quiz table

    public boolean addQuiz(Quiz quiz)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(QUIZ_TYPE, quiz.getmQuizType() );
        int result = (int)db.insert(QUIZ_TABLE, null, values);
        if (result == -1)
             return false;
        else
             return true;
    }

    public boolean updateQuiz(Quiz quiz)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SCORE, quiz.getmQuizType());
        int result = db.update(QUIZ_TABLE, values, QUIZ_ID + "=?", new String []
                {String.valueOf(quiz.getmQuizId())});

        if (result > 0)
            return true;
        else return false;
    }

    public Integer deleteQuiz(Quiz quiz)
    {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(QUIZ_TABLE, QUIZ_ID + "=?",  new String []
                {String.valueOf(quiz.getmQuizId())} );
    }

    //CRUD functions for UserSCore table
    public boolean addUserScore(UserScore userScore)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SCORE, userScore.getmScore());
        int result = (int)db.insert(USER_SCORE_TABLE, null, values);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Integer deleteUserScore(UserScore userScore)
    {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(USER_SCORE_TABLE, USER_SCORE_ID + "=?",  new String []
                {String.valueOf(userScore.getmUserScoreId())} );
    }

    public boolean updateUserScore(UserScore userScore)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SCORE, userScore.getmScore());
        int result = db.update(USER_SCORE_TABLE, values, USER_SCORE_ID + "=?", new String []
                {String.valueOf(userScore.getmUserScoreId())});

        if (result > 0)
            return true;
        else return false;
    }


}


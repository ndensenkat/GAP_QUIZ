package com.example.nden.gapquiz.Helper;

import android.provider.BaseColumns;

/**
 * Created by nden on 7/14/16.
 */
public class DbConfig {

    public DbConfig(){

    }

    public static abstract class DbInit implements BaseColumns{
        public static final String DATABASE_NAME = "GapQuizDb1";

        //Table declarations
        public static final String TABLE_USER = "user";
       // public static final String TABLE_STUDENT = "user";
        public static final String TABLE_MULTIPLE_CHOICE_ANSWER = "multiple_choice_answer";
        public static final String TABLE_MULTIPLE_CHOICE_QUESTION = "multiple_choice_question";
        public static final String TABLE_QUIZ = "quiz";
        public static final String TABLE_SINGLE_CHOICE_ANSWER = "single_choice_answer";
        public static final String TABLE_SINGLE_CHOICE_QUESTION = "single_choice_question";
        public static final String TABLE_TRUE_OR_FALSE_QUESTION = "true_and_false_question";
        public static final String TABLE_TRUE_OR_FALSE_ANSWER = "true_and_false_answer";
        public static final String TABLE_USER_SCORE = "user_score";

        //column declarations

        // public static final String STUDENT_NAME = "user_name";

       // public static final String STUDENT_AGE = "age";
       // public static final String USER_NAME = "user_name";
        //public static final String USER_PASSWORD = "user_password";

        //User columns
        public static final String USER_ID = "user_id";
        public static final String USER_PASSWORD = "user_password";
        public static final String USERNAME = "username";
        public static final String EMAIL= "email";


        //Multiple Choice Answer Columns
        public static final String MULTIPLE_CHOICE_ANSWER_ID = "multiple_choice_answer_id";
        public static final String MULTIPLE_CHOICE_ANSWER = "multiple_choice_answer";
        public static final String MULTIPLE_CHOICE_QUESTION_ID_FK = "multiple_choice_question_fk";

        //Multiple Choice Question Columns
        public static final String MULTIPLE_CHOICE_QUESTION_ID = "multiple_choice_question_id";
        public static final String MULTIPLE_CHOICE_QUESTION = "question";
        public static final String MULTIPLE_CHOICE_QUIZ_ID_FK = "quiz";
        public static final String MULTIPLE_CHOICE_QUESTION_INTRO = "question_intro";
        public static final String MULTIPLE_CHOICE_QUESTION_INSTRUCTION ="question_instruction";


        //Single_Choice_Answer columns
        public static final String SINGLE_CHOICE_ANSWER = "single_choice_answer";
        public static final String SINGLE_CHOICE_ANSWER_ID = "single_choice_answer_id";
        public static final String SINGLE_CHOICE_QUESTION_ID_FK = "single_choice_question";

        //Single_Choice_Question Columns
        public static final String SINGLE_CHOICE_QUIZ_ID_FK = "quiz";
        public static final String SINGLE_CHOICE_QUESTION_ID = "quiz_choice_question_id";
        public static final String SINGLE_CHOICE_QUESTION = "single_choice_question";
        public static final String SINGLE_CHOICE_QUESTION_INTRO = "question_intro";
        public static final String SINGLE_CHOICE_QUESTION_INSTRUCTION = "question_instruction";

        //True_Or_False_Answer Columns
        public static final String TRUE_OR_FALSE_ANSWER_ID = "true_and_false_answer_id";
        public static final String TRUE_OR_FALSE_ANSWER = "true_and_false_answer";
        public static final String TRUE_OR_FALSE_QUESTION_ID_FK = "true_and_false_question";

        //True_Or_False_Question Columns
        public static final String TRUE_OR_FALSE_QUIZ_ID_FK = "quiz";
        public static final String TRUE_OR_FALSE_QUESTION_ID = "true_and_false_question_id";
        public static final String TRUE_OR_FALSE_QUESTION = "true_and_false_question";
        public static final String TRUE_OR_FALSE_QUESTION_INTRO = "true_and_false_question_intro";
        public static final String TRUE_OR_FALSE_QUESTION_INSTRUCTION = "true_and_false_question_instruction";

        //Quiz Columns
        public static final String QUIZ_ID = "quiz_id";
        public static final String USER_ID_FK = "user";
        public static final String QUIZ_TYPE = "quiz_type";

        //User_Score Columns
        public static final String USER_SCORE_QUIZ_ID_FK = "quiz";
        public static final String USER_SCORE_ID = "user_score_id";
        public static final String SCORE = "score";




    }

}

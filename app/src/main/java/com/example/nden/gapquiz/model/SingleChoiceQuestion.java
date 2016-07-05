package com.example.nden.gapquiz.model;

/**
 * Created by Nden on 18/06/2016.
 */
public class SingleChoiceQuestion {
   private Quiz mQuiz;
   private int mSingleChoiceQuestionId;
   private String mQuestion;
   private String mQuestionIntro;
   private String mQuestionInstruction;

    public String getmQuestionIntro() {
        return mQuestionIntro;
    }

    public void setmQuestionIntro(String mQuestionIntro) {
        this.mQuestionIntro = mQuestionIntro;
    }

    public Quiz getmQuiz() {
        return mQuiz;
    }

    public void setmQuiz(Quiz mQuiz) {
        this.mQuiz = mQuiz;
    }

    public int getmSingleChoiceQuestionId() {
        return mSingleChoiceQuestionId;
    }

    public void setmSingleChoiceQuestion_id(int mSingleChoiceQuestion) {
        this.mSingleChoiceQuestionId = mSingleChoiceQuestion;
    }

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public String getmQuestionInstruction() {
        return mQuestionInstruction;
    }

    public void setmQuestionInstruction(String mQuestionInstruction) {
        this.mQuestionInstruction = mQuestionInstruction;
    }

}

package com.example.nden.gapquiz.model;

/**
 * Created by Nden on 18/06/2016.
 */
public class TrueAndFalseQuestion {
   private Quiz mQuiz;
   private int mTrueAndFalseQuestionId;
   private String mQuestion;
   private String mQuestionIntro;
   private String mQuestionInstruction;

    public String getmQuestionIntro() {
        return mQuestionIntro;
    }

    public void setmQuestionIntro(String mQUestionIntro) {
        this.mQuestionIntro = mQUestionIntro;
    }

    public String getmQuestionInstruction() {
        return mQuestionInstruction;
    }

    public void setmQuestionInstruction(String mQuestionInstruction) {
        this.mQuestionInstruction = mQuestionInstruction;
    }

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public int getmTrueAndFalseQuestionId() {
        return mTrueAndFalseQuestionId;
    }

    public void setmTrueAndFalseQuestionId(int mTrueAndFalseQuestionId) {
        this.mTrueAndFalseQuestionId = mTrueAndFalseQuestionId;
    }

    public Quiz getmQuiz() {
        return mQuiz;
    }

    public void setmQuiz(Quiz mQuiz) {
        this.mQuiz = mQuiz;
    }


}

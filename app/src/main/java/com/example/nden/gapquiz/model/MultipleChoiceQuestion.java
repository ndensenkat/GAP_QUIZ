package com.example.nden.gapquiz.model;

/**
 * Created by Nden on 18/06/2016.
 */
public class MultipleChoiceQuestion {
   private Quiz mQuiz;
   private int mMultipleChoiceQuestionId;
   private String mQuestion;
    private String mQuestionIntro;
   private String mQuestionInstruction;


    public String getmQuestionIntro() {
        return mQuestionIntro;
    }

    public void setmQuestionIntro(String mQuestionIntro) {
        this.mQuestionIntro = mQuestionIntro;
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

    public int getmMultipleChoiceQuestionId() {
        return mMultipleChoiceQuestionId;
    }

    public void setmMultipleChoiceQuestionId(int mMultipleChoiceQuestionId) {
        this.mMultipleChoiceQuestionId = mMultipleChoiceQuestionId;
    }

    public Quiz getmQuiz() {
        return mQuiz;
    }

    public void setmQuiz(Quiz mQuiz) {
        this.mQuiz = mQuiz;
    }


}

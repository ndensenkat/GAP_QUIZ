package com.example.nden.gapquiz.model;

/**
 * Created by Nden on 18/06/2016.
 */
public class TrueAndFalseAnswer {
    private TrueAndFalseQuestion mTrueAndFalseQuestion;
    private int mTrueAndFalseAnswerId;
    private int mMultipleChoiceAnswerId;
    private String mAnswer;


    public String getmAnswer() {
        return mAnswer;
    }

    public void setmAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }

    public int getmTrueAndFalseAnswerId() {
        return mTrueAndFalseAnswerId;
    }

    public void setmTrueAndFalseAnswerId(int mTrueAndFalseAnswerId) {
        this.mTrueAndFalseAnswerId = mTrueAndFalseAnswerId;
    }

    public TrueAndFalseQuestion getmTrueAndFalseQuestion() {
        return mTrueAndFalseQuestion;
    }

    public void setmTrueAndFalseQuestion(TrueAndFalseQuestion mTrueAndFalseQuestion) {
        this.mTrueAndFalseQuestion = mTrueAndFalseQuestion;
    }


}

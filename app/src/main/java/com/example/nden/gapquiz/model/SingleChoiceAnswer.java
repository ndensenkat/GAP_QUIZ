package com.example.nden.gapquiz.model;

/**
 * Created by Nden on 18/06/2016.
 */
public class SingleChoiceAnswer {
    private SingleChoiceQuestion mSingleChoiceQuestion;
    private int mSingleChoiceAnswerId;
    private String mAnswer;

    public SingleChoiceQuestion getmSingleChoiceQuestion() {
        return mSingleChoiceQuestion;
    }

    public void setmSingleChoiceQuestion(SingleChoiceQuestion mSingleChoiceQuestion) {
        this.mSingleChoiceQuestion = mSingleChoiceQuestion;
    }

    public int getmSingleChoiceAnswerId() {
        return mSingleChoiceAnswerId;
    }

    public void setmSingleChoiceAnswerId(int mSingleChoiceAnswerId) {
        this.mSingleChoiceAnswerId = mSingleChoiceAnswerId;
    }

    public String getmAnswer() {
        return mAnswer;
    }

    public void setmAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }



}

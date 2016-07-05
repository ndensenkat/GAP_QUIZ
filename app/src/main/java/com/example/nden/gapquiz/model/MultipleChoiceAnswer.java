package com.example.nden.gapquiz.model;

/**
 * Created by Nden on 18/06/2016.
 */
public class MultipleChoiceAnswer {
    private MultipleChoiceQuestion mMultipleChoiceQuestion;
    private int mMultipleChoiceAnswerId;
    private String mAnswer;

    public int getmMultipleChoiceAnswerId() {
        return mMultipleChoiceAnswerId;
    }

    public void setmMultipleChoiceAnswerId(int mMultipleChoiceAnswerId) {
        this.mMultipleChoiceAnswerId = mMultipleChoiceAnswerId;
    }

    public String getmAnswer() {
        return mAnswer;
    }

    public void setmAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }

    public MultipleChoiceQuestion getmMultipleChoiceQuestion() {
        return mMultipleChoiceQuestion;
    }

    public void setmMultipleChoiceQuestion(MultipleChoiceQuestion mMultipleChoiceQuestion) {
        this.mMultipleChoiceQuestion = mMultipleChoiceQuestion;
    }

}

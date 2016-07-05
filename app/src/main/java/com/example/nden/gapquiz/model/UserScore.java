package com.example.nden.gapquiz.model;

/**
 * Created by Nden on 18/06/2016.
 */
public class UserScore {
    private Quiz mQuiz;
    private int mUserScoreId;
    private double mScore;

    public int getmUserScoreId() {
        return mUserScoreId;
    }

    public void setmUserScoreId(int mUserScoreId) {
        this.mUserScoreId = mUserScoreId;
    }

    public Quiz getmQuiz() {
        return mQuiz;
    }

    public void setmQuiz(Quiz mQuiz) {
        this.mQuiz = mQuiz;
    }

    public double getmScore() {
        return mScore;
    }

    public void setmScore(double mScore) {
        this.mScore = mScore;
    }

}

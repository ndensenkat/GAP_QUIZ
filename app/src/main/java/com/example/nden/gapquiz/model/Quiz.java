package com.example.nden.gapquiz.model;

/**
 * Created by Nden on 18/06/2016.
 */
public class Quiz {
    private User mUser;
    private int mQuizId;
    private String mQuizType;

    public int getmQuizId() {
        return mQuizId;
    }

    public void setmQuizId(int mQuizId) {
        this.mQuizId = mQuizId;
    }

    public User getmUser() {
        return mUser;
    }

    public void setmUser(User mUser) {
        this.mUser = mUser;
    }

    public String getmQuizType() {
        return mQuizType;
    }

    public void setmQuizType(String mQuizType) {
        this.mQuizType = mQuizType;
    }


}

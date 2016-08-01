package com.example.nden.gapquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nden.gapquiz.Helper.DbHelp;

import java.nio.charset.MalformedInputException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Registration extends AppCompatActivity {
    @BindView(R.id.username)
    EditText mUserNameEditView;
    @BindView(R.id.user_password) EditText mUserPasswordEditView;
    @BindView(R.id.confirm_password) EditText mUserReEnterPasswordEditView;
    private String mConfirmPassword;
    private String mPassword;
    private String mUsername;
    DbHelp mDbHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDbHelp = new DbHelp(this);
        ButterKnife.bind(this);
    }

    public DbHelp getDdHelp()
    {
        return mDbHelp;
    }

    //@OnClick(R.id.register_for_quiz_button)
    public void register(View view)
    {
        switch (view.getId())
        {
            case R.id.register_for_quiz_button:
                EditText mUserNameEditView = (EditText) findViewById(R.id.username);
                EditText mUserPasswordEditView = (EditText) findViewById(R.id.user_password);
                EditText mUserReEnterPasswordEditView = (EditText) findViewById(R.id.confirm_password);
                mUsername = mUserNameEditView.getText().toString();
                mPassword = mUserPasswordEditView.getText().toString();
                mConfirmPassword = mUserReEnterPasswordEditView.getText().toString();

                if(!(mPassword.equals(mConfirmPassword)))
                {
                    Toast.makeText(getBaseContext(), "Password do match", Toast.LENGTH_LONG).show();
                    mUserNameEditView.setText("");
                    mUserPasswordEditView.setText("");
                    mUserReEnterPasswordEditView.setText("");

                }
                else
                {
                    getDdHelp().insertData(getDdHelp(),mUsername,mPassword);
                    Toast.makeText(getBaseContext(),"Registration successful", Toast.LENGTH_LONG).show();
                    finish();
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);

                }
        }

    }


}




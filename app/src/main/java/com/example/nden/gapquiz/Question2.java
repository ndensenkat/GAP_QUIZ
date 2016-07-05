package com.example.nden.gapquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        Intent intent = getIntent();
    }

    public void buttonOnclickNextQ2(View v)
    {
        switch(v.getId())
        {
            case R.id.nextQ2:
            Intent intent = new Intent(this, Question3.class);
            startActivity(intent);
        }
    }

}

package com.example.nden.gapquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        Intent intent = getIntent();
    }
    public void buttonOnClickNextQ3(View v)
    {
        switch(v.getId())
        {
            case R.id.nextActivity:
                Intent intent = new Intent(this, Question4.class);
                startActivity(intent);
        }
    }

}

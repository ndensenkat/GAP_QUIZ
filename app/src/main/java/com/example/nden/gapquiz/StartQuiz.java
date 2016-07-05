package com.example.nden.gapquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class StartQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        Intent In1 = getIntent();
    }
    public void btnOnClickStartQuiz(View v)
    {
        switch (v.getId())
        {
            case R.id.start:
                Intent In = new Intent(this,Question1.class );
                startActivity(In);
                break;
           // case R.id.startQuizBtn:
               // Intent In1 = new Intent(this, StartQuiz.class);
               // startActivity(In1);
               // break;
        }
    }

}

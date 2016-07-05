package com.example.nden.gapquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Question8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);

        Intent intent = getIntent();
    }
    public void buttonOnClickNextQ8(View V)
    {
        switch (V.getId())
        {
            case R.id.nextActivity:
                Intent intent = new Intent(this, Question9.class);
                startActivity(intent);
        }
    }
}

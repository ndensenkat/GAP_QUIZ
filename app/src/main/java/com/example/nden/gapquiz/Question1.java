package com.example.nden.gapquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        Intent intent = getIntent();

        Spinner  spinnerA = (Spinner) findViewById(R.id.opt1A);
        ArrayAdapter adapterA = ArrayAdapter.createFromResource
                (this, R.array.opt1, android.R.layout.simple_spinner_item);
        spinnerA.setAdapter(adapterA);

        Spinner spinnerB = (Spinner) findViewById(R.id.opt1B);
        ArrayAdapter adapterB = ArrayAdapter.createFromResource
                (this, R.array.opt1, android.R.layout.simple_spinner_item);
        spinnerB.setAdapter(adapterB);

        Spinner spinnerC = (Spinner) findViewById(R.id.opt1C);
        ArrayAdapter adapterC = ArrayAdapter.createFromResource
                (this, R.array.opt1, android.R.layout.simple_spinner_item);
        spinnerC.setAdapter(adapterC);

        Spinner spinnerD = (Spinner) findViewById(R.id.opt1D);
        ArrayAdapter adapterD = ArrayAdapter.createFromResource
                (this, R.array.opt1, android.R.layout.simple_spinner_item);
        spinnerD.setAdapter(adapterD);

        Spinner spinnerE = (Spinner) findViewById(R.id.opt1E);
        ArrayAdapter adapterE = ArrayAdapter.createFromResource
                (this, R.array.opt1, android.R.layout.simple_spinner_item);
        spinnerE.setAdapter(adapterE);
    }
    public void buttonOnClickNextQ1(View v)
    {
        switch (v.getId())
        {
            case R.id.nextQ1:
                Intent intent = new Intent(this, Question10.class);
                startActivity(intent);
        }
    }


}

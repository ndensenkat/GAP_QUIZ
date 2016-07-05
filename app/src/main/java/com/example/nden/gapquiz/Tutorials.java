package com.example.nden.gapquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Tutorials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

      ListView listView = (ListView)findViewById(R.id.tutorialListView);
        String [] tutorials = getResources().getStringArray(R.array.Tutorials);
        ListAdapter tutorialAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, tutorials );
        listView.setAdapter(tutorialAdapter);
    }

    public void onListItemClick()
    {

    }

}

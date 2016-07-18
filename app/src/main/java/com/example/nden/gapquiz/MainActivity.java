package com.example.nden.gapquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nden.gapquiz.Helper.DbHelp;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    //@BindView(R.id.username) EditText mUserNameEditView;
    //@BindView(R.id.user_password) EditText mUserPasswordEditView;
    //@BindView(R.id.comfirm_password) EditText mUserReEnterPasswordEditView;
    private String mComfirmPassword;
    private String mPassword;
    private String mUsername;
    public DbHelp mDbHelp = new DbHelp(this);


    public DbHelp getDdHelp(){
        return mDbHelp;
    }

    @OnClick(R.id.register_for_quiz_button)
    public void register(View view) {
        EditText mUserNameEditView = (EditText) findViewById(R.id.username);
        EditText mUserPasswordEditView = (EditText) findViewById(R.id.user_password);
        EditText mUserReEnterPasswordEditView = (EditText) findViewById(R.id.comfirm_password);
        mUsername = mUserNameEditView.getText().toString();
        mPassword = mUserPasswordEditView.getText().toString();
        mComfirmPassword = mUserReEnterPasswordEditView.getText().toString();

        if(!(mPassword.equals(mComfirmPassword))){
            Toast.makeText(getBaseContext(), "Password do match", Toast.LENGTH_LONG).show();
            mUserNameEditView.setText("");
            mUserPasswordEditView.setText("");
            mUserReEnterPasswordEditView.setText("");

        }else {
            getDdHelp().insertData(getDdHelp(),mUsername,mPassword);
            Toast.makeText(getBaseContext(),"Registration successful", Toast.LENGTH_LONG).show();
            finish();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

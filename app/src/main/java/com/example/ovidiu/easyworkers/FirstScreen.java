package com.example.ovidiu.easyworkers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstScreen extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void login(View v) {
        Intent loginIntent = new Intent(this, employee_login.class);
        startActivity(loginIntent);
    }

    public void link(View v){

    }
}

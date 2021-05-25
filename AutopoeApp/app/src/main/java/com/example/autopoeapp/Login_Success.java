package com.example.autopoeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login_Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
    }
    public void onForward(View view) {
        Intent intent = new Intent(this, CarsActivity.class);
        startActivity(intent);
    }
}
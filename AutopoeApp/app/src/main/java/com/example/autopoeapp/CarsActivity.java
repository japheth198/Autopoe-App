package com.example.autopoeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
    }
    public void onOpen(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public void onOpen1(View view) {
        Intent intent = new Intent(this, Order1Activity.class);
        startActivity(intent);
    }

    public void onOpen2(View view) {
        Intent intent = new Intent(this, Order2Activity.class);
        startActivity(intent);
    }
}
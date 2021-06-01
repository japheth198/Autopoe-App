package com.example.autopoeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void onOrder(View view) {
        Intent intent = new Intent(OrderActivity.this, PaymentActivity.class);
        startActivity(intent);
    }


    public void onBack(View view) {
        finish();
        super.onBackPressed();
    }
}
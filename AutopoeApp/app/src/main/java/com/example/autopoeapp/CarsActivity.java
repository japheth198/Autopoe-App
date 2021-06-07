package com.example.autopoeapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.account:
                Intent account = new Intent(CarsActivity.this, AccountActivity.class);
                startActivity(account);
                break;
            case R.id.logout:
                Intent login = new Intent(CarsActivity.this, LoginActivity.class);
                login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(login);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }
}
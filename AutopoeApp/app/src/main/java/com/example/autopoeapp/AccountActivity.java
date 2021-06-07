package com.example.autopoeapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {
    private TextView txtUserEmail,txtUserPw;
    private EditText etLoginGmail,etLoginPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        txtUserEmail=findViewById(R.id.txtEmail);
        txtUserPw = findViewById(R.id.txtPw);

        etLoginGmail = findViewById(R.id.etLogGmail);
        etLoginPassword = findViewById(R.id.etLoginPassword);
    }



}
 package com.example.sdmki.registerandlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import android.content.Intent;


 public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        etUsername.setFocusable(false);
        final EditText etFname = (EditText) findViewById(R.id.etFname);
        etFname.setFocusable(false);
        final TextView WelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);

        Intent intent = getIntent();
        String name = intent.getStringExtra("fname");
        String username = intent.getStringExtra("username");

        String message = "Hello "+ name + " Welcome to your Register And Login App";
        WelcomeMsg.setText(message);
        etUsername.setText(username);
        etFname.setText(name);

    }
}

package com.example.hp.androidform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Form extends AppCompatActivity {

    TextView name, email, password, number, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        name = findViewById(R.id.uname);
        email = findViewById(R.id.email);
        number = findViewById(R.id.number);
        gender = findViewById(R.id.gender);
        password = findViewById(R.id.password);


        Intent i = getIntent();
        name.setText(i.getStringExtra("uname"));
        email.setText(i.getStringExtra("email"));
        password.setText(i.getStringExtra("password"));
        number.setText(i.getStringExtra("number"));
        gender.setText(i.getStringExtra("gender"));


    }
}

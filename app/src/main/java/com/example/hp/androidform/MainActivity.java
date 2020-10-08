package com.example.hp.androidform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText uname, password ,number , email;

    RadioButton male, female;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uname = findViewById(R.id.uname);
        password = findViewById(R.id.password);
        number = findViewById(R.id.number);
        email = findViewById(R.id.email);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String tuname = uname.getText().toString();
            String temail = email.getText().toString();
            String tnumber = number.getText().toString();
            String tpassword = password.getText().toString();
            String gender;

            if(male.isChecked()){
                gender = "Male";
            } else if(female.isChecked()){
                gender = "Female";
            }
            else {
                gender = "Not Defind";
            }

            Intent i = new Intent(MainActivity.this, Form.class);
            i.putExtra("uname",tuname);
            i.putExtra("password",tpassword);
            i.putExtra("number",tnumber);
            i.putExtra("email",temail);
            i.putExtra("gender",gender);

            startActivity(i);
            }
        });

    }
}

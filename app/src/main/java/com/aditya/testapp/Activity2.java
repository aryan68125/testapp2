package com.aditya.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button button;   //initializing widgets
    View view;
    TextView textView;
    EditText editText;
    String email;
    String password;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        editText = findViewById(R.id.textView3); //emailId
        editText2 = findViewById(R.id.textView4); //Password
        button = findViewById(R.id.button3); //login

        button.setOnClickListener(new View.OnClickListener() { //creating click event on button3
            @Override
            public void onClick(View view) {
                //make sure that you declare email and password inside the onClick method
                email = editText.getText().toString(); //saving emailID inside the email using texView3
                password = editText2.getText().toString(); //saving password inside password using textView4
                Intent intent = new Intent(getApplicationContext(), Activity3.class);
                intent.putExtra("email", email);    //these codes are sending data to Activity3
                intent.putExtra("Password", password);
                startActivity(intent);
            }
        });

    }
}


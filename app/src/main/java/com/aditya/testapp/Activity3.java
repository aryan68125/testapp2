package com.aditya.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
TextView textView;
    String email;
    String Password;
View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        textView = findViewById(R.id.textView6);
        //getting the extras from activity2 (getting data from activity2)
        //in order to use extras intent we need to use bundle
        Intent intent = getIntent();
        email = intent.getStringExtra("email"); //intents are case sensitive
        Password = intent.getStringExtra("Password"); //getting data from activity 2 to activity3
        textView.setText(email + " " + Password);

        //set onClickListener on button4
        Button button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent1 = new Intent(getApplicationContext(), Activity4.class);
            startActivity(intent1);
            }
        });

    }
}

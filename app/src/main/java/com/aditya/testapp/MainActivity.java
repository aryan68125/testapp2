package com.aditya.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {  //this will set on click listener on an individual button
            @Override
            public void onClick(View view) {
                /* Intent intent1 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent1); */
                GoTOActivity2();
            }
        });
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToGoogle();
            }
        });

    }

    private void GoToGoogle() {
        Intent intent2 = new Intent(Intent.ACTION_VIEW);
        intent2.setData(Uri.parse(("https://www.google.com"))); //intent to open a web page
        startActivity(intent2);
    }

    private void GoTOActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
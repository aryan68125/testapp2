package com.aditya.testapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class FragActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);

        //linking fragments to the fragActivity
        getSupportFragmentManager().beginTransaction().add( R.id.fragment1, new fragment1()).commit();
    }
}

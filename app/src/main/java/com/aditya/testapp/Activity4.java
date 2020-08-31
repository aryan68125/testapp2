package com.aditya.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        //setting up the gridView in the main Activity and Linking both of them
        GridView gridView = (GridView) findViewById(R.id.gridView); //initializing gridview
        gridView.setAdapter(new Adapter(this));
        //now how to set columns in a gridView
        gridView.setNumColumns(2);

        //Adding click events to items of the gridView items to toast a message and display the clicked items position
       /* gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override  //here position is the item address in the gridView
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //this will generate a message in a toast that will display the item nuber you clicked in the gridView
                Toast.makeText(Activity4.this, "You hit grid item number " + position, Toast.LENGTH_SHORT).show();



            }
        }); */

       //adding click events to items of the gridView
       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               //send intent to single View activity
               Intent intent = new Intent(getApplicationContext(), FragActivity.class);
               //pass the image index value to the intent
               if (position == 3)  //this statement will only allow 4th image to open a new activity and rest og the image wont do anything
               {
                   intent.putExtra("id", position);
                   startActivity(intent);
               }
               else
               {
                   Toast.makeText(Activity4.this, "You hit grid item number " + position, Toast.LENGTH_SHORT).show();
               }
           }
       });

    }
}

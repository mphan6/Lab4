package com.example.mphan6.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static int[] images = {R.drawable.facebook, R.drawable.instagram, R.drawable.snapchat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pull the array of descriptions from xml
        String[] descriptions = getResources().getStringArray(R.array.description_array);
        String[] links = getResources().getStringArray(R.array.links);

        //in order to set up a listView we will need an ArrayAdapter of some kind
        // to work with our customList layout we also need to create a customAdapter class

        //get a refernce to listview in mainactivity
        ListView listview = (ListView) findViewById(R.id.listView);

        //instantiate new custom adapter
        myCustomAdapter myCustomAdapter = new myCustomAdapter(this, descriptions, images, links);

        //connect the  listview with my custom adapter
        listview.setAdapter(myCustomAdapter);
    }
}

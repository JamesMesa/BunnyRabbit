package com.appficial.welcomeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the content view to the activity_main.xml file
        // that is where the bunny rabbit image is located
        setContentView(R.layout.activity_main);
    }
}

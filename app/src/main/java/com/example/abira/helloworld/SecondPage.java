package com.example.abira.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
/**
 * Created by abirami on 1/6/2018.
 * Class to define the Second Page of HelloWorld App
 */

public class SecondPage extends AppCompatActivity {

    /**
     * Method that defines the functionalities of Second Page of
     * Hello World App
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Action on clicking the back button
        Button backButton = findViewById(R.id.button2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent();
                finish();
            }
        });

    }
  }

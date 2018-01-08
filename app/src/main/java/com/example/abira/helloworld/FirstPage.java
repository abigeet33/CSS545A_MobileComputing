package com.example.abira.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
/**
 * Created by abirami on 1/6/2018.
 * Class to define the First Page of HelloWorld App
 */

public class FirstPage extends AppCompatActivity {

    /**
     * Method that defines the functionalities of First Page of
     * Hello World App
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = (EditText) findViewById(R.id.editText1);
        Button nextButton = findViewById(R.id.button1);
        //Action on clicking the next button
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(FirstPage.this, SecondPage.class);
                startActivity(in);
            }
        });
        username.setText("");
    }
}


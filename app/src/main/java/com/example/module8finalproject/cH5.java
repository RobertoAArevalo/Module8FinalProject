/**
 * @author Roberto Arevalo
 * This is to create an Android application with at least 3 screens.
 * CSUMB Module 8 - Android App. Development
 * 4/22/22
 * This application will allow for seeing the chapters covered in Java
 * for CST 338. It uses Java and XML to run.
 * Program specifics: Pixel_3a_API_32_arm64-v8a, Android Gradle Plugin Version
 *
 *
 */
package com.example.module8finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This is a class called Ch 5 which is being called from
 * MainActivity via a function, and it is extending to AppCompatActivity.
 * It will run after the button is clicked from MainActivity.java.
 * A description will be presented for Ch 5 Defining Class II.
 */

public class cH5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.ch5);

        Button cH5_1; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH5_1 = findViewById(R.id.five_1);

        cH5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH5_1.class);
            }
        });

        Button cH5_2; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH5_2 = findViewById(R.id.five_2);

        cH5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH5_2.class);
            }
        });

        Button cH5_3; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH5_3 = findViewById(R.id.five_3);

        cH5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH5_3.class);
            }
        });





        Button backButton; // creates backButton
        backButton = findViewById(R.id.back);
        // matches variable with boxes
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchScene(view, MainActivity.class);
            }
        });
    }


    /**
     * This function takes one from this class to the clsTranfform's class
     * @param view
     */
    public void switchScene(View view, Class<?> b){//starts activity
        Intent intent = new Intent(this, b );
        startActivity(intent);
        finish();
    }
}

//ActionBar actionBar = getSupportActionBar();
//This adds a back button.
//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
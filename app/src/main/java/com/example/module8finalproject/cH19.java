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
 * This is a class called Ch. 19 which is being called from
 * MainActivity via a function, and it is extending to AppCompatActivity.
 * It will run after the button is clicked from MainActivity.java.
 * A description will be presented for Ch. 19: Java Never Ends.
 */
public class cH19 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.ch19);

        Button cH19_1; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH19_1 = findViewById(R.id.nineteen_1);

        cH19_1.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH19_1.class);
            }
        });

        Button cH19_2; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH19_2 = findViewById(R.id.nineteen_2);

        cH19_2.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH19_2.class);
            }
        });

        Button cH19_3; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH19_3 = findViewById(R.id.nineteen_3);

        cH19_3.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH19_3.class);
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
     *
     * @param view
     */
    public void switchScene(View view, Class<?> b) {//starts activity
        Intent intent = new Intent(this, b);
        startActivity(intent);
        finish();
    }
}
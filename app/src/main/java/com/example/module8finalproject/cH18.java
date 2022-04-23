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
 * A description will be presented for Ch. 19.
 */
public class cH18 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.ch18);


        Button cH18_1; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH18_1 = findViewById(R.id.eighteen_1);

        cH18_1.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH18_1.class);
            }
        });

        Button cH18_2; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH18_2 = findViewById(R.id.eighteen_2);

        cH18_2.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH18_2.class);
            }
        });

        Button cH18_3; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH18_3 = findViewById(R.id.eighteen_3);

        cH18_3.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH18_3.class);
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
     * This function takes one from this class to the clsTranform's class
     *
     * @param view
     */
    public void switchScene(View view, Class<?> b) {//starts activity
        Intent intent = new Intent(this, b);
        startActivity(intent);
        finish();
    }
}
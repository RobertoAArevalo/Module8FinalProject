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
 * This is a class called cH2 which is being called from
 * MainActivity via a function, and it is extending to AppCompatActivity.
 * It will run after the button is clicked from MainActivity.java.
 * A description will be presented for topics inside of Ch2 Console input
 * and output.
 */
public class cH2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.ch2);

        Button cH2_SOUTButtonEvent; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH2_SOUTButtonEvent = findViewById(R.id.sout);

        cH2_SOUTButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH2_SOUT.class);
            }
        });

        Button cH2_PackagButtonEvent; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH2_PackagButtonEvent = findViewById(R.id.packages);

        cH2_PackagButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH2_Packag.class);
            }
        });

        Button cH2_IMPButtonEvent; //creates a variable, type button for cH1_OOP
        //Stores the button
        cH2_IMPButtonEvent = findViewById(R.id.imp);

        cH2_IMPButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH2_IMP.class);
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
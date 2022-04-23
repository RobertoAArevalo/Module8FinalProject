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
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


// extending to AppCompatActivity allows for using onCreate
// onCreate makes it so the moment the program reaches
// a specific part it does something else I want it to do

/**
 * This is MainActivity class that
 */



public class MainActivity extends AppCompatActivity {

    /**
     * @param savedInstanceState
     */

    Button googleButtonEvent;//creates a variable, type button google webpage
    Button cH1ButtonEvent; //creates a variable, type button for Ch 1
    Button cH2ButtonEvent; //creates a variable, type button for Ch 2
    Button cH3ButtonEvent; //creates a variable, type button for Ch 3
    Button cH4ButtonEvent; //creates a variable, type button for Ch 4
    Button cH5ButtonEvent; //creates a variable, type button for Ch 5
    Button cH6ButtonEvent; //creates a variable, type button for Ch 6
    Button cH7ButtonEvent; //creates a variable, type button for Ch 7
    Button cH8ButtonEvent; //creates a variable, type button for Ch 8
    Button cH12ButtonEvent; //creates a variable, type button for Ch 12
    Button cH13ButtonEvent; //creates a variable, type button for Ch 13
    Button cH17ButtonEvent; //creates a variable, type button for Ch 17
    Button cH18ButtonEvent; //creates a variable, type button for Ch 18
    Button cH19ButtonEvent; //creates a variable, type button for Ch 19


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Calls the super from onCreate.
        super.onCreate(savedInstanceState);
        //Sets content view base on the XML file.
        setContentView(R.layout.activity_main);
//        System.out.println("called");
        googleButtonEvent = findViewById(R.id.buttonGoogle);
        // matches variable with boxes

        googleButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               System.out.println("button is clicked");
//                Toast.makeText(getApplicationContext(), "Botton Clicked",
//                        Toast.LENGTH_SHORT).show();
                switchScene(view, GoogleActivity.class);
            }
        });

        //Stores the button
        cH1ButtonEvent = findViewById(R.id.Ch1);
        // matches variable with boxes
        cH1ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH1.class);
            }
        });

        //Stores the button
        cH2ButtonEvent = findViewById(R.id.Ch2);
        cH2ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH2.class);
            }
        });
        //Stores the button
        cH3ButtonEvent = findViewById(R.id.Ch3);
        cH3ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH3.class);
            }
        });
        //Stores the button
        cH4ButtonEvent = findViewById(R.id.Ch4);
        cH4ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH4.class);
            }
        });

        //Stores the button
        cH5ButtonEvent = findViewById(R.id.Ch5);
        cH5ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH5.class);
            }
        });

        //Stores the button
        cH6ButtonEvent = findViewById(R.id.Ch6);
        cH6ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH6.class);
            }
        });

        //Stores the button
        cH7ButtonEvent = findViewById(R.id.Ch7);
        cH7ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH7.class);
            }
        });

        //Stores the button
        cH8ButtonEvent = findViewById(R.id.Ch8);
        cH8ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH8.class);
            }
        });

        //Stores the button
        cH12ButtonEvent = findViewById(R.id.Ch12);
        cH12ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH12.class);
            }
        });

        //Stores the button
        cH13ButtonEvent = findViewById(R.id.Ch13);
        cH13ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH13.class);
            }
        });

        //Stores the button
        cH17ButtonEvent = findViewById(R.id.Ch17);
        cH17ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH17.class);
            }
        });

        //Stores the button
        cH18ButtonEvent = findViewById(R.id.Ch18);
        cH18ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH18.class);
            }
        });

        //Stores the button
        cH19ButtonEvent = findViewById(R.id.Ch19);
        cH19ButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            //this will override the function or the onClick attribute
            public void onClick(View view) {
                switchScene(view, cH19.class);
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






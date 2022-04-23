package com.example.module8finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class cH2_SOUT extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch2_sout);

        Button backButton; // creates backButton
        backButton = findViewById(R.id.back);
        // matches variable with boxes
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchScene(view, cH2.class);
            }
        });
    }



    public void switchScene(View view, Class<?> b) {//starts activity
        Intent intent = new Intent(this, b);
        startActivity(intent);
        finish();
    }

}

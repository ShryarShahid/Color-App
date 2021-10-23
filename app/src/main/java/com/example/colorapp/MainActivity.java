package com.example.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button1;
    Button Button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Red(View view) {
        button= findViewById(R.id.buttonRed);
        button.setBackgroundColor(Color.RED);
    }
    public void Blue(View view) {
        button= findViewById(R.id.buttonBlue);
        button.setBackgroundColor(Color.BLUE);
    }
    public void Green(View view) {
        button= findViewById(R.id.buttonGreen);
        button.setBackgroundColor(Color.GREEN);
    }
}
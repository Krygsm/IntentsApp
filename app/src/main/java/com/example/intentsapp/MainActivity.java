package com.example.intentsapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(v ->
        {
            Intent basicIntent1 = new Intent(this, SecondaryActivity.class);
            basicIntent1.putExtra("intentName", "testValue");
            startActivity(basicIntent1);
        });
    }
}
package com.example.intentsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondaryActivity extends AppCompatActivity
{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        textView = findViewById(R.id.submitText);
        Bundle bundle = getIntent().getExtras();
        if(bundle == null) return;

        textView.setText(bundle.getString("intentName"));


    }
}

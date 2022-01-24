package com.example.projekt_na_ocene;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_wpisz_tekst2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpisz_tekst2);

        TextView textView = findViewById(R.id.textView_WP2_wyswietl);
        Intent intent = getIntent();
        String message = intent.getStringExtra("First");
        textView.setText(message);
    }


}
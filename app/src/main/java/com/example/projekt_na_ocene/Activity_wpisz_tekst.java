package com.example.projekt_na_ocene;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_wpisz_tekst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wpisz_tekst);


    }

    public void callActicity_wpisz_tekst2(View v) {
        EditText tekst3 = (EditText)findViewById(R.id.editText_WP_wpisz);
        String tekst4 = tekst3.getText().toString();


        Intent runSecondIntent = new Intent(this, Activity_wpisz_tekst2.class);
        runSecondIntent.putExtra("First", tekst4);

        startActivity(runSecondIntent);
    }

}
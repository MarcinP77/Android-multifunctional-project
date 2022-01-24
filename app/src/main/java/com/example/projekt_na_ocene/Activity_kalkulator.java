package com.example.projekt_na_ocene;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_kalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
    }

    public void dodawanie(View v){
        EditText liczba1 = findViewById(R.id.editTextK1);
        EditText liczba2 = findViewById(R.id.editTextK2);

        TextView result2 = findViewById(R.id.textView_K_result);

        double pierwsza_liczba = Double.valueOf(liczba1.getText().toString());
        double druga_liczba = Double.valueOf(liczba2.getText().toString());

        double wynik = 0;

        wynik = pierwsza_liczba + druga_liczba;

        result2.setText("= "+wynik);
    }

    public void odejmowanie(View v){
        EditText liczba1 = findViewById(R.id.editTextK1);
        EditText liczba2 = findViewById(R.id.editTextK2);

        TextView result2 = findViewById(R.id.textView_K_result);

        double pierwsza_liczba = Double.valueOf(liczba1.getText().toString());
        double druga_liczba = Double.valueOf(liczba2.getText().toString());

        double wynik = 0;

        wynik = pierwsza_liczba - druga_liczba;

        result2.setText("= "+wynik);
    }

    public void mnozenie(View v){
        EditText liczba1 = findViewById(R.id.editTextK1);
        EditText liczba2 = findViewById(R.id.editTextK2);

        TextView result2 = findViewById(R.id.textView_K_result);

        double pierwsza_liczba = Double.valueOf(liczba1.getText().toString());
        double druga_liczba = Double.valueOf(liczba2.getText().toString());

        double wynik = 0;

        wynik = pierwsza_liczba * druga_liczba;

        result2.setText("= "+wynik);
    }

    public void dzielenie(View v){
        EditText liczba1 = findViewById(R.id.editTextK1);
        EditText liczba2 = findViewById(R.id.editTextK2);

        TextView result2 = findViewById(R.id.textView_K_result);

        double pierwsza_liczba = Double.valueOf(liczba1.getText().toString());
        double druga_liczba = Double.valueOf(liczba2.getText().toString());

        double wynik = 0;

        if(druga_liczba == 0)
        {
            result2.setText("Nie można dzielić przez 0, podaj inną liczbę.");
        }
        else
        {
            wynik = pierwsza_liczba / druga_liczba;

            result2.setText("= " + wynik);
        }
    }
}
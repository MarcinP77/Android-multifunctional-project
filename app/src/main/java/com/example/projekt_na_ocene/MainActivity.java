package com.example.projekt_na_ocene;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWithListener = findViewById(R.id.button_o_autorze);
        buttonWithListener.setOnClickListener(myOwnOnClickListener);



    }

    private Button buttonWithListener;
    private Button buttonWithListener2;

    private View.OnClickListener myOwnOnClickListener = new
            View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast();
                }
            };
    private void showToast() {
        Toast.makeText(MainActivity.this,"Autorem tej aplikacji jest MP",
                Toast.LENGTH_LONG).show();
    }

    public void callActivity_ocen_aplikacje(View v) {
        Intent intentWithResult = new Intent(this, Activity_ocen_aplikacje.class);
        startActivityIfNeeded(intentWithResult, 2);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("RESULT");
                TextView result2 = (TextView)findViewById(R.id.textView_ocena);
                result2.setText(result);
            }
        }
    }



    private View.OnClickListener myOwnOnClickListener2 = new
            View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showToast(findViewById(R.id.textView_ocena));
                }
            };
    private void showToast(EditText e) {
        Toast.makeText(MainActivity.this,"Listener called..." + e.getText(),
                Toast.LENGTH_SHORT).show();
    }

    public void FirstActivity(View v) {
        Intent myIntent = new Intent(Intent.ACTION_SET_WALLPAPER);
        startActivity(myIntent);
    }

    public void SecondActivity(View v) {
        Intent mySecondIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.google.pl"));
        startActivity(mySecondIntent);
    }

    public void callActivity_wpisz_tekst(View v) {
        Intent runSecondIntent = new Intent(this, Activity_wpisz_tekst.class);
        startActivity(runSecondIntent);
    }
    
    public void callActivity_kalkulator(View v) {
        Intent runSecondIntent = new Intent(this, Activity_kalkulator.class);
        startActivity(runSecondIntent);
    }



}
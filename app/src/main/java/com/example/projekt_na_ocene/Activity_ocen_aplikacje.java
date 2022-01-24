package com.example.projekt_na_ocene;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_ocen_aplikacje extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocen_aplikacje);

        editTextWithFocusExample = (EditText)findViewById(R.id.editText_AOA_ocena);
        editTextWithFocusExample.setOnFocusChangeListener(myOwnOnFocusChangeListener);



    }



    private EditText editTextWithFocusExample;

    private Button buttonWithListener;

    public void onClick(View v) {
        EditText tekst = (EditText)findViewById(R.id.editText_AOA_ocena);
        String tekst2 = tekst.getText().toString();
        Intent i = new Intent();
        i.putExtra("RESULT",tekst2);
        setResult(RESULT_OK, i);
        finish();
    }

    private View.OnFocusChangeListener myOwnOnFocusChangeListener = new
            View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    checkFocus();
                }
            };
    private void checkFocus() {
        buttonWithListener = (Button)findViewById(R.id.button_AOA_ocen);
        if (editTextWithFocusExample.getText().length() > 0) {
            buttonWithListener.setVisibility(Button.VISIBLE);
        } else {
            buttonWithListener.setVisibility(Button.GONE);
        };
    }

}
package com.example.unii_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView;
    private EditText editText;
    private Button button;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.resultTextView);
        editText = findViewById(R.id.weightEditText);
        button = findViewById(R.id.convertButton);


        button.setOnClickListener(v -> {
            String s = editText.getText().toString();
            if (s.isEmpty()) {
                textView.setText(R.string.please_enter_a_value);
            } else {
               int kg = Integer.parseInt(s);
                double pounds = kg * 2.20462;
                textView.setText(getString(R.string.the_corresponding_value_in_pounds_is) + pounds);
            }
        });



    }
}
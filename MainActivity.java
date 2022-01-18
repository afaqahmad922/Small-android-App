package com.example.shitcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private TextView textView4;
    private EditText editTextTextPersonName2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.button2);
        textView4 = findViewById(R.id.textView4);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editTextTextPersonName2.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = kg / 30.0;
                textView4.setText("The Shit You Throw out of your Ass in KG is " + pound);






            }
        });


    }
}
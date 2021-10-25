package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class secondact extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondact);
        textView= (TextView) findViewById(R.id.textView);
        Intent i= getIntent();
        String valorericevuto= i.getStringExtra("nome");
        textView.setText(valorericevuto);
    }
}
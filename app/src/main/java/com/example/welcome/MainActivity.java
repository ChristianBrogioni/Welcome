package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button reset;
    EditText editText;
    Button test;
    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset= (Button) findViewById(R.id.reset);
        editText= (EditText) findViewById(R.id.editText);
        test= (Button) findViewById(R.id.test);
        play= (Button)findViewById(R.id.play);
    }

    public void resetta(View v){
        editText.getText().clear();
    }

    public void messaggio(View v){
        String message= editText.getText().toString();
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }

    public void lanciaSeconda(View v){
        String text= editText.getText().toString();
        Intent i= new Intent(getApplicationContext(), secondact.class);
        i.putExtra("nome",text);
        startActivity(i);
    }

}
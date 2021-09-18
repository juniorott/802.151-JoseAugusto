package com.example.a802151_provap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCalculadora(View view) {
        Intent it = new Intent(this, MainSegunda.class);
        startActivityForResult(it, 201, null);
    }

}
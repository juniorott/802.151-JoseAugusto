package com.example.a802151_provap1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainSegunda extends AppCompatActivity {
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }
    String Salvar1;
    String Salvar2;
    String Numero;
    Float Resultado2;
    public void voltarComeco(View view) {
        Intent it = new Intent(this, MainActivity.class);
        startActivityForResult(it, 150, null);
    }
    public void operacao(View view){
        Button b = (Button) view;
        b.getText();
        Salvar1 = (String) b.getText();
    }
    public void operacaoSoma(View view){

    }
    public void operacaoSubt(View view){
        if(Salvar1.equals("")){
            
        }
    }
}

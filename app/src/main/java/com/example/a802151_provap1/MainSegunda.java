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
        resultado = findViewById(R.id.textoContas);
        resultado.setText("");
    }
    String Salvar1 = "";
    String Salvar2 = "";
    String Numero = "";
    Float ResConta;
    Integer caso = 0;
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
        if(Salvar1.equals("")){
            resultado.setText(resultado.getText()+" + ");
            Salvar1 = Numero;
            Numero = "";
            caso = 1;
        }
    }
    public void operacaoSubt(View view){
        if(Salvar1.equals("")){
            resultado.setText(resultado.getText()+" - ");
            Salvar1 = Numero;
            Numero = "";
            caso = 2;
        }
    }
    public void operacaoDiv(View view){
        if(Salvar1.equals("")) {
            resultado.setText(resultado.getText()+" / ");
            Salvar1 = Numero;
            Numero = "";
            caso = 3;
        }
    }
    public void operacaoMult(View view){
        if(Salvar1.equals("")){
            resultado.setText(resultado.getText()+" * ");
            Salvar1 = Numero;
            Numero = "";
            caso = 4;
        }
    }
    public void apagarConteudo(View view){
        Salvar1 = "";
        Salvar2 = "";
        Numero = "";
        resultado.setText("");
    }
    public void botaoResultado(View view){
        switch (caso){
            case 1:
                Salvar2 = Numero;
                ResConta = Float.parseFloat(Salvar1) + Float.parseFloat(Salvar2);
                resultado.setText(ResConta.toString());
                break;

            case 2:
                Salvar2 = Numero;
                ResConta = Float.parseFloat(Salvar1) - Float.parseFloat(Salvar2);
                resultado.setText(ResConta.toString());
                break;

            case 3:
                Salvar2 = Numero;
                ResConta = Float.parseFloat(Salvar1) / Float.parseFloat(Salvar2);
                resultado.setText(ResConta.toString());
                break;

            case 4:
                Salvar2 = Numero;
                ResConta = Float.parseFloat(Salvar1) * Float.parseFloat(Salvar2);
                resultado.setText(ResConta.toString());
                break;
        }
    }
}

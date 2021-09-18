package com.example.a802151_provap1.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a802151_provap1.R;
import com.example.a802151_provap1.crud.Dados;
import com.example.a802151_provap1.domain.Produto;
import com.example.a802151_provap1.main.MainActivity;

public class MainSegunda extends AppCompatActivity {
    Produto produto;
    private TextView resultado12345;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        resultado12345 = findViewById(R.id.textoContas);
        resultado12345.setText("");
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
        if(caso == 0){
            Button b = (Button) view;
            Numero = (String) b.getText();
            resultado12345.setText(resultado12345.getText()+Numero);
            Numero = resultado12345.getText().toString();
        }else{
            Button b = (Button) view;
            Numero = (String) b.getText();
            resultado12345.setText(resultado12345.getText()+Numero);
            Numero = resultado12345.getText().toString();
        }
    }
    public void operacaoSoma(View view){
        if(Salvar1.equals("")){
            resultado12345.setText(resultado12345.getText()+" + ");
            Salvar1 = Numero;
            Numero = "";
            caso = 1;
            resultado12345.setText("");
        }
    }
    public void operacaoSubt(View view){
        if(Salvar1.equals("")){
            resultado12345.setText(resultado12345.getText()+" - ");
            Salvar1 = Numero;
            Numero = "";
            caso = 2;
            resultado12345.setText("");
        }
    }
    public void operacaoDiv(View view){
        if(Salvar1.equals("")) {
            resultado12345.setText(resultado12345.getText()+" / ");
            Salvar1 = Numero;
            Numero = "";
            caso = 3;
            resultado12345.setText("");
        }
    }
    public void operacaoMult(View view){
        if(Salvar1.equals("")){
            resultado12345.setText(resultado12345.getText()+" * ");
            Salvar1 = Numero;
            Numero = "";
            caso = 4;
            resultado12345.setText("");
        }
    }
    public void apagarConteudo(View view){
        Salvar1 = "";
        Salvar2 = "";
        Numero = "";
        caso = 0;
        resultado12345.setText("");
    }
    public void botaoResultado(View view){
        produto = new Produto();
        switch (caso){
            case 1:
                Salvar2 = Numero;
                ResConta = Float.parseFloat(Salvar1) + Float.parseFloat(Salvar2);
                resultado12345.setText(ResConta.toString());
                break;

            case 2:
                Salvar2 = Numero;
                ResConta = Float.parseFloat(Salvar1) - Float.parseFloat(Salvar2);
                resultado12345.setText(ResConta.toString());
                break;

            case 3:
                Salvar2 = Numero;
                ResConta = Float.parseFloat(Salvar1) / Float.parseFloat(Salvar2);
                resultado12345.setText(ResConta.toString());
                break;

            case 4:
                Salvar2 = Numero;
                ResConta = Float.parseFloat(Salvar1) * Float.parseFloat(Salvar2);
                resultado12345.setText(ResConta.toString());
                break;
        }
        produto.setValoresGuardados(ResConta.toString());
        Dados.salvar(produto);
        setResult(RESULT_OK);
        finish();
    }
}

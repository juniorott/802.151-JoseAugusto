package com.example.a802151_provap1.main;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a802151_provap1.R;
import com.example.a802151_provap1.crud.Dados;
import com.example.a802151_provap1.domain.Produto;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.listaContas);
        atualiza();
    }

    private void atualiza() {
        if (adapter == null) {
            adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,
                    Dados.getLista());
            lista.setAdapter(adapter);
        } else
            adapter.notifyDataSetChanged();
    }

    public void abrirCalculadora(View view) {
        Intent it = new Intent(this, MainSegunda.class);
        startActivityForResult(it, 201, null);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 201) {
            if (resultCode == RESULT_OK) {
                atualiza();
                Toast.makeText(this, "Ta lá", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "F, bugou", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
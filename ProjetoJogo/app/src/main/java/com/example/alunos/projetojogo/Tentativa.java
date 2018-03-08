package com.example.alunos.projetojogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tentativa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentativa);

        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();

        String tentativas = pacote.getString("tentativa");
        TextView textoV = (TextView) findViewById(R.id.textoV);
        textoV.setText(tentativas);
    }
}

package com.example.alunos.aplicaointerface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;



import java.util.ArrayList;

import model.contato;


public class MainActivity extends AppCompatActivity {
    private ArrayList<contato> listacontatos;
    RecyclerView rview;


    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);


    }
    public void Salvar(){
        EditText nome = (EditText) findViewById(R.id.editNome);
        EditText telefone = (EditText) findViewById(R.id.editTelefone);
        listacontatos = new ArrayList<>();
        String N;
        String T;
        N = nome.getText().toString();
        T = telefone.getText().toString();
        listacontatos.add(new contato(N,T));
    }
    public void Exibir(){
       Intent it = new Intent(this, mostrarContato.class);
       Bundle bundle = new Bundle();
       bundle.putParcelableArrayList("contatos",listacontatos);
       it.putExtras(bundle);
       startActivity(it);
    }
}

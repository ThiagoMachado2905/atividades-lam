package com.example.alunos.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.example.alunos.recyclerview.adapter.LivroAdapter;

import java.util.ArrayList;

import model.Livro;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Livro> listaLivros;
    RecyclerView rview;
    RecyclerView.LayoutManager layout;
    LivroAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rview = findViewById(R.id.recyclerView);
        listaLivros = new ArrayList<>();

        listaLivros.add(new Livro("O Senhor dos Anéis","J.R.R.Tolkien","Fantasia épica entre os elfos e magos e duendes"));
        listaLivros.add(new Livro("Uma breve história do Tempo","Stephen W. Hawking","Uma introdução a alguns conceitos da física"));
        listaLivros.add(new Livro("A espada das Galáxias","Marcelo Cassano","A premiada ficção cientificaonde alienigenas"));
        adapter = new LivroAdapter(listaLivros, this);
        rview.setAdapter(adapter);
        layout = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        rview.setLayoutManager(layout);
    }
    public void Adicionar(View v){
        EditText editTitulo = findViewById(R.id.editTitulo);
        EditText editAutor = findViewById(R.id.editAutor);
        EditText editDesc = findViewById(R.id.editDesc);
        String t,a,d;
        t=editTitulo.getText().toString();
        a=editAutor.getText().toString();
        d=editDesc.getText().toString();
        listaLivros.add(new Livro(t,a,d));
        adapter.notifyDataSetChanged();

    }
}

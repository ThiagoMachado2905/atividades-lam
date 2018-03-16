package com.example.alunos.thiagoproejto;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Curso> cursos = listaTodosOsCursos();
        ListView listaDeCursor = (ListView) findViewById(R.id.list);
        CursoAdapter adapter = new CursoAdapter(cursos,this);
        listaDeCursor.setAdapter(adapter);

    }
    private ArrayList<Curso> listaTodosOsCursos(){
        ArrayList<Curso> cursos = new ArrayList<>();
        Curso java = new Curso();
        java.setNome("Java ");
        java.setDescricao("Java básico");
        java.setImageId(R.mipmap.ic_launcher);
        cursos.add(java);

        Curso cpp = new Curso();
        cpp.setNome("C++");
        cpp.setDescricao("C++ básico");
        cpp.setImageId(R.mipmap.ic_launcher);
        cursos.add(cpp);

        return cursos;
    }
}
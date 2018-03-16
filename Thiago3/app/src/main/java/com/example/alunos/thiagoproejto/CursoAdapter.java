package com.example.alunos.thiagoproejto;


import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alunos on 16/03/18.
 */

public class CursoAdapter extends BaseAdapter{
    List<Curso> lista;
    Activity atividade;

    public CursoAdapter(List<Curso> aLista, Activity aAtividade){
        this.lista = aLista;
        this.atividade = aAtividade;
    }

    @Override
    public Object getItem(int position){
        return lista.get(position);
    }
    @Override
    public int getCount(){
        return 0;
    }
    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = atividade.getLayoutInflater().inflate(R.layout.layout_linha,parent,false);
        Curso curso = lista.get(position);
        
        //pegando as refêrencias das Views
        TextView nome = (TextView) v.findViewById(R.id.lblNomeCurso);
        TextView descricao = (TextView) v.findViewById(R.id.lblDesCurso);
        ImageView imagem = (ImageView) v.findViewById(R.id.imgCurso);

        nome.setText(curso.getNome());
        descricao.setText(curso.getDescricao());
        imagem.setImageResource(curso.getImageId());

        return v;
    }
}

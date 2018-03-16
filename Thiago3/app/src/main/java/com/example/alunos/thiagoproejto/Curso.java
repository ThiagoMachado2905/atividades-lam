package com.example.alunos.thiagoproejto;

/**
 * Created by alunos on 16/03/18.
 */

public class Curso {
    private String nome;
    private String descricao;
    private int imageId;
    void setNome(String v){
        this.nome = v;
    }
    void setDescricao(String v){
        this.descricao = v;
    }
    void setImageId(int v){
        this.imageId = v;
    }
    String getNome(){
        return this.nome;
    }
    String getDescricao(){
        return this.descricao;
    }
    int getImageId(){return this.imageId;}
}

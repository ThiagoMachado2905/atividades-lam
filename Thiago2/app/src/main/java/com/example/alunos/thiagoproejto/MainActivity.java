package com.example.alunos.thiagoproejto;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = {"Android","IOS","Windows Phone","BerryOS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,values);
        setListAdapter(adapter);
    }
    protected void onListItemClick(ListView l,View v,int position,long id){

        super.onListItemClick(l,v,position,id);
        //Posição do item tocado
        int itemPosition = position;
        //Recupera o valor do item tocado
        String itemValue = (String) l.getItemAtPosition(position);

        Toast toat = Toast.makeText(getApplicationContext(),itemValue,Toast.LENGTH_SHORT);
        toat.show();
    }
}
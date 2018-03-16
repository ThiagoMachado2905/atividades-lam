package com.example.alunos.thiagoproejto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = {"Android", "IOS", "Windows Phone", "BerryOS"};
        final ArrayList<String> theArray = new ArrayList<>();
        for (int i = 0; i < values.length; ++i) {
            theArray.add(values[i]);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.simple_list_item, R.id.lblfirst, theArray);
        ListView lista = findViewById(R.id.lista);
        lista.setAdapter(adapter);
    }
}
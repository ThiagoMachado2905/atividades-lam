package com.example.alunos.projetojogo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
int num;
int tentativa = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        num = r.nextInt(10)+1;
    }
    public void adivinhar(View v){
        EditText txtadi = (EditText) findViewById(R.id.txtadi);
        TextView textodica = (TextView) findViewById(R.id.textodica);
        TextView textoten = (TextView) findViewById(R.id.textoten);
        TextView textoresult = (TextView) findViewById(R.id.textoresult);
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        String nume = txtadi.getText().toString();
        if(nume.matches("")){
            Toast toast = Toast.makeText(getApplicationContext(),"Digite um numero",Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        int numero;
        numero = Integer.parseInt(nume);
        String tent;
        tent = Integer.toString(tentativa);
        if(numero == num){
            textoresult.setText("Você conseguiu parabéns");
            //textoten.setText(tent);
            Intent i = new Intent(MainActivity.this,Tentativa.class);

            Bundle bundle = new Bundle();
            bundle.putString("tentativa",tent);
            i.putExtras(bundle);
            startActivity(i);
        }else{
            if(numero > num){
                textodica.setText("O numero sorteado é menor");
            }else{
                textodica.setText("O numero sorteado é maior");
            }
            tentativa++;
            tent = Integer.toString(tentativa);
        }
        SharedPreferences.Editor editor = arquivo.edit();
        editor.putString("tentativa",tent);
        editor.commit();
    }
}

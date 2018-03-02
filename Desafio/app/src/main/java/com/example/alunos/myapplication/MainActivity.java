package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sortear(View v){
        EditText userinput = (EditText) findViewById(R.id.textoentrada);
        TextView texto = (TextView) findViewById(R.id.texto);
        TextView textoerro = (TextView) findViewById(R.id.textoerro);
        TextView textodica = (TextView) findViewById(R.id.textodica);
        Random r = new Random();
        int num;
        int erros = 0;
        num = r.nextInt(10)+1;
        String p;
        p = Integer.toString(num);
        //texto.setText(p);
        String adi = userinput.getText().toString();
        //texto.setText(adi);
        int numero = Integer.parseInt(adi);
        if(numero == num){
            texto.setText("Voce acertou o numero");
        }else{
            texto.setText("Voce errou");
            if(numero > num){
                textodica.setText("O numero sorteado era menor");
            }else{
                textodica.setText("O numero sorteado era maior");
            }
            erros++;
        }
        if(erros==3){
            textoerro.setText(p);
        }
    }
}

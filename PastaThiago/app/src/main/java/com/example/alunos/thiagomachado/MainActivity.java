package com.example.alunos.thiagomachado;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView nome;
    private TextView sobrenome;
    private TextView email;
    private TextView endereco;
    private TextView cidade;
    private TextView estado;
    private TextView username;
    private TextView senha;
    private TextView nascimento;
    private TextView telefone;
    private ImageView foto;
    private ProgressBar load;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetJson download = new GetJson();

        load = (ProgressBar) findViewById(R.id.simpleProgressBar);

        nome = (TextView) findViewById(R.id.txtNome);
        sobrenome = (TextView) findViewById(R.id.txtSobrenome);
        email = (TextView) findViewById(R.id.txtEmail);
        endereco = (TextView) findViewById(R.id.txtEndereco);
        cidade = (TextView) findViewById(R.id.txtCidade);
        estado = (TextView) findViewById(R.id.txtEstado);
        username = (TextView) findViewById(R.id.txtUsername);
        senha = (TextView) findViewById(R.id.txtSenha);
        nascimento = (TextView) findViewById(R.id.txtNascimento);
        telefone = (TextView) findViewById(R.id.txtTelefone);
        foto = (ImageView) findViewById(R.id.imageView1);

        download.execute();

    }
    private class GetJson extends AsyncTask<Void, Void, FakeUser>{

        @Override
        protected void onPreExecute(){
            load.setVisibility(View.VISIBLE);
        }
        @Override
        protected FakeUser doInBackground(Void... params){
            Utils util = new Utils();

            return util.getInformacao("https://randomuser.me/api/0.7");
        }

        @Override
        protected void onPostExecute(FakeUser pessoa){
            String strNome = pessoa.getNome().substring(0,1).toUpperCase()
                    + pessoa.getNome().substring(1);
            nome.setText(strNome);
            String strSobrenome = pessoa.getSobrenome().substring(0,1).toUpperCase()
                    + pessoa.getSobrenome().substring(1);
            sobrenome.setText(strSobrenome);
            email.setText(pessoa.getEmail());
            endereco.setText(pessoa.getEndereco());
            String strCidade = pessoa.getCidade().substring(0,1).toUpperCase()
                    + pessoa.getCidade().substring(1);
            cidade.setText(strCidade);
            estado.setText(pessoa.getEstado());
            username.setText(pessoa.getUsername());
            senha.setText(pessoa.getSenha());
            nascimento.setText(pessoa.getNascimento());
            telefone.setText(pessoa.getTelefone());
            foto.setImageBitmap(pessoa.getFoto());
            load.setVisibility(View.GONE);
        }
    }
}




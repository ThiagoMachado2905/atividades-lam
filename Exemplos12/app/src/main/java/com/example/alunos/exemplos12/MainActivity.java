package com.example.alunos.exemplos12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResposta = (TextView) findViewById(R.id.txtResposta);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.checkBox1:
                if(checked)
                    txtResposta.setText("Marcado opção 1");
                break;
            case R.id.checkBox2:
                if (checked)
                    txtResposta.setText("Marcado opção 2");
                break;
            case R.id.checkBox3:
                if (checked)
                    txtResposta.setText("Marcado opção 3");
                break;

        }
    }

}

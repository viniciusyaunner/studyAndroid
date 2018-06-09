package com.example.manager.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nome,idade;
    EditText resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.nome);
        idade = (EditText) findViewById(R.id.idade);
        Button btnExibir = (Button) findViewById(R.id.btnExibir);
        resultado = (EditText) findViewById(R.id.resultado);
        btnExibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Texto = nome.getText().toString()+
                        "-" + idade.getText().toString();
                resultado.setText(Texto);

            }
        });
    }
}

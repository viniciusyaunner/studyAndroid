package com.example.manager.appimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
    EditText peso, altura, resultado;
    Button btncalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = (EditText) findViewById(R.id.peso);
        altura = (EditText) findViewById(R.id.altura);
        resultado = (EditText) findViewById(R.id.resultado);
        btncalcular = (Button) findViewById(R.id.btncalcular);
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(peso.getText().toString());
                double num2 = Double.parseDouble(altura.getText().toString());
                double res = num1/(num2*num2);
                resultado.setText(String.valueOf(res));
            }
        });
    }
}

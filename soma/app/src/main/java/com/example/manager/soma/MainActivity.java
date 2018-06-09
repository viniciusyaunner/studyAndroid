package com.example.manager.soma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2, Resultado;
    Button BtnSomar, Btnmult, BtnSub, Btndiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        Resultado = (EditText) findViewById(R.id.Resultado);
        Button  BtnSomar = (Button) findViewById(R.id.BtnSomar);
        Button  Btnmult = (Button) findViewById(R.id.Btnmult);
        Button  BtnSub = (Button) findViewById(R.id.BtnSub);
        Button  Btndiv = (Button) findViewById(R.id.Btndiv);
        BtnSomar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double res = num1+num2;
                Resultado.setText(String.valueOf(res));

            }
        });
        Btnmult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double res = num1*num2;
                Resultado.setText(String.valueOf(res));

            }
        });
        BtnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double res = num1-num2;
                Resultado.setText(String.valueOf(res));

            }
        });
        Btndiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double res = num1/num2;
                Resultado.setText(String.valueOf(res));

            }
        });
    }
}

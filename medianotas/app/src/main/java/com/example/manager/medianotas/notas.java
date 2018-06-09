package com.example.manager.medianotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class notas extends AppCompatActivity {
    EditText n1, n2, n3, resultado, ver;
    Button cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        n1=(EditText) findViewById(R.id.n1);
        n2=(EditText) findViewById(R.id.n2);
        n3=(EditText) findViewById(R.id.n3);
        resultado=(EditText) findViewById(R.id.resultado);
        ver=(EditText) findViewById(R.id.ver);
        Button cal=(Button) findViewById(R.id.cal);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nu1= Double.parseDouble(n1.getText().toString());
                double nu2= Double.parseDouble(n2.getText().toString());
                double nu3= Double.parseDouble(n3.getText().toString());
                double res= (nu1+nu2+nu3)/3;
                resultado.setText(String.valueOf(res));
                if(res>7){
                    String  texto="Aluno Aprovado";
                    ver.setText(texto);
                }else{
                    String texto="Aluno Reprovado";
                    ver.setText(texto);
                }
            }
        });
    }
}

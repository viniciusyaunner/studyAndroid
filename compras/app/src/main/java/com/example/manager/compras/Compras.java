package com.example.manager.compras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Compras extends AppCompatActivity {
    CheckBox arroz, leite, carne, feijao;
    EditText resultado;
    Button total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);
        resultado=(EditText) findViewById(R.id.resultado);
        arroz=(CheckBox) findViewById(R.id.arroz);
        leite=(CheckBox) findViewById(R.id.leite);
        carne=(CheckBox) findViewById(R.id.carne);
        feijao=(CheckBox) findViewById(R.id.feijao);
        total=(Button) findViewById(R.id.total);
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double t = 0;
                if (arroz.isChecked())
                    t += 11.39;
                if (leite.isChecked())
                    t += 2.39;
                if (carne.isChecked())
                    t += 15.90;
                if (feijao.isChecked())
                    t += 9.60;
                resultado.setText(String.valueOf(t));
            }
        });
    }
}

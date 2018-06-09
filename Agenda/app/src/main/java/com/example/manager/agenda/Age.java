package com.example.manager.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Age extends AppCompatActivity {
    EditText nome, local,data,hor,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        nome=(EditText)findViewById(R.id.nome);
        local=(EditText)findViewById(R.id.local);
        data=(EditText)findViewById(R.id.data);
        hor= (EditText)findViewById(R.id.hor);
        res=(EditText)findViewById(R.id.res);
        Button btnExib=(Button)findViewById(R.id.btnExib);
        btnExib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = nome.getText().toString()+"-"+local.getText().toString();
                
            }
        })
    }
}

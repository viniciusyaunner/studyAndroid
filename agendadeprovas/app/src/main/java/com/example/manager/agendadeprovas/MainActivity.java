package com.example.manager.agendadeprovas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText dis, ddp, cont, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dis = (EditText)findViewById(R.id.dis);
        ddp = (EditText)findViewById(R.id.ddp);
        cont = (EditText)findViewById(R.id.cont);
        res = (EditText)findViewById(R.id.res);
        btnExibir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String texto = dis.getText().toString()+"-"+ddp.getText().toString()+"-"+cont.getText().toString();
                res.setText(texto);
            }
        }
    }
}

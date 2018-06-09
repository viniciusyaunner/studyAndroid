package com.example.manager.lancho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Lanchonete extends AppCompatActivity {
    CheckBox pic, xs,xb,tpic,coca,suco;
    Button total;
    EditText resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanchonete);
        resultado = (EditText) findViewById(R.id.resultado);
        pic = (CheckBox) findViewById(R.id.pic);
        xs= (CheckBox) findViewById(R.id.xs);
        xb= (CheckBox) findViewById(R.id.xb);
        tpic=(CheckBox) findViewById(R.id.tpic);
        coca=(CheckBox) findViewById(R.id.coca);
        suco=(CheckBox) findViewById(R.id.suco);
        total=(Button) findViewById(R.id.total);
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double t =0;
                if(pic.isChecked())
                    t+= 19.50;
                if (xs.isChecked())
                    t+= 10.50;
                if(xb.isChecked())
                    t+= 15.50;
                if(tpic.isChecked())
                    t+= 26.80;
                if(coca.isChecked())
                    t+= 3.50;
                if(suco.isChecked())
                    t+= 7.50;
                resultado.setText(String.valueOf(t));
            }
        });
    }
}

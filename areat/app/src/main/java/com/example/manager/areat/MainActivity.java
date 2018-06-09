package com.example.manager.areat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText base, alt, resultado;
    Button cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base=(EditText) findViewById(R.id.base);
        alt=(EditText) findViewById(R.id.alt);
        resultado=(EditText) findViewById(R.id.resultado);
        Button cal=(Button) findViewById(R.id.cal);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(base.getText().toString());
                double n2 = Double.parseDouble(alt.getText().toString());
                double res = (n1*n2)/2;
                resultado.setText(String.valueOf(res));
            }
        });
    }
}

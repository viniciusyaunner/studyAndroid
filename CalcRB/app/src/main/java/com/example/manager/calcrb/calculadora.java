package com.example.manager.calcrb;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class calculadora extends AppCompatActivity {
    EditText txt1, txt2;
    RadioGroup op;
    Button calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        op = (RadioGroup) findViewById(R.id.op);
        calc = (Button) findViewById(R.id.calc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double t1 = Double.parseDouble(txt1.getText().toString());
                double t2 = Double.parseDouble(txt2.getText().toString());
                double res = 0;
                int opc = op.getCheckedRadioButtonId();
                if(opc == R.id.soma)
                    res = t1 + t2;
                if(opc == R.id.div)
                    res = t1 / t2;
                if(opc == R.id.mult)
                    res = t1 * t2;
                if(opc == R.id.sub)
                    res = t1 - t2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(calculadora.this);
                dialogo.setTitle("Resultado");
                dialogo.setMessage("Seu resultado é: " + String.valueOf(res));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}

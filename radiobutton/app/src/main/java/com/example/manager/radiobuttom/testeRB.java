package com.example.manager.radiobuttom;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class testeRB extends AppCompatActivity {
    EditText salario;
    RadioButton rb40, rb45, rb50;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_rb);
        salario = (EditText)findViewById(R.id.salario);
        rb40 = (RadioButton)findViewById(R.id.rb40);
        rb45 = (RadioButton)findViewById(R.id.rb45);
        rb50 = (RadioButton)findViewById(R.id.rb50);
        calc = (Button)findViewById(R.id.calc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sal, novosal=0.00;
                sal= Double.parseDouble(salario.getText().toString());
                if (rb40.isChecked())
                    novosal =sal+(sal*0.4);
                if (rb45.isChecked())
                    novosal =sal+(sal*0.45);
                if (rb50.isChecked())
                    novosal =sal+(sal*0.5);
                AlertDialog.Builder dialogo = new AlertDialog.Builder(testeRB.this);
                dialogo.setTitle("Novo salario");
                dialogo.setMessage("seu novo salario é: R$" + String.valueOf(novosal));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}

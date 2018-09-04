package com.example.manager.vestibulinho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class etecmam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etecmam);
        Button curso = (Button) findViewById(R.id.curso);
        curso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocamenu = new Intent(etecmam.this, cursos.class);
                etecmam.this.startActivity(trocamenu);
                etecmam.this.finish();
            }
        });
        ImageButton fecha = (ImageButton) findViewById(R.id.fecha);
        fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etecmam.this.finish();
            }
        });
    }
}

package com.example.manager.jogos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        Button voltarf = (Button) findViewById(R.id.voltarf);
        voltarf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca2 = new Intent(Tela3.this,MainActivity.class);
                Tela3.this.startActivity(troca2);
                Tela3.this.finish();
            }
        });
    }
}

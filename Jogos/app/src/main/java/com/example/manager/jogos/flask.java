package com.example.manager.jogos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class flask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flask);

        Button voltarf = (Button) findViewById(R.id.voltarf);
        voltarf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca2 = new Intent(flask.this,MainActivity.class);
                flask.this.startActivity(troca2);
                flask.this.finish();
            }
        });
    }
}

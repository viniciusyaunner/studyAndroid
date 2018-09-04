package com.example.manager.jogos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button kivybtn = (Button) findViewById(R.id.kivybtn);
        kivybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca = new Intent(MainActivity.this,Kivy.class);
                MainActivity.this.startActivity(troca);
                MainActivity.this.finish();
            }
        });
        Button flaskbtn = (Button) findViewById(R.id.flaskbtn);
        flaskbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca1 = new Intent(MainActivity.this,Tela3.class);
                MainActivity.this.startActivity(troca1);
                MainActivity.this.finish();
            }
        });
    }
}

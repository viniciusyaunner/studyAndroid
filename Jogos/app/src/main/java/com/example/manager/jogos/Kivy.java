package com.example.manager.jogos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kivy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kivy);

        Button voltark = (Button) findViewById(R.id.voltark);
        voltark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent troca = new Intent(Kivy.this,MainActivity.class);
                Kivy.this.startActivity(troca);
                Kivy.this.finish();
            }
        });
    }
}

package com.example.kingswolf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class torkamansahraActivity extends AppCompatActivity {

    Button bargasht;
    Button mddd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torkamansahra);
        bargasht=findViewById(R.id.dsff);
        mddd=findViewById(R.id.lwda);
        bargasht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent margan=new Intent(torkamansahraActivity.this,marganehActivity.class);
                startActivity(margan);
            }
        });
    }
}

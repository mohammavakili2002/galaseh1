package com.example.kingswolf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class marganehActivity extends AppCompatActivity {
Button back;
Button mortabet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marganeh);
        back=findViewById(R.id.back);
        mortabet=findViewById(R.id.fele);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mortabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent torkaman=new Intent(marganehActivity.this,torkamansahraActivity.class);
                startActivity(torkaman);

            }
        });
    }
}

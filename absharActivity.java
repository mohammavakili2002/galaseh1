package com.example.kingswolf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class absharActivity extends AppCompatActivity {

    Button forbac;
    Button dsfsds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abshar);
        forbac=findViewById(R.id.klfd);
        dsfsds=findViewById(R.id.jlfds);
        forbac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        dsfsds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bbgff=new Intent(absharActivity.this,pelehActivity.class);
                startActivity(bbgff);
            }
        });
    }
}

package com.example.kingswolf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class koohminiActivity extends AppCompatActivity {
Button bayadbargasht;
Button peydaertab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koohmini);
        peydaertab=findViewById(R.id.peydaertebatgfdfs);
        bayadbargasht=findViewById(R.id.bayedbargasht);
        bayadbargasht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

       peydaertab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fdsd=new Intent(koohminiActivity.this,Main3Activity.class);
                startActivity(fdsd);
            }
        });
    }
}

package com.example.kingswolf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

//this is test
Button back;
Button azeenvarbeoonvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        back = findViewbyid(R.id.bargashtdorost);
        azeenvarbeoonvar = findViewbyid(R.id.rabetahbayadpeydakard);

        Intent intent=getIntent();

                back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        azeenvarbeoonvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent torkaman=new Intent(marganehActivity.this,torkamansahraActivity.class);
                startActivity(torkaman);

            }
        });

    }
}

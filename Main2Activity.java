package com.example.kingswolf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView hi;
Button back;
ImageButton margan;
ImageButton meeneya;
ImageButton cheshm;
ImageButton damavand;
ImageButton torkaman;
ImageButton abshar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hi=findViewById(R.id.rrr);
        back=findViewById(R.id.back);
        margan=findViewById(R.id.margan);
        meeneya=findViewById(R.id.meeneya);
        cheshm=findViewById(R.id.cheshm);
        damavand=findViewById(R.id.damavandrrrjgukyf);
        torkaman=findViewById(R.id.torkaman);
        abshar=findViewById(R.id.abshar1);
        Intent NAME=getIntent();
        String name=NAME.getStringExtra("name");

        hi.setText("سلام "+ name+ "\n" +"این نرم افزار تمام تلاش خود را برای معرفی مناظر زیبا و طبیعی ایران به شما می کند." +"\n"+"ودر پی گسترش این نرم افزار به صورت روز افزون می کوشیم.");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        margan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent marganeb=new Intent(Main2Activity.this,marganehActivity.class);
                startActivity(marganeb);
            }
        });

        meeneya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meeneyator=new Intent(Main2Activity.this,koohminiActivity.class);
                startActivity(meeneyator);
            }
        });

        cheshm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cheshmeh1=new Intent(Main2Activity.this,pelehActivity.class);
                startActivity(cheshmeh1);
            }
        });

        damavand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

        torkaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tory= new Intent(Main2Activity.this,torkamansahraActivity.class);
                startActivity(tory);
            }
        });

        abshar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent absh=new Intent(Main2Activity.this,absharActivity.class);
                startActivity(absh);
            }
        });







    }
}

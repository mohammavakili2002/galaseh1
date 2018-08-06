package com.example.kingswolf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pelehActivity extends AppCompatActivity {
Button back2;
Button ermklw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peleh);
        back2=findViewById(R.id.fdfd2);
        ermklw=findViewById(R.id.efsdsd);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ermklw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fsfd=new Intent(pelehActivity.this,absharActivity.class);
                startActivity(fsfd);
            }
        });


    }
}

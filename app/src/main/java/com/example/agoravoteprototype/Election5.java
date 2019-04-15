package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Election5 extends AppCompatActivity {
    Button previous_btn3,next_btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election5);
        previous_btn3=(Button)findViewById(R.id.previousbtn2);
        next_btn3=(Button)findViewById(R.id.nextbtn3);
        previous_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11=new Intent(Election5.this,Election4.class);
                startActivity(intent11);
            }
        });


        next_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(Election5.this,Election6.class);
                startActivity(intent12);
            }
        });

    }
}

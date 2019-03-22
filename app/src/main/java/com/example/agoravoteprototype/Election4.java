package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Election4 extends AppCompatActivity {
    Button nextbtn2,addmore_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election4);
        nextbtn2=(Button)findViewById(R.id.nextbtn2);
        addmore_btn=(Button)findViewById(R.id.addmore_btn);
        addmore_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11=new Intent(Election4.this,Election3.class);
                startActivity(intent11);
            }
        });
        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12=new Intent(Election4.this,Election5.class);
                startActivity(intent12);
            }
        });

    }
}

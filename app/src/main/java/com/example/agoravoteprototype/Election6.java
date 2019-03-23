package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class Election6 extends AppCompatActivity {
    Button next_btn4,previous_btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election6);
        previous_btn4=(Button) findViewById(R.id.previousbtn4);
        next_btn4=(Button)findViewById(R.id.nextbtn4);
        next_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(Election6.this,Dashboard.class);
                startActivity(intent13);
                Toast.makeText(Election6.this, "Election has been successfully created", Toast.LENGTH_SHORT).show();
            }
        });
        previous_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13=new Intent(Election6.this,Election5.class);
                startActivity(intent13);
            }
        });
    }
}

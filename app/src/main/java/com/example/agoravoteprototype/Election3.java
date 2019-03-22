package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Election3 extends AppCompatActivity {
    Button add_candidate_btn,previousbtn1,nextbtn1;
    EditText candidate_editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election3);
        previousbtn1=(Button)findViewById(R.id.previousbtn1);
        nextbtn1=(Button)findViewById(R.id.nextbtn1);
        candidate_editText=(EditText)findViewById(R.id.candidate_editText);
        add_candidate_btn=(Button)findViewById(R.id.add_candidate_btn);
        nextbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(Election3.this,Election4.class);
                startActivity(intent10);
            }
        });
        previousbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(Election3.this,Election2.class);
                startActivity(intent9);
            }
        });
        add_candidate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                candidate_editText.setText("");
            }
        });


    }
}

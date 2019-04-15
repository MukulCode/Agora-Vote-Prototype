package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VoteTypeOne extends AppCompatActivity {
Button ballot_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_type_one);
    ballot_btn=(Button)findViewById(R.id.see_ballot_btn);
    ballot_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent1=new Intent(VoteTypeOne.this,BallotOne.class);
            startActivity(intent1);
        }
    });

    }
}

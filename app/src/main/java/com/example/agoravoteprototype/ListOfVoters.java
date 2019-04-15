package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ListOfVoters extends AppCompatActivity {
    Button list_of_voters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_voters);
        list_of_voters=(Button)findViewById(R.id.list_of_voters);
        list_of_voters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kayintent=new Intent(ListOfVoters.this,Dashboard.class);
                startActivity(kayintent);
                Toast.makeText(ListOfVoters.this, "Invitation Sent", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

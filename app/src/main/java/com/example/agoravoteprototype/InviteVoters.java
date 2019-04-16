package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class InviteVoters extends AppCompatActivity {
Button sendInvitation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_voters);
        sendInvitation=(Button)findViewById(R.id.sendinvitation);
        sendInvitation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent=new Intent(InviteVoters.this,ListOfVoters.class);
                startActivity(startintent);
            }
        });



    }
}

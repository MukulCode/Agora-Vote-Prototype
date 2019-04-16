package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActiveElections extends AppCompatActivity {
ImageButton settingbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_elections);
    settingbtn=(ImageButton)findViewById(R.id.imageButton2);
    settingbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent startintent=new Intent(ActiveElections.this,InviteVoters.class);
            startActivity(startintent);
        }
    });
    }
}

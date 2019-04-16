package com.example.agoravoteprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class before_signup extends AppCompatActivity {
Button btnsignup, btnsignin, facebookbtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_signup);
        btnsignin=(Button)findViewById(R.id.button11);
        btnsignup=(Button)findViewById(R.id.button9);
        facebookbtn=(Button)findViewById(R.id.button10);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttemp =new Intent(before_signup.this, MainActivity.class);
                startActivity(intenttemp);

            }
        });


        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt =new Intent(before_signup.this, Signin.class);
                startActivity(intentt);
            }
        });
    }
}

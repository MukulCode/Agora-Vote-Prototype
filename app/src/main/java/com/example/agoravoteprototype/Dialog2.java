package com.example.agoravoteprototype;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.akaita.android.circularseekbar.CircularSeekBar;

import java.text.DecimalFormat;

public class Dialog2 extends AppCompatActivity {
Button vote_now_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog2);

        vote_now_btn=(Button)findViewById(R.id.radioButton14);
        vote_now_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tryintent=new Intent(Dialog2.this,VoteTypeFour.class);
                startActivity(tryintent);
            }
        });

        CircularSeekBar seekbar= (CircularSeekBar)findViewById(R.id.seekbar);
        seekbar.setProgressTextFormat(new DecimalFormat("###,###,##0.00"));
        seekbar.setRingColor(Color.GREEN);

        seekbar.setOnCenterClickedListener(new CircularSeekBar.OnCenterClickedListener() {
            @Override
            public void onCenterClicked(CircularSeekBar seekBar, float progress) {
                Snackbar.make(seekBar,"Reset",Snackbar.LENGTH_SHORT)
                        .show();
                seekBar.setProgress(0);

            }
        });
        seekbar.setOnCircularSeekBarChangeListener(new CircularSeekBar.OnCircularSeekBarChangeListener() {
            @Override
            public void onProgressChanged(CircularSeekBar seekBar, float progress, boolean fromUser) {
                if (progress<33)
                    seekBar.setRingColor(Color.GREEN);
                else if (progress<66)
                    seekBar.setRingColor(Color.RED);
                else
                    seekBar.setRingColor(Color.BLUE);

            }

            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {

            }
        });

    }
}

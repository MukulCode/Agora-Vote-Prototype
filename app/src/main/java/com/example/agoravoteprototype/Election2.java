package com.example.agoravoteprototype;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Election2 extends AppCompatActivity implements
        DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
    Button previousbtn,nextbtn;
    EditText endText, startText;
    int day, month, year, hour, minute;
    int dayFinal, monthFinal, hourFinal, minuteFinal, yearFinal,count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election2);
        endText=(EditText)findViewById(R.id.end_editText);
        previousbtn=(Button)findViewById(R.id.previousbtn);
        nextbtn=(Button)findViewById(R.id.nextbtn);
        startText=(EditText)findViewById(R.id.start_editText);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(Election2.this,Election3.class);
                startActivity(intent5);
            }
        });
        previousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(Election2.this,Election1.class);
                startActivity(intent6);
            }
        });
        startText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c= Calendar.getInstance();
                year = c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day= c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog= new DatePickerDialog(Election2.this,Election2.this
                        ,year,month,day);
                datePickerDialog.show();

            }
        });
        endText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+1;
                Calendar c= Calendar.getInstance();
                year = c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day= c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog= new DatePickerDialog(Election2.this,Election2.this
                        ,year,month,day);
                datePickerDialog.show();

            }
        });

    }







    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        yearFinal=year;
        monthFinal=month +1 ;
        dayFinal=dayOfMonth;

        Calendar c= Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(Election2.this,Election2.this
                ,hour,minute, DateFormat.is24HourFormat(this));
        timePickerDialog.show();

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        hourFinal=hourOfDay;
        minuteFinal=minute;
        if(count==0)
        {
            startText.setText(monthFinal+"/"+dayFinal+"/"+yearFinal+"    "+hourFinal+":"+minuteFinal);
        }
        else{
            endText.setText(monthFinal+"/"+dayFinal+"/"+yearFinal+"    "+hourFinal+":"+minuteFinal);
        }
    }

}

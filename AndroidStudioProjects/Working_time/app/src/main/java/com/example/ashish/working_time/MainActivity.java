package com.example.ashish.working_time;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    static final int ID=0;
    static final int ID1=1;

    int hour, min;   //hour and min are declared globally, so that it can be accessed anywhere
    int hour1, min1; //to provide better use of time data provided by USER

    TextView tvfrom;  //to show start of working hour time
    TextView tvto;     //to show end of working hour time

    Button from, to;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvfrom=(TextView)findViewById(R.id.textView5);
        tvto=(TextView)findViewById(R.id.textView6);


        getFromTime();  //methods are called, so that whenever the user clicks
        getToTime();    //the whichever button, time form timepicker can be accessed
    }

    public void getFromTime(){                           //method called when user clicks "from" button

        from=(Button)findViewById(R.id.button);

        from.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                showDialog(ID);

            }
        });

    }

    public void getToTime(){                              //method called when user clicks "from" button

        to=(Button)findViewById(R.id.button2);

        to.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {


                showDialog(ID1);

            }
        });

    }


    @Override
    protected Dialog onCreateDialog(int id) {             //method return the time which is given by user

        if(id==ID)
            return new TimePickerDialog(MainActivity.this,timePicker,hour, min, false);

        if(id==ID1)
            return new TimePickerDialog(MainActivity.this,timePicker1,hour, min, false);

        return null;
    }

    //method to get the time form timepicker object

    protected TimePickerDialog.OnTimeSetListener timePicker= new TimePickerDialog.OnTimeSetListener()

    {

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            hour=hourOfDay;
            min=minute;


            tvfrom.setText(hour + " : " + min);        //time is displayed in TextView

        }
    };
    protected TimePickerDialog.OnTimeSetListener timePicker1= new TimePickerDialog.OnTimeSetListener()

    {

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            hour1=hourOfDay;
            min1=minute;


            tvto.setText(hour1 + " : " + min1);          //time is displayed in TextView

        }
    };





    }


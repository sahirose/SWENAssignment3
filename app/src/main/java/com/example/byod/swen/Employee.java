package com.example.byod.swen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Employee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
    }


        public void GoDetails (View v)
        {
            Intent myIntent = new Intent(this, Details.class);
            startActivity(myIntent);
        }

        public void GoAttendance (View v)
        {
            Intent myIntent = new Intent(this, Attendance.class);
            startActivity(myIntent);
        }

        public void GoPay (View v)
        {
            Intent myIntent = new Intent(this, Pay.class);
            startActivity(myIntent);
        }

        public void GoLog (View v)
        {
            Intent myIntent = new Intent(this, Log.class);
            startActivity(myIntent);
        }
    }




package com.example.byod.swen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

    public class Events extends AppCompatActivity {

        private Spinner facilityT, FoodS;
        private TextView SeatT;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_events);

           


        }



        public void goCustomer(View v)
        {
            Intent myIntent = new Intent(this, Activitycustomerdetails.class);
            startActivity(myIntent);
        }

    }
package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Frontpage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
    }

    public void Gobooking (View v)
    {
        Intent myIntent = new Intent(this, Booking.class);
        startActivity(myIntent);
    }
    public void Goreception (View v)
    {
        Intent myIntent = new Intent(this, Reception.class);
        startActivity(myIntent);
    }
    public void Goemployee (View v)
    {
        Intent myIntent = new Intent(this, Employee.class);
        startActivity(myIntent);
    }
    public void Gofacilities (View v)
    {
        Intent myIntent = new Intent(this, Facilities.class);
        startActivity(myIntent);
    }
    public void Goevents (View v)
    {
        Intent myIntent = new Intent(this, Events.class);
        startActivity(myIntent);
    }
    public void Goservice (View v)
    {
        Intent myIntent = new Intent(this, Service.class);
        startActivity(myIntent);
    }
    public void Gologistics (View v)
    {
        Intent myIntent = new Intent(this, Logistics.class);
        startActivity(myIntent);
    }
    public void Gocustomer (View v)
    {
        Intent myIntent = new Intent(this, review.class);
        startActivity(myIntent);
    }
    public void Gosales (View v)
    {
        Intent myIntent = new Intent(this, sale.class);
        startActivity(myIntent);
    }
    public void Gohousekeeping (View v)
    {
        Intent myIntent = new Intent(this, housekeeping.class);
        startActivity(myIntent);
    }
    public void Gohotelroom (View v)
    {
        Intent myIntent = new Intent(this, Hotelroom.class);
        startActivity(myIntent);
    }
}



package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class checkin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
    }

    public void Gook (View v)
    {
        Intent myIntent = new Intent(this, checkInformationActivity.class);
        startActivity(myIntent);
    }
}


package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activitycustomerdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitycustomerdetails);
    }
    public void goFront (View v)
    {
        Intent myIntent = new Intent(this, Frontpage.class);
        startActivity(myIntent);
    }


}

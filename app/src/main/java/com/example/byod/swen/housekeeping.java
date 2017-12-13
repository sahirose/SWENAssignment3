package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class housekeeping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housekeeping);
    }

    public void Gohousekeeper (View v)
    {
        Intent myIntent = new Intent(this, Housekeeper.class);
        startActivity(myIntent);
    }

    public void Goinspector (View v)
    {
        Intent myIntent = new Intent(this, Inspector.class);
        startActivity(myIntent);
    }
}

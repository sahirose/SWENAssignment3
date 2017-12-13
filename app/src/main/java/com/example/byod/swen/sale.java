package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);
    }
    public void family (View v)
    {
        Intent myIntent = new Intent(this, Family.class);
        startActivity(myIntent);
    }
    public void weekend (View v)
    {
        Intent myIntent = new Intent(this, Weekend.class);
        startActivity(myIntent);
    }
}
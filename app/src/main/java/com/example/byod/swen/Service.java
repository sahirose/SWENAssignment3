package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }
    public void concierge (View v)
    {
        Intent myIntent = new Intent(this, Selection.class);
        startActivity(myIntent);
    }
    public void Roomservice (View v)
    {
        Intent myIntent = new Intent(this, Selection.class);
        startActivity(myIntent);
    }
    public void facilities (View v)
    {
        Intent myIntent = new Intent(this, Selection.class);
        startActivity(myIntent);
    }
    public void vip (View v)
    {
        Intent myIntent = new Intent(this, Selection.class);
        startActivity(myIntent);
    }
    public void restaurant (View v)
    {
        Intent myIntent = new Intent(this, Selection.class);
        startActivity(myIntent);
    }
    public void wifi (View v)
    {
        Intent myIntent = new Intent(this, Selection.class);
        startActivity(myIntent);
    }
    public void employee (View v)
    {
        Intent myIntent = new Intent(this, Selection.class);
        startActivity(myIntent);
    }
    public void shuttle (View v)
    {
        Intent myIntent = new Intent(this, Selection.class);
        startActivity(myIntent);
    }


}

package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class updateStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_status);
    }


    public void Gohome (View v)
    {
        Intent myIntent = new Intent(this, Frontpage.class);
        startActivity(myIntent);
    }
}

package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickGo(View v) {

        if (v.getId() == R.id.button3) {
            Intent myIntent = new Intent(getBaseContext(), Login.class);
            startActivity(myIntent);

        } else if (v.getId() == R.id.button2) {
            Intent myIntent = new Intent(getBaseContext(), Signup.class);
            startActivity(myIntent);
        }
    }
}

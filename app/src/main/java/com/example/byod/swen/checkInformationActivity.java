package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class checkInformationActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_check_information);
        }

        public void clickRoom(View v) {
            Intent myIntent = new Intent(this, roomActivity.class);
            startActivity(myIntent);
        }
    }

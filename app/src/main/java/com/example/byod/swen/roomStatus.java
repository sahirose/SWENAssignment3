package com.example.byod.swen;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

public class roomStatus extends AppCompatActivity { //change to CalendarActivity

    CalendarView calendarView;
    TextView dateBooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_status);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        dateBooking=(TextView)findViewById(R.id.roomStatus);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;
                dateBooking.setText(date);
            }
        });
    }

    public void clickRoomStatus (View v)
    {
        Intent myIntent = new Intent(this, Hotelroom.class);
        startActivity(myIntent);
    }
}

package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Hotelroom extends AppCompatActivity {
    private static final String TAG = "ListView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotelroom);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        Person john = new Person("Deluxe Room","From : S$221","Beds: 1 King(s)","drawable://" + R.drawable.pictures1);
        Person steve = new Person("Deluxe Twin Sharing Room","S$225","Beds: 1 Twin(s)","drawable://" + R.drawable.pictures2);
        Person stacy = new Person("Studio Loft","S$231","Beds: 1 Kings(s)","drawable://" + R.drawable.pictures3);
        Person ashley = new Person("Superior Room","S$241","Beds: 1 Kings(s)","drawable://" + R.drawable.picture4);
        Person matt = new Person("Family Room","S$258","Beds: 1 Kings(s)","drawable://" + R.drawable.picture5);
        Person matt2 = new Person("Executive Room","S$310","Beds: 1 Kings(s)","drawable://" + R.drawable.picture6);
        Person matt3 = new Person("Premier Room","S$347","Beds: 1 Kings(s)","drawable://" + R.drawable.picture7);
        Person matt4 = new Person("Club Room","S$398","Beds: 1 Kings(s)","drawable://" + R.drawable.picture8);
        Person matt5 = new Person("Executive Club Room","S$456","Beds: 1 Kings(s)","drawable://" + R.drawable.picture9);
        Person matt6 = new Person("Premier Club Room","S$512","Beds: 1 Kings(s)","drawable://" + R.drawable.picturex);
        Person matt7 = new Person("Executive Suite","S$1001","Beds: 1 King(s), 1 Twins(s)","drawable://" + R.drawable.picturex1);
        Person matt8 = new Person("Royal Suite","S$1888","Beds: 1 Queen(s), 1 King(s)","drawable://" + R.drawable.picturex2);
        Person matt9 = new Person("Presidential Suite","S$2589","Beds: 1 Queen(s), 1 Twin(s), 1 Super-King(s)","drawable://"+ R.drawable.picturex3);


        //Add the Person objects to an ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(steve);
        peopleList.add(stacy);
        peopleList.add(ashley);
        peopleList.add(matt);
        peopleList.add(matt2);
        peopleList.add(matt3);
        peopleList.add(matt4);
        peopleList.add(matt5);
        peopleList.add(matt6);
        peopleList.add(matt7);
        peopleList.add(matt8);
        peopleList.add(matt9);


        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }


    public void Goupdate (View v)
    {
        Intent myIntent = new Intent(this, updateStatus.class);
        startActivity(myIntent);
    }

}







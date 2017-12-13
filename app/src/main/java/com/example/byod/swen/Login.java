package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText username;
    private EditText password;


    DatabaseHelper myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        myDB = new DatabaseHelper(Login.this);
        myDB.getWritableDatabase();
    }




    public void clickSubmit(View v)
    {
        if (myDB.Search(username.getText().toString(), password.getText().toString()))
        {
            Toast.makeText(getApplicationContext(), "You have logged in successfully", Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(this, Frontpage.class);
            startActivity(myIntent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_LONG).show();
        }

    }

}

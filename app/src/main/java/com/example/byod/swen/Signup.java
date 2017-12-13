package com.example.byod.swen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private EditText repassword;

    DatabaseHelper myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        repassword = (EditText) findViewById(R.id.editText3);
        myDB = new DatabaseHelper(Signup.this);

    }



    public void clickSignup(View v) {
        if ((this.username.getText().length() == 0) ||
                (this.password.getText().length() == 0) ||
                (this.repassword.getText().length() == 0)) {

            Toast.makeText(getApplicationContext(), "Error: some fields have missing data", Toast.LENGTH_LONG).show();
        }
        else if (!password.getText().toString().equals(repassword.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Password does not match.", Toast.LENGTH_SHORT).show();

        } else {
            boolean isInserted = myDB.insertData(username.getText().toString(), password.getText().toString());

            if (isInserted) {
                Toast.makeText(getApplicationContext(), "Sign Up Successfully.", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(this, Login.class);
                startActivity(myIntent);
            } else {
                Toast.makeText(getApplicationContext(), "Sign Up Failed.", Toast.LENGTH_SHORT).show();
            }
        }
    }



}




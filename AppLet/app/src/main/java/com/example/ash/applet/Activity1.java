package com.example.ash.applet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);




        TextView user = (TextView) findViewById(R.id.user);
        TextView pass = ( TextView) findViewById(R.id.pass);

        String name = getIntent().getStringExtra("Name");
        String pass = getIntent().getStringExtra("Password");

        welcomeField.setText(name);


    }
}

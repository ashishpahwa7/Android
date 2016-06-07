package com.example.ash.scholarbeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sub_categories extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_categories);


        TextView message = (TextView) findViewById(R.id.msg);


        String user =  getIntent().getStringExtra("username");
        message.setText(user);





    }
}

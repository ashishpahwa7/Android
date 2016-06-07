package com.inocgnito.session8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity02 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);

        Button B1_Act01 = (Button) findViewById(R.id.Login_button);   // Login
        Button B2_Act01 = (Button) findViewById(R.id.B2);  //  Update

        B1_Act01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity02.this, Activity21.class);
                startActivity(intent);
            }
        });

        B2_Act01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity02.this, Activity22.class);
                startActivity(intent);
            }
        });
    }
}

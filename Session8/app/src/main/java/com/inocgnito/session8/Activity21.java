package com.inocgnito.session8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity21 extends AppCompatActivity
{
    EditText E1;   // Username
    EditText E2;  //  Password
    Button   B1;
    String Pass, Use, Check;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);

        E1 = (EditText) findViewById(R.id.Use);
        E2 = (EditText) findViewById(R.id.Pass);
        B1 = (Button)   findViewById(R.id.Login_button);

        B1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Use = E1.getText().toString();
                Pass = E2.getText().toString();
                Check = getSharedPreferences("Data",0).getString(Use," ");
                if(Check.equals(Pass))
                {
                    Toast.makeText(getBaseContext(), "You are in !!", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(getBaseContext(), "Bad Password or Username", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

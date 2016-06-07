package com.inocgnito.session8;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity01 extends AppCompatActivity
{

    EditText E1;     // Name
    EditText E2;    //  Username
    EditText E3;   //   Password
    Button   B1;

    String key, val1, val2;
    String key_check;
    public static SQLiteDatabase object;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
        E1 = (EditText) findViewById(R.id.E1);     // Name
        E2 = (EditText) findViewById(R.id.E2);    //  Username
        E3 = (EditText) findViewById(R.id.E3);   //   Password
        B1 = (Button)   findViewById(R.id.B1);

        B1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                val1 = E1.getText().toString();   // Name of the user
                val2 = E3.getText().toString();  //  Password
                key =  E2.getText().toString(); //   User-Name
                getSharedPreferences("Data",0).edit().putString("Sample", "Sample Data").commit();
                key_check = getSharedPreferences("Data",0).getString(key," ");

                // object = helper_sql.SQL_data.query("SELECT * FROM imagine");

                if(key_check.equals(val2))
                    Toast.makeText(getBaseContext(), "Sorry bro, gotta use another username", Toast.LENGTH_SHORT).show();
                else
                {
                    getSharedPreferences("Data",0).edit().putString(key, val2).commit();
                    Toast.makeText(getBaseContext(), "Yay!! Welcome to incognito ^_^", Toast.LENGTH_SHORT).show();

                     /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

                                                    //  DATABASE WORK  //

                    helper_sql.SQL_data.execSQL("INSERT INTO imagine values('"+key+"','"+val2+"');");

                                                   //  DATABASE WORK  //

                     /*
                     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */



                    Intent intent = new Intent(Activity01.this, Activity21.class);
                    startActivity(intent);
                }
            }
        });

    }
}

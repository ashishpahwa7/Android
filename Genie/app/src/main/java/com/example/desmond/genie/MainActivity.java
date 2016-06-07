package com.example.desmond.genie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText firstName;
    EditText lastName;
    EditText userName;
    EditText password;
    EditText gender, dob;

    Button submit;

    String f_name, l_name, user_name;
    String pass, Gender, DOB;
    String check_user; // Remmeber to get data from database / table before deployment

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName  = (EditText) findViewById(R.id.lastName);
        userName  = (EditText) findViewById(R.id.userName);
        password  = (EditText) findViewById(R.id.password);
        gender    = (EditText) findViewById(R.id.gender);
        dob       = (EditText) findViewById(R.id.dob);

        submit    = (Button)   findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                f_name    =   firstName.getText().toString();
                l_name    =   lastName.getText().toString();
                user_name =   userName.getText().toString();
                pass      =   password.getText().toString();
                Gender    =   gender.getText().toString();
                DOB       =   dob.getText().toString();

                if(user_name.equals(check_user) && (Gender.equals("Male")) || (Gender.equals("M")))
                {
                    Toast.makeText(getBaseContext(), "Sorry bro, but you gotta use another " +
                                    "User Name",
                            Toast.LENGTH_SHORT).show();
                }
                else if(user_name.equals(check_user) && (Gender.equals("Female")) || (Gender.equals("F")))
                {
                    Toast.makeText(getBaseContext(), "Sorry bro, but you gotta use another " +
                                    "User Name",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                     /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

                                                //  DATABASE WORK  //

                    helper_sql.SQL_data.execSQL("INSERT INTO imagine values('"+f_name+"'," +
                            "'"+l_name+"','"+user_name+"','"+gender+"''"+dob+"''"+password+"' )" +
                            ";");

                    Toast.makeText(getBaseContext(), "^_^ Step one complete ^_^ ", Toast
                            .LENGTH_SHORT).show();

                                                //  DATABASE WORK  //

                    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
                }

            }
        });

    }
}

package org.vipsace.jinny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegPage extends AppCompatActivity {


    DataBaseHelper object ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_page);

        final EditText username = (EditText)findViewById(R.id.gender);
        final EditText password= (EditText)findViewById(R.id.password);
        final EditText Dob = (EditText)findViewById(R.id.dob);
        final EditText fname= (EditText)findViewById(R.id.fname);
        final EditText lname= (EditText)findViewById(R.id.lname);
        final EditText gender= (EditText)findViewById(R.id.gender);

        Button button = (Button)findViewById(R.id.submit);



        object = new DataBaseHelper(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String str1 = Dob.getText().toString();
                String str2 = username.getText().toString();
                String str3 = password.getText().toString();
                String str4 = fname.getText().toString();
                String str5 = lname.getText().toString();
                String str6 = gender.getText().toString();



                //getSharedPreferences("secure",0).edit().putString(str2, str2).commit();
                getSharedPreferences("DATA", 0).edit().putString(str2, str3).commit();

                object.abc.execSQL("INSERT into Jinny values ('" + str4 + "','" + str5 + "','" + str2 + "','" + str6 + "','" + str1 + "','" + str3 + "');");

                Toast.makeText(RegPage.this, "User Added to DataBase", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegPage.this ,Success.class );

                intent.putExtra("user", str2);

                //getSharedPreferences("secure",0).edit().putString(str2, str2).apply();
                getSharedPreferences("DATA", 0).edit().putString(str2, str3).commit();


                startActivity(intent);


            }
        });


    }
}

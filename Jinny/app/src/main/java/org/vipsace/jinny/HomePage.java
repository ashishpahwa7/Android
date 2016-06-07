package org.vipsace.jinny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.vipsace.jinny.Models.Model;

import java.util.ArrayList;

    public class HomePage extends AppCompatActivity {

    EditText input;
    String str;
    Button Add;
    ArrayList<String> data1 = new ArrayList<>();
    DataBaseHelper object ;
    String username = "default";    // pushed



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        int a,b,c,d,e;
        final Spinner S1 = (Spinner) findViewById(R.id.spinner);
        object = new DataBaseHelper(this);
        ArrayList<String> data = new ArrayList<>();

        data.add("Profile");

        data.add("My Account");
        data.add("My Wish List");
        data.add("People");
        data.add("Settings");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HomePage.this,android.R.layout.simple_list_item_1,data);

        S1.setAdapter(adapter);

        input = (EditText) findViewById(R.id.T1);
        Add = (Button) findViewById(R.id.add);

        final ListView list = (ListView) findViewById(R.id.list);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                str = input.getText().toString();

                if(!data1.contains(str))
                {
                    data1.add(str);

                    String S = getIntent().getStringExtra("user");

                    object.abc.execSQL("Insert into Wishes values('"+S+"','"+str+"'; ");

                    CustAdapter customAdapter = new CustAdapter(HomePage.this, data1);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(HomePage.this, R.layout.mylayout, data1);


                    list.setAdapter(customAdapter);
                }
                else { Toast.makeText(getBaseContext(), "Already Exists ", Toast.LENGTH_LONG).show();}


            }
        });


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView abc = (TextView) view.findViewById(R.id.Title);
                Button b2 = (Button) view.findViewById(R.id.add);
                str = abc.getText().toString();


                Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();


            }
        });

        S1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent wish = new Intent(HomePage.this,PProfile.class);
                startActivity(wish);

               // Toast.makeText(HomePage.this, "hello", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}









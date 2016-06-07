package com.example.ash.scholarbeat;

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

import java.util.ArrayList;

public class Categories extends AppCompatActivity {

    ArrayList<String> data;
    ArrayAdapter<String> adapter;
    ListView list = (ListView) findViewById(R.id.items);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);


        TextView login_user = (TextView) findViewById(R.id.welcome_field);
        ListView list = (ListView) findViewById(R.id.items);
        Button subcat = (Button) findViewById(R.id.add);
        Spinner myspin = (Spinner) findViewById(R.id.s1);
        Button add = (Button) findViewById(R.id.add);

        final String user = getIntent().getStringExtra("username");
        login_user.setText(user);

        subcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Categories.this, Sub_categories.class);
                intent.putExtra("username", user);

                startActivity(intent);

            }
        });


         data = new ArrayList<>();

        data.add("Statistical Learning ");
        data.add("Descrete Mathematics");
        data.add("INtroduction to Calculus");
        data.add("Design and Analysis of Algorithms");
        data.add("Computer Vision");
        data.add("Data Security and Science of Encryption");
        data.add("Linear Algebra");
        data.add("Theory of Relativity");
        data.add("Neural Networks");
        data.add("Artificial Intelligence");
        data.add("Mathematics for Computer Science");
        data.add("Data Science Specialization");
        data.add(user);


        adapter = new ArrayAdapter<String>(Categories.this, R.layout.mirchi,data);

        list.setAdapter(adapter);
        myspin.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                TextView textView = (TextView) view;
                String data = textView.getText().toString();
                Toast.makeText(Categories.this, data, Toast.LENGTH_LONG).show();

            }
        });

        myspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                TextView textView = (TextView) view;
                String data = textView.getText().toString();
                Toast.makeText(Categories.this, data, Toast.LENGTH_LONG).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText item = (EditText) findViewById(R.id.t1);

                String input ;
                input = item.getText().toString();
                data.add(input);
                list.setAdapter(adapter);




            }
        });

    }
}
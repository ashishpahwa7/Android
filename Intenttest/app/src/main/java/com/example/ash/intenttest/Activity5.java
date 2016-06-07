package com.example.ash.intenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);


        Button button = (Button) findViewById(R.id.b1);
        final EditText T1 = (EditText) findViewById(R.id.t1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(T1.getText().toString());

                int max;

                int s = 0, t, x;
                while (a != 0) {
                    x = a % 10;
                    s = s + x;
                    a = a / 10;
                }

                Toast.makeText(getBaseContext(), "" + s, Toast.LENGTH_SHORT).show();
                T1.setText("" + s);


            }


        });


    }
}

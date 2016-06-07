package com.example.ash.intenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Button button = (Button) findViewById(R.id.b1);
        final EditText T1 = (EditText) findViewById(R.id.t1);
        final EditText T2 = (EditText) findViewById(R.id.t2);
        final EditText T3 = (EditText) findViewById(R.id.t3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int a = Integer.parseInt(T1.getText().toString());
                int b = Integer.parseInt(T2.getText().toString());
                int max;

                max = (a > b) ? a : b;
                while (5 > 3) {
                    if (max % a == 0 && max % b == 0) {
                        Toast.makeText(getBaseContext(), "" + max, Toast.LENGTH_SHORT).show();
                        T3.setText("" + max);
                        break;
                    }
                    ++max;
                }


            }


        });






    }
}

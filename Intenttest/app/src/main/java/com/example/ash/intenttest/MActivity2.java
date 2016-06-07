package com.example.ash.intenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);

        Button button=(Button) findViewById(R.id.b1);

        final EditText T1 =(EditText) findViewById(R.id.t1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int a = Integer.parseInt(T1.getText().toString());



                int flag = 1, i;
                if (a == 0) {
                    T1.setText("Not Prime");
                }

                for (i = 2; i < a; i++) {
                    if (a % i == 0) {
                        flag = 0;
                        break;
                    }

                }

                if (flag == 1) {
                    T1.setText("Prime");
                } else {
                    T1.setText("Not prime");
                }


            }


        });





    }
}

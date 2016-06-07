package com.example.ash.intenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        Button button = (Button) findViewById(R.id.b1);
        final EditText T1 = (EditText) findViewById(R.id.t1);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(T1.getText().toString());

                int fact=1;
                while(a>0)
                {
                    fact=fact*a;
                    a--;
                }

                Toast.makeText(getBaseContext(), "" + fact, Toast.LENGTH_LONG).show();
                T1.setText("" + fact);

            }



        });





    }
}

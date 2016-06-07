package com.inocgnito.session3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText E1 = (EditText) findViewById(R.id.E1);
        final ListView L1 = (ListView) findViewById(R.id.L1);
        Button button = (Button) findViewById(R.id.B1);
        String S = new String();
        ArrayList <String> Data = new ArrayList <String>();
        for(int i=0; i<10; i++)
        {
            S = E1.getText().toString();
            Data.add(S);
        }

        ArrayAdapter <String> Adapt = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Data );
        L1.setAdapter(Adapt);

      /*  L1.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

            }
         }); */
    }
}

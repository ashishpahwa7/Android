package com.example.ash.applet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameField = (EditText) findViewById(R.id.name_field);
        final EditText pass =(EditText) findViewById(R.id.password);




        Button button;

        button = (Button) findViewById(R.id.B1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Sample toast", Toast.LENGTH_LONG).show();


                Log.d("----", "sample log"); //??


                Intent intent = new Intent(MainActivity.this, Activity1.class);
                intent.putExtra("Name", nameField.getText().toString());
                intent.putExtra("Password", "123");
                startActivity(intent);
            }
        });






    }
}

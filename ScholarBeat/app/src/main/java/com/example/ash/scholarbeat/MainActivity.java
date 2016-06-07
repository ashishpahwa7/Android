package com.example.ash.scholarbeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText) findViewById(R.id.user_input);
        final EditText password = (EditText) findViewById(R.id.password);

        Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1;
                String str2;

                str1= username.getText().toString();
                str2= password.getText().toString();
                Intent intent_subcategories = new Intent(MainActivity.this , Sub_categories.class);
                intent_subcategories.putExtra("username",str1);



                if(str2.equals("mypass"))
                {

                    Intent intent_categories = new Intent(MainActivity.this , Categories.class);

                    intent_categories.putExtra("username",str1);

                    startActivity(intent_categories);



                }



            }
        });







    }
}

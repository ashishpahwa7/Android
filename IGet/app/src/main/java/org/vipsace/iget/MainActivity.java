package org.vipsace.iget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button)findViewById(R.id.login);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent main_menu = new Intent(MainActivity.this,MainMenu.class);
                startActivity(main_menu);

            }
        });

    }
}

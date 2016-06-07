package com.example.ash.trypick;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

        public class Activity1 extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


            ArrayList<DataModel> data = new ArrayList<>();

        ListView list = (ListView) findViewById(R.id.list1);

        DataModel obj1 =new DataModel();

        obj1.setName("India Misiion 2010");
        obj1.setAuthor("Dr. APJ Abdul Kalam");
        obj1.setPrice("Rs.250");
        obj1.setSummary("India Vision 2020 was initially a document prepared by....");


        DataModel obj2 =new DataModel();

        obj2.setName("A Brief History Of Time");
        obj2.setAuthor("Stephen Hawking");
        obj2.setPrice("Rs.183");
        obj2.setSummary("A Brief History of Time: From the Big Bang to Black Holes...");


        DataModel obj3 = new DataModel();

        obj3.setName("The Secret Seven");
        obj3.setAuthor("Enid Blyton");
        obj3.setPrice("Rs.125");
        obj3.setSummary("An all-new 3D Pokémon adventure..");


        DataModel obj4 =new DataModel();

        obj4.setName("Harry Potter tried Suicide ");
        obj4.setAuthor("Lord Voldemort");
        obj4.setPrice("Rs.2100000");
        obj4.setSummary("Climax : Spider man saves himself to kill HP...");

        DataModel obj5 = new DataModel();


        obj5.setName("Half Girlfriend");
        obj5.setAuthor("Chetan Bhagat");
        obj5.setPrice("Rs.210");
        obj5.setSummary("Half Girlfriend is an Indian English coming of age..,");
   ;

        DataModel obj6 =new DataModel();

        obj6.setName("Wasted in Engineering");
        obj6.setAuthor("Prabhu Swaminathan");
        obj6.setPrice("Rs.210");
        obj6.setSummary(" 'Story of every youth lol .. '.");





        data.add(obj1);
        data.add(obj2);
        data.add(obj3);
        data.add(obj4);
        data.add(obj5);
        data.add(obj6);

        CustomAdapter pillow = new CustomAdapter(this,data);
        list.setAdapter(pillow);







    }
}

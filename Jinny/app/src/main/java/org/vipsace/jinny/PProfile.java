package org.vipsace.jinny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.vipsace.jinny.Models.ModelWishes;
import org.vipsace.jinny.Models.PublicAdapt;

import java.util.ArrayList;

public class PProfile extends AppCompatActivity
{
    ListView L1;
    ArrayList<ModelWishes> data;
    PublicAdapt Adapt;
    ModelWishes obj1 = new ModelWishes();
    ModelWishes obj2 = new ModelWishes();
    ModelWishes obj3 = new ModelWishes();
    ModelWishes obj4 = new ModelWishes();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pprofile);

        obj1.setWish("I wish I had a PS 4");
        obj2.setWish("I wish I could get Samsung 6 Edge");
        obj3.setWish("I wish I could win Xbox One");
        obj4.setWish("I wish Titan X");


        data.add(obj1);
        data.add(obj2);
        data.add(obj3);
        data.add(obj4);

        Adapt = new PublicAdapt(PProfile.this, data);

        L1.setAdapter(Adapt);


    }
}

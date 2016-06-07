package org.vipsace.jinny;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.vipsace.jinny.Models.Model;

import java.util.ArrayList;

/**
 * Created by ash on 20/2/16.
 */
public class CustAdapter extends BaseAdapter {

    Activity activity;
    ArrayList<String>data;

    public CustAdapter(Activity activity,ArrayList<String> data) {
        this.data = data;
        this.activity = activity;

    }



    @Override
    public int getCount() {

        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = activity.getLayoutInflater().inflate(R.layout.mylayout,null);

        Button button = (Button) view.findViewById(R.id.add);
        TextView title =  (TextView) view.findViewById(R.id.Title);
        TextView WISH = (TextView) view.findViewById(R.id.wish);
        title.setText(data.get(position));
        final String str = title.getText().toString();

       // WISH.setText(data.get(position).getWish());



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(activity.getBaseContext(), str, Toast.LENGTH_SHORT).show();


            }
        });

        return view;



    }
}

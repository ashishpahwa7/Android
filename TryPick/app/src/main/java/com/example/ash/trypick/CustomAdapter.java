package com.example.ash.trypick;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ash on 2/2/16.
 */
public class CustomAdapter extends BaseAdapter {

    Activity activity;
    ArrayList<DataModel> data;

    public CustomAdapter(Activity activity,ArrayList<DataModel> data) {
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
        Button button = (Button) view.findViewById(R.id.button);
        TextView title = (TextView) view.findViewById(R.id.Title);
        TextView author = (TextView) view.findViewById(R.id.author);
        TextView summary = (TextView) view.findViewById(R.id.summary);
        TextView price = (TextView) view.findViewById(R.id.price);

        title.setText(data.get(position).getName());
        author.setText(data.get(position).getAuthor());
        summary.setText(data.get(position).getSummary());
        price.setText(data.get(position).getPrice());

        return view;
    }
}

package org.vipsace.jinny.Models;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.vipsace.jinny.R;

import java.util.ArrayList;

/**
 * Created by Desmond on 20-02-2016.
 */
public class PublicAdapt extends BaseAdapter
{

    Activity activity;
    ArrayList<String> data1;

    public PublicAdapt(Activity activity,ArrayList<ModelWishes> data) {
        this.data1 = data1;
        this.activity = activity;

    }

    @Override
    public int getCount() {
        return data1.size();
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
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = activity.getLayoutInflater().inflate(R.layout.mylayout,null);

        TextView WISH = (TextView) view.findViewById(R.id.wish);
        WISH.setText(data1.get(position));

        return view;
    }
}

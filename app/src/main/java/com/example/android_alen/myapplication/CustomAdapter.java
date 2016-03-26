package com.example.android_alen.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Android-Alen on 23-Mar-16.
 */
public class CustomAdapter extends BaseAdapter {
    public Activity context;

    private List<ListClass>listitem;
    LayoutInflater layoutInflater;

    public CustomAdapter(Activity context,List<ListClass>listitem){

        this.context=context;
        this.listitem=listitem;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listitem.size();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rootview;

        rootview=layoutInflater.inflate(R.layout.singlerow,null);


        TextView title=(TextView)rootview.findViewById(R.id.text);
        TextView disc=(TextView)rootview.findViewById(R.id.text2);

        ListClass  m = listitem.get(position);


        title.setText(m.getName());
        disc.setText(m.getDisc());


        return rootview;
    }

    @Override
    public Object getItem(int position) {
        return listitem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}

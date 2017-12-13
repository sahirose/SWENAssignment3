package com.example.byod.swen;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by byod on 08-Dec-17.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] roomname;
    private final String[] itemname1;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] roomname, Integer[] imgid, String[] itemname1) {
        super(context, R.layout.row, itemname1);


        this.roomname = roomname;
        this.itemname1 = itemname1;
        this.imgid = imgid;
        this.context = context;
    }





    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.row, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(roomname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Description "+itemname1[position]);
        return rowView;

    };


    }

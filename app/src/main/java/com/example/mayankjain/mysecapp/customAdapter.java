package com.example.mayankjain.mysecapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * Created by mayank jain on 6/17/2017.
 */

public class customAdapter extends ArrayAdapter<common_one> {




    public customAdapter(@NonNull Context context,  ArrayList<common_one> resource) {
        super(context,0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView=convertView;
        if(listView==null)
        {
            listView= LayoutInflater.from(getContext()).inflate(R.layout.common_layout,parent,false);
        }
        common_one obj=getItem(position);
        TextView textView=(TextView)listView.findViewById(R.id.cmn_lyt_tv1);
        textView.setText(obj.getHeader());


        textView=(TextView)listView.findViewById(R.id.cmn_lyt_tv2);
        textView.setText(obj.getFooter());


        ImageView imageView=(ImageView)listView.findViewById(R.id.common_layout_image);
        imageView.setImageResource(obj.getImgName());
        return listView;

    }
}

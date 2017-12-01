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
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.inflatedId;
import static android.R.attr.resource;
import static android.os.Build.VERSION_CODES.N;

/**
 * Created by mayank jain on 6/15/2017.
 */

public class wordAdapter extends ArrayAdapter<word> {

    public wordAdapter(@NonNull Context context, ArrayList<word> w) {
        super(context, 0 ,w);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       View v=convertView;
        if(v==null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
            word currWord= getItem(position);
            TextView tnum=(TextView)v.findViewById(R.id.numbers);
            tnum.setText(currWord.getNumber());
            tnum=(TextView)v.findViewById(R.id.words);
            tnum.setText(currWord.getWord());



        return v;

        }

    }


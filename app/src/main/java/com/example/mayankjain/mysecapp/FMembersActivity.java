package com.example.mayankjain.mysecapp;

import android.content.Context;
import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class FMembersActivity extends Fragment {
    private TextToSpeech textToSpeech;

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        textToSpeech=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });


        final ArrayList<common_one> arrayList =new ArrayList<common_one>();
        arrayList.add(new common_one("दादा (daada)","GrandFather",R.drawable.family_grandfather));
        arrayList.add(new common_one("दादी (daadee) ","GrandMother",R.drawable.family_grandmother));
        arrayList.add(new common_one("नाना (naana)","Maternal GrandFather",R.drawable.family_grandfather));
        arrayList.add(new common_one("नानी (naanee)","Maternal GrandMother ,  Granny",R.drawable.family_grandmother));
        arrayList.add(new common_one("मां (maa)","Mummy , Mother",R.drawable.family_mother));
        arrayList.add(new common_one("पिता (pita)","Dad , Father",R.drawable.family_father));
        arrayList.add(new common_one("बहन (bahan)","Sister",R.drawable.family_older_sister));
        arrayList.add(new common_one("भाई (bhaee)"," Brother",R.drawable.family_older_brother));
        arrayList.add(new common_one("बेटा (beta)"," Son",R.drawable.family_younger_brother));
        arrayList.add(new common_one("बेटी (betee)"," Daughter",R.drawable.family_daughter));

        final ListView listView=(ListView)findViewById(R.id.list);
        listView.setBackgroundColor(Color.parseColor("#4CAF50"));
        customAdapter adp=new customAdapter(this,arrayList);

        listView.setAdapter(adp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            common_one cmn = arrayList.get(position);
                textToSpeech.setLanguage(Locale.getDefault());
                textToSpeech.speak(cmn.getFooter()+" is called as "+ cmn.getHeader()+"in hindi",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        textToSpeech.stop();
    }*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_number,container,false);


        textToSpeech=new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });


        final ArrayList<common_one> arrayList =new ArrayList<common_one>();
        arrayList.add(new common_one("दादा (daada)","GrandFather",R.drawable.family_grandfather));
        arrayList.add(new common_one("दादी (daadee) ","GrandMother",R.drawable.family_grandmother));
        arrayList.add(new common_one("नाना (naana)","Maternal GrandFather",R.drawable.family_grandfather));
        arrayList.add(new common_one("नानी (naanee)","Maternal GrandMother ,  Granny",R.drawable.family_grandmother));
        arrayList.add(new common_one("मां (maa)","Mummy , Mother",R.drawable.family_mother));
        arrayList.add(new common_one("पिता (pita)","Dad , Father",R.drawable.family_father));
        arrayList.add(new common_one("बहन (bahan)","Sister",R.drawable.family_older_sister));
        arrayList.add(new common_one("भाई (bhaee)"," Brother",R.drawable.family_older_brother));
        arrayList.add(new common_one("बेटा (beta)"," Son",R.drawable.family_younger_brother));
        arrayList.add(new common_one("बेटी (betee)"," Daughter",R.drawable.family_daughter));

        ListView listView=(ListView)rootview.findViewById(R.id.list);

        listView.setBackgroundColor(Color.parseColor("#4CAF50"));
        customAdapter adp=new customAdapter(getContext(),arrayList);

        listView.setAdapter(adp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                common_one cmn = arrayList.get(position);
                textToSpeech.setLanguage(Locale.getDefault());
                textToSpeech.speak(cmn.getFooter()+" is called as "+ cmn.getHeader()+"in hindi",TextToSpeech.QUEUE_FLUSH,null);
            }
        });


        return rootview;
    }
}


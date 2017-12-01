package com.example.mayankjain.mysecapp;

import android.content.Context;
import android.media.AudioManager;
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

import java.util.ArrayList;
import java.util.Locale;

public class ColorsActivity extends Fragment {
    private TextToSpeech textToSpeech;

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        

        final ArrayList<common_one> arrayList=new ArrayList<common_one>();
        arrayList.add(new common_one("लाल  (Lal)","Red",R.drawable.red));
        arrayList.add(new common_one("पीला  (Peela)","Yellow",R.drawable.yellow));
        arrayList.add(new common_one("हरा  (hara)","Green",R.drawable.green));
        arrayList.add(new common_one("बैंगनी  (bengani)","Purple",R.drawable.purple));
        arrayList.add(new common_one("गहरा भूरा (gehra bhura)","Maroon",R.drawable.maroon));
        arrayList.add(new common_one("नारंगी  (narangi)","Orange",R.drawable.orange));
        arrayList.add(new common_one("काला  (kala)","Black",R.drawable.black));
        arrayList.add(new common_one("भूरा  bhura)","Brown",R.drawable.brown));
        arrayList.add(new common_one("गुलाबी  (gulabi)","Pink",R.drawable.pink));
        arrayList.add(new common_one("धूसर  (dhusar)","Gray",R.drawable.gray));
        arrayList.add(new common_one("सफेद  (safade)","White",R.drawable.white));

        customAdapter adp= new customAdapter(this,arrayList);
        ListView listView=(ListView)findViewById(R.id.colors_id);
        listView.setAdapter(adp);

        textToSpeech=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

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
        View rootview = inflater.inflate(R.layout.activity_colors,container,false);

        final ArrayList<common_one> arrayList=new ArrayList<common_one>();
        arrayList.add(new common_one("लाल  (Lal)","Red",R.drawable.red));
        arrayList.add(new common_one("पीला  (Peela)","Yellow",R.drawable.yellow));
        arrayList.add(new common_one("हरा  (hara)","Green",R.drawable.green));
        arrayList.add(new common_one("बैंगनी  (bengani)","Purple",R.drawable.purple));
        arrayList.add(new common_one("गहरा भूरा (gehra bhura)","Maroon",R.drawable.maroon));
        arrayList.add(new common_one("नारंगी  (narangi)","Orange",R.drawable.orange));
        arrayList.add(new common_one("काला  (kala)","Black",R.drawable.black));
        arrayList.add(new common_one("भूरा  bhura)","Brown",R.drawable.brown));
        arrayList.add(new common_one("गुलाबी  (gulabi)","Pink",R.drawable.pink));
        arrayList.add(new common_one("धूसर  (dhusar)","Gray",R.drawable.gray));
        arrayList.add(new common_one("सफेद  (safade)","White",R.drawable.white));

        customAdapter adp= new customAdapter(getContext(),arrayList);
        ListView listView=(ListView)rootview.findViewById(R.id.colors_id);
        listView.setAdapter(adp);

        textToSpeech=new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

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

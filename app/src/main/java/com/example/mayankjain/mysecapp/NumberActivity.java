package com.example.mayankjain.mysecapp;

import android.content.Context;
import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;
import java.util.Locale;

public class NumberActivity extends Fragment {
    private TextToSpeech textToSpeech;

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        final ArrayList<word> words=new ArrayList<word>();

        NumberToWord obj=new NumberToWord();

        for(int i=0;i<1000;i++)//i<words.size();++i)
    {
        words.add(new word(""+i,obj.convert(i)));

    }
       wordAdapter w_adp = new wordAdapter(this,words);
        ListView lv=(ListView)findViewById(R.id.list);
        lv.setBackgroundColor(Color.parseColor("#FF9800"));
        lv.setAdapter(w_adp);

       textToSpeech =new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
           @Override
           public void onInit(int status) {

           }
       });

       lv.setOnItemClickListener(new OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               word w=words.get(position);
               textToSpeech.setLanguage(Locale.ENGLISH);
               textToSpeech.speak(w.getWord(),TextToSpeech.QUEUE_FLUSH,null);

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
        final ArrayList<word> words=new ArrayList<word>();
        View rootview= inflater.inflate(R.layout.activity_number,container,false);

        NumberToWord obj=new NumberToWord();

        for(int i=0;i<1000;i++)//i<words.size();++i)
        {
            words.add(new word(""+i,obj.convert(i)));

        }
        wordAdapter w_adp = new wordAdapter(getContext(),words);
        ListView lv=(ListView)rootview.findViewById(R.id.list);
        lv.setBackgroundColor(Color.parseColor("#FF9800"));
        lv.setAdapter(w_adp);

        textToSpeech =new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word w=words.get(position);
                textToSpeech.setLanguage(Locale.ENGLISH);
                textToSpeech.speak(w.getWord(),TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        return rootview;
    }
}


class NumberToWord
{
    private static final String[] specialNames = {
            "",
            " thousand",
            " million",
            " billion",
            " trillion",
            " quadrillion",
            " quintillion"
    };

    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20) {
            current = numNames[number % 100];
            number /= 100;
        } else {
            current = numNames[number % 10];
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " hundred" + current;
    }

    public String convert(int number) {

        if (number == 0) {
            return "zero";
        }

        String prefix = "";

        if (number < 0) {
            number = -number;
            prefix = "negative";
        }

        String current = "";
        int place = 0;

        do {
            int n = number % 1000;
            if (n != 0) {
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (prefix + current).trim();
    }
}
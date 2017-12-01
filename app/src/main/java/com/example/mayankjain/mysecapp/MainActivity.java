package com.example.mayankjain.mysecapp;

import android.app.Activity;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    ViewPager ViewPagerForALL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.ViewPagerId);
        viewAdapter viewAdp = new viewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewAdp);
        ViewPagerForALL=viewPager;

        TabLayout tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);



    }

    public ViewPager getViewPager(){

        return ViewPagerForALL;
    }

}


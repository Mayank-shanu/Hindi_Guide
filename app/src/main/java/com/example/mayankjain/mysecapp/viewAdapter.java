package com.example.mayankjain.mysecapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mayank jain on 6/24/2017.
 */

public class viewAdapter extends FragmentPagerAdapter {

    String[] s={"Content","Numbers","Family","Colors","Phrases","About"};
    public viewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:return new content();
            case 1:return new NumberActivity();
            case 2:return new FMembersActivity();
            case 3:return new ColorsActivity();
            case 4:return new PhrasesActivity();
            default:return new about();}
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return s[position];
    }
}

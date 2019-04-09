package com.example.shubhangi.picnara.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



import com.example.shubhangi.picnara.Model.Data;

import java.util.ArrayList;

/**
 * Created by shubhangi on 09-04-2019.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 3;
    final String[] fragName={"NEW","APPLIED","BOOKMARKED"};
    ArrayList<Data> adp;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<Data> ad){
        super(fm);
        adp=ad;

    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PagerFragment.newInstance(adp);
            case 1:
                return PagerFragment.newInstance(null);
            case 2:
                return PagerFragment.newInstance(null);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}

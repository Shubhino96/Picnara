package com.example.shubhangi.picnara;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.shubhangi.picnara.Adapters.PagerFragment;
import com.example.shubhangi.picnara.Adapters.ViewPagerAdapter;
import com.example.shubhangi.picnara.Model.Data;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter padap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vpPager = (ViewPager) findViewById(R.id.viewpager);
        ArrayList<Data> dat1=new ArrayList<>();
        dat1.add(new Data("Rajiv","Photography can be art, hoby or..","600","30 to 50","20 Mar 2019","02 Apr 2019"));
        dat1.add(new Data("Rohit","Photography can be art, hoby or..","800","10 to 20","24 Mar 2019","02 Apr 2019"));
        dat1.add(new Data("Ankit","Photography can be art, hoby or..","700","15 to 30","20 Mar 2019","09 Apr 2019"));

        padap=new ViewPagerAdapter(getSupportFragmentManager(),dat1);
        vpPager.setAdapter(padap);
    }
}

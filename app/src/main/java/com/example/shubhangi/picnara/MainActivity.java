package com.example.shubhangi.picnara;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;

import com.example.shubhangi.picnara.Adapters.PagerFragment;
import com.example.shubhangi.picnara.Adapters.ViewPagerAdapter;
import com.example.shubhangi.picnara.Model.Data;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    ViewPagerAdapter padap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout drawerLayout=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close){
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                //actions upon opening slider
                //presently nothing
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                //actions upon closing slider
                //presently nothing

            }
        };
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        ViewPager vpPager = (ViewPager) findViewById(R.id.viewpager);
        ArrayList<Data> arrlist=new ArrayList<>();
        arrlist.add(new Data("Rajiv","Photography can be art, hoby or..","600","30 to 50","20 Mar 2019","02 Apr 2019"));
        arrlist.add(new Data("Rohit","Photography can be art, hoby or..","800","10 to 20","24 Mar 2019","02 Apr 2019"));
        arrlist.add(new Data("Ankit","Photography can be art, hoby or..","700","15 to 30","20 Mar 2019","09 Apr 2019"));

        padap=new ViewPagerAdapter(getSupportFragmentManager(),arrlist);
        vpPager.setAdapter(padap);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}

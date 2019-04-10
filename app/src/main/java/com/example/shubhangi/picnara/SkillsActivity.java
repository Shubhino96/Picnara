package com.example.shubhangi.picnara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shubhangi.picnara.Adapters.SkillsAdapter;

import java.util.ArrayList;
import java.util.List;

public class SkillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        RecyclerView recyleview=findViewById(R.id.recyview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(SkillsActivity.this, 3);
        recyleview.setLayoutManager(mGridLayoutManager);
        List<String> skillset=new ArrayList<>();
        skillset.add("Camera");
        skillset.add("Printing");
        skillset.add("Digital Imaging");
        skillset.add("Lenses");
        skillset.add("Photoshop");
        skillset.add("Shooting");
        skillset.add("Camera");
        skillset.add("Camera");
        skillset.add("Camera");
        SkillsAdapter adapter=new SkillsAdapter(this,skillset);
        recyleview.setAdapter(adapter);
    }
}

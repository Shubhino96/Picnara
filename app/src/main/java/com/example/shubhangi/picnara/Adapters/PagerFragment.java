package com.example.shubhangi.picnara.Adapters;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shubhangi.picnara.Model.Data;
import com.example.shubhangi.picnara.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shubhangi on 09-04-2019.
 */

public class PagerFragment extends Fragment {

    ArrayList<Data> d1 = new ArrayList<Data>();
    public static PagerFragment newInstance(ArrayList<Data> data){
        PagerFragment pagerFragment=new PagerFragment();
        Bundle bundle=new Bundle();
        bundle.putSerializable("List",data);
        pagerFragment.setArguments(bundle);
        return pagerFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d1=(ArrayList<Data>)getArguments().getSerializable("List");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homefragment, container, false);
        ArrayList<Data> arrlist=new ArrayList<>();
        arrlist.add(new Data("Rajiv","Photography can be art, hoby or..","600","30 to 50","20 Mar 2019","02 Apr 2019"));
        arrlist.add(new Data("Rohit","Photography can be art, hoby or..","800","10 to 20","24 Mar 2019","02 Apr 2019"));
        arrlist.add(new Data("Ankit","Photography can be art, hoby or..","700","15 to 30","20 Mar 2019","09 Apr 2019"));
        RecyclerAdapter adapt=new RecyclerAdapter(arrlist,getActivity());
        RecyclerView recy=view.findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recy.setLayoutManager(llm);
        recy.setAdapter(adapt);
        return view;
    }
}

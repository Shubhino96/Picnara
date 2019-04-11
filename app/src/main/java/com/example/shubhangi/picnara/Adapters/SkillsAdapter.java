package com.example.shubhangi.picnara.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shubhangi.picnara.R;

import java.util.List;

/**
 * Created by shubhangi on 11-04-2019.
 */

public class SkillsAdapter extends RecyclerView.Adapter<SkillsAdapter.SkilViewHolder> {

    public class SkilViewHolder extends RecyclerView.ViewHolder{


        TextView tv;
        public SkilViewHolder(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.skilbox);
        }
    }
     Context context;
    List<String> list1;
    public SkillsAdapter(Context con,List<String> skills){
        context=con;
        list1=skills;
    }

    @Override
    public SkillsAdapter.SkilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.textbox, parent, false);

        return  new SkilViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(SkillsAdapter.SkilViewHolder viewHolder, int position) {

        viewHolder.tv.setText(list1.get(position));
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }
}

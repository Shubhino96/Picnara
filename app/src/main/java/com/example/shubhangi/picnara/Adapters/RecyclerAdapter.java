package com.example.shubhangi.picnara.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shubhangi.picnara.Model.Data;
import com.example.shubhangi.picnara.R;

import java.util.ArrayList;

/**
 * Created by shubhangi on 09-04-2019.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DataViewHolder> {
    public class DataViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView nam,des,bud,pur,evnt,post;
        public DataViewHolder(View itemView) {
            super(itemView);
            cv=itemView.findViewById(R.id.cv);
            nam=itemView.findViewById(R.id.tv1);
            des=itemView.findViewById(R.id.desc);
            bud=itemView.findViewById(R.id.bud);
            pur=itemView.findViewById(R.id.prop);
            evnt=itemView.findViewById(R.id.event);
            post=itemView.findViewById(R.id.post);
        }
    }
    private ArrayList<Data> dat;
    Context c;
    RecyclerAdapter(ArrayList<Data> d1,Context c){
        dat=d1;
        this.c=c;
    }
    @Override
    public RecyclerAdapter.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = c;
        LayoutInflater inflater = LayoutInflater.from(context);
        View DtView = inflater.inflate(R.layout.element,parent,true);
        DataViewHolder viewholder=new DataViewHolder(DtView);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.DataViewHolder holder, int position) {
        Data data1=dat.get(position);
        TextView name,desp,budj,purp,evn,pos;
        name= holder.nam;
        name.setText(data1.getName());
        desp=holder.des;desp.setText(data1.getDescp());
        budj=holder.bud;
        budj.setText(data1.getBudget());
        purp=holder.pur;
        purp.setText(data1.getPropos());
        evn=holder.evnt;
        evn.setText(data1.getEvent());
        pos=holder.post;
        pos.setText(data1.getPosted());

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

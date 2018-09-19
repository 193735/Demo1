package com.example.administrator.demo1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/9/18.
 */

public class HomeaAdapter extends RecyclerView.Adapter<HomeaAdapter.MyViewHolder> {
    private List<String>mlist ;
    private Context mcontext;

    public HomeaAdapter(Context mcontext, List<String>mlist) {
        this.mcontext = mcontext;
        this.mlist = mlist;
    }

    public void removeData(int position){
        mlist.remove(position);
        notifyItemInserted(position);
    }


    @Override
   public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.item,parent,false));
        return holder;
   }
    @Override
    public void onBindViewHolder (final MyViewHolder holder,final int position) {
        holder.tv.setText(mlist.get(position));

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
               TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.item);
        }
    }
}

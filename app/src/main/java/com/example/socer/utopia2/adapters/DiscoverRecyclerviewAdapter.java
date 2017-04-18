package com.example.socer.utopia2.adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;

import java.util.List;

/**
 * Created by socer on 17-4-18.
 */

public class DiscoverRecyclerviewAdapter extends RecyclerView.Adapter<DiscoverRecyclerviewAdapter.DiscoverViewHolder> {

    private Context mCOntext;

    protected List<DisccoverMsgModelBean> items;


    @Override
    public DiscoverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCOntext).inflate(R.layout.fragment_discover_items_layout,parent,false);
        return new DiscoverViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DiscoverViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public class DiscoverViewHolder extends RecyclerView.ViewHolder{

        public DiscoverViewHolder(View itemView) {
            super(itemView);
        }
    }




}

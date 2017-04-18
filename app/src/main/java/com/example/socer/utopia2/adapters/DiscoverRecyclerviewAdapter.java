package com.example.socer.utopia2.adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

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
        return null;
    }

    @Override
    public void onBindViewHolder(DiscoverViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class DiscoverViewHolder extends RecyclerView.ViewHolder{

        public DiscoverViewHolder(View itemView) {
            super(itemView);
        }
    }




}

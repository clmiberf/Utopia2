package com.example.socer.utopia2.adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;

import java.util.List;

/**
 * Created by socer on 17-4-18.
 */

public class DiscoverRecyclerviewAdapter extends RecyclerView.Adapter<DiscoverRecyclerviewAdapter.DiscoverViewHolder> {

    private Context mContext;

    protected List<DisccoverMsgModelBean> items;


    @Override
    public DiscoverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.fragment_discover_items_layout,parent,false);
        return new DiscoverViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DiscoverViewHolder holder, int position) {
        DisccoverMsgModelBean msgModelBean = items.get(position);

        Glide.with(mContext)
                .load(msgModelBean.getPublisherPictrueUrl().toString())
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .into(holder.imageView);
        holder.publisher.setText(msgModelBean.getPublisher().toString());
        holder.contentView.setText(msgModelBean.getTopicContent().toString());
        holder.lightTextView.setText(msgModelBean.getLightenSum());
        holder.commentTextView.setText(msgModelBean.getCommentSum());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"平哥最帅a",Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public class DiscoverViewHolder extends RecyclerView.ViewHolder{
        LinearLayout linearLayout;
        ImageView imageView;
        TextView publisher;
        TextView lightTextView;
        TextView commentTextView;
        TextView contentView;

        public DiscoverViewHolder(View itemView) {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.diacover_item_linearlayout);
            imageView = (ImageView) itemView.findViewById(R.id.discover_item_user_head_pictrue);
            lightTextView = (TextView) itemView.findViewById(R.id.discover_item_light_number);
            commentTextView = (TextView) itemView.findViewById(R.id.discover_item_comment_number);
            publisher = (TextView) itemView.findViewById(R.id.discover_user_nickname);
            contentView = (TextView) itemView.findViewById(R.id.discover_item_content);
        }
    }




}

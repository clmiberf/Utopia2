package com.example.socer.utopia2.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.ui.activities.DiscoverContentActivity;

import java.util.List;

/**
 * Created by socer on 17-4-18.
 *
 */

public class DiscoverRecyclerviewAdapter extends RecyclerView.Adapter<DiscoverRecyclerviewAdapter.DiscoverViewHolder> {

    private Context mContext;

    private List<DisccoverMsgModelBean> items;

    public DiscoverRecyclerviewAdapter(Context mContext, List<DisccoverMsgModelBean> items) {
        this.mContext = mContext;
        this.items = items;
    }

    @Override
    public DiscoverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_discover,parent,false);
        return new DiscoverViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DiscoverViewHolder holder, int position) {
        DisccoverMsgModelBean msgModelBean = items.get(position);
        String lightSum = msgModelBean.getLightenSum()+"";
        String commentSum = msgModelBean.getCommentSum()+"";
        Glide.with(mContext)
                .load(msgModelBean.getPublisherPictrueUrl())
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .into(holder.imageView);
        holder.publisher.setText(msgModelBean.getPublisher());
        holder.contentView.setText(msgModelBean.getTopicContent());
        holder.lightTextView.setText(lightSum);
        holder.commentTextView.setText(commentSum);
        holder.topicView.setText(msgModelBean.getTopicTitle());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DiscoverContentActivity.class);
                intent.putExtra("bean", msgModelBean);
                mContext.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    class DiscoverViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView publisher;
        TextView lightTextView;
        TextView commentTextView;
        TextView contentView;
        CardView cardView;
        TextView topicView;

        DiscoverViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.discover_item_user_head_pictrue);
            lightTextView = (TextView) itemView.findViewById(R.id.discover_item_light_number);
            commentTextView = (TextView) itemView.findViewById(R.id.discover_item_comment_number);
            publisher = (TextView) itemView.findViewById(R.id.discover_user_nickname);
            contentView = (TextView) itemView.findViewById(R.id.discover_item_content);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            topicView = (TextView) itemView.findViewById(R.id.topic);
        }
    }




}

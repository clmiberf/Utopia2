package com.example.socer.utopia2.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
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
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.model.beans.TopicModelBean;
import com.example.socer.utopia2.mvp.ui.activities.TimeLimitedTaskActivity;

import java.util.List;

/**
 * Created by socer on 17-4-20.
 */

public class TopicRecyclerviewAdapter extends RecyclerView.Adapter<TopicRecyclerviewAdapter.TopicViewHolder> {

    private Context mContext;

    private List<DisccoverMsgModelBean> items;

    public TopicRecyclerviewAdapter(Context mContext, List<DisccoverMsgModelBean> items) {
        this.mContext = mContext;
        this.items = items;
    }

    @Override
    public TopicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_discover,parent,false);
        return new TopicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TopicViewHolder holder, int position) {
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
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"这是哪个fragment?",Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public int getItemCount() {
        return items.size();
    }

    class TopicViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView publisher;
        TextView lightTextView;
        TextView commentTextView;
        TextView contentView;
        CardView cardView;

        TopicViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.discover_item_user_head_pictrue);
            lightTextView = (TextView) itemView.findViewById(R.id.discover_item_light_number);
            commentTextView = (TextView) itemView.findViewById(R.id.discover_item_comment_number);
            publisher = (TextView) itemView.findViewById(R.id.discover_user_nickname);
            contentView = (TextView) itemView.findViewById(R.id.discover_item_content);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }




}


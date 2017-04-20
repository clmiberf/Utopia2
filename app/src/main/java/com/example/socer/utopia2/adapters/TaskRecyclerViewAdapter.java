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
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.ui.activities.TimeLimitedTaskActivity;

import java.util.List;

/**
 * Created by socer on 17-3-28.
 *
 */

public class TaskRecyclerViewAdapter extends RecyclerView.Adapter<TaskRecyclerViewAdapter.TaskRecyclerViewHolder> {
    private Context context;
    private List<TaskModelBean> items;

    public TaskRecyclerViewAdapter(Context mcontext, List<TaskModelBean> items) {
        this.context = mcontext;
        this.items = items;
    }


    @Override
    public TaskRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_task,parent,false);
        return new TaskRecyclerViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final TaskRecyclerViewHolder holder, int position) {
        TaskModelBean task = items.get(position);

        Glide.with(context)
                .load(task.getPictuerUrl())
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .into(holder.imageView);
        holder.textView.setText(task.getTaskName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Card的点击事件", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, TimeLimitedTaskActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class TaskRecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        CardView cardView;
        TaskRecyclerViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.task_image_item);
            textView = (TextView) itemView.findViewById(R.id.task_text_item);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }
}

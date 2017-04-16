package com.example.socer.utopia2.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;

import java.util.List;

/**
 * Created by socer on 17-3-28.
 */

public class TaskRecyclerViewAdapter extends RecyclerView.Adapter<TaskRecyclerViewAdapter.TaskRecyclerViewHolder> {
    private Context mcontext;
    protected List<TaskModelBean> items;

    public TaskRecyclerViewAdapter(Context mcontext, List<TaskModelBean> items) {
        this.mcontext = mcontext;
        this.items = items;
    }


    @Override
    public TaskRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.task_item_layout,parent,false);
        return new TaskRecyclerViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final TaskRecyclerViewHolder holder, int position) {
        TaskModelBean task = items.get(position);

        Glide.with(mcontext)
                .load(task.getPictuerUrl().toString())
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .into(holder.imageView);
        holder.textView.setText(task.getTaskName().toString());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext,"平哥最帅",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class TaskRecyclerViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout relativeLayout;
        ImageView imageView;
        TextView textView;

        public TaskRecyclerViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.task_image_item);
            textView = (TextView) itemView.findViewById(R.id.task_text_item);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.task_item_relativelayout);
        }
    }
}

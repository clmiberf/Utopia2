package com.example.socer.utopia2.shared;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by socer on 17-4-17.
 */

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    private int space = 0;

    public SpaceItemDecoration(int space){
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = 0;
        outRect.right = 0;
        outRect.bottom = space;
        outRect.top = space;
//        super.getItemOffsets(outRect, view, parent, state);
    }

}

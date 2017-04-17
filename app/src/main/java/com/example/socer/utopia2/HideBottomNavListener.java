package com.example.socer.utopia2;

import android.support.v7.widget.RecyclerView;

import me.majiajie.pagerbottomtabstrip.NavigationController;

/**
 * Created by xiang on 2017/4/16.
 */

public class HideBottomNavListener extends RecyclerView.OnScrollListener {

    NavigationController controller = null;

    public HideBottomNavListener(NavigationController controller) {
        this.controller = controller;
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        if(dy > 8){//列表向上滑动
            controller.hideBottomLayout();
        } else if(dy < -8){//列表向下滑动
            controller.showBottomLayout();

        }
    }
}

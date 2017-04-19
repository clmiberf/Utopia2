package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.AddTaskView;

import rx.Subscription;

/**
 * Created by xiang on 2017/4/18.
 */

public interface AddTaskModelApi {
    Subscription loadTasksInfo(String userId, AddTaskView view);
}

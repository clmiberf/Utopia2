package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.TaskView;

import rx.Subscription;

/**
 * Created by socer on 17-4-16.
 */

public interface TaskModelApi {

    Subscription loadTaskList(String userId, TaskView view);
}



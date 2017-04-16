package com.example.socer.utopia2.mvp.model.impls;

import com.example.socer.utopia2.mvp.model.interfaces.TaskModelApi;
import com.example.socer.utopia2.mvp.views.TaskView;
import com.example.socer.utopia2.network.HttpMethod;

import rx.Subscription;

/**
 * Created by socer on 17-4-16.
 */

public class TaskModelApiIpml implements TaskModelApi {
    @Override
    public Subscription loadTaskList(String userId, TaskView view) {
        return HttpMethod.getInstance().loadTaskList(userId,view);
    }
}

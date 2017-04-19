package com.example.socer.utopia2.mvp.model.impls;

import com.example.socer.utopia2.mvp.model.interfaces.AddTaskModelApi;
import com.example.socer.utopia2.mvp.views.AddTaskView;

import rx.Subscription;

/**
 * Created by xiang on 2017/4/18.
 */

public class AddTaskModelApiIpml implements AddTaskModelApi {
    @Override
    public Subscription loadTasksInfo(String userId, AddTaskView view) {
        return null;
    }
}

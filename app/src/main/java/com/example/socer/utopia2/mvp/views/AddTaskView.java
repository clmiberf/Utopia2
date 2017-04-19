package com.example.socer.utopia2.mvp.views;

import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.views.base.BaseView;

import java.util.List;

/**
 * Created by xiang on 2017/4/18.
 */

public interface AddTaskView extends BaseView {
    void initTasksInfo(List<TaskModelBean> modelBeen);

    void successed(List<TaskModelBean> modelBeen);

    void failed(String errorMsg);
}

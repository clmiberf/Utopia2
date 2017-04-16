package com.example.socer.utopia2.mvp.views;

import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.views.base.BaseView;

import java.util.List;

/**
 * Created by socer on 17-4-11.
 */

public interface TaskView extends BaseView {

    void initTaskListView(List<TaskModelBean> taskList);

    void LoadSuccess(List<TaskModelBean> data);

    void loadFailed(String errorMsg);
}

package com.example.socer.utopia2.mvp.views;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.views.base.BaseView;

import java.util.List;

/**
 * Created by socer on 17-4-16.
 */

public interface DiscoverHotView extends BaseView {
    void initDiscoverHotMsgListView(List<DisccoverMsgModelBean> taskList);

    void LoadSuccess(List<DisccoverMsgModelBean> data);

    void loadFailed(String errorMsg);
}

package com.example.socer.utopia2.mvp.views.bottomviews.discoverviews;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.views.base.BaseView;

import java.util.List;

/**
 * Created by socer on 17-4-17.
 */

public interface DiscoverNearView extends BaseView {

    void initDiscoverNearMsgListView(List<DisccoverMsgModelBean> nearList);

    void LoadSuccess(List<DisccoverMsgModelBean> data);

    void loadFailed(String errorMsg);
}

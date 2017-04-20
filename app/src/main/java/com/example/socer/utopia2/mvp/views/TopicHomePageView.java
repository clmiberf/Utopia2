package com.example.socer.utopia2.mvp.views;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.model.beans.TopicModelBean;
import com.example.socer.utopia2.mvp.views.base.BaseView;

import java.util.List;

/**
 * Created by socer on 17-4-20.
 */

public interface TopicHomePageView extends BaseView{
    void initTopicInfo(TopicModelBean msgModelBeenList,List<DisccoverMsgModelBean> msgModelBeanList );

    void loadSuccessed(List<TopicModelBean> msgList);

    void loadFailed(String errMsg);

}

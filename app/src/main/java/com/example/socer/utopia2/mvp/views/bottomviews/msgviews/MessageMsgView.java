package com.example.socer.utopia2.mvp.views.bottomviews.msgviews;

import com.example.socer.utopia2.mvp.model.beans.ContactModelBean;
import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.views.base.BaseView;

import java.util.List;

/**
 * Created by socer on 17-4-17.
 */

public interface MessageMsgView extends BaseView {

    void initMessageMsgList(List<ContactModelBean> msgList) ;

    void LoadSuccess(List<ContactModelBean> data);

    void loadFailed(String errorMsg);

}

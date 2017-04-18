package com.example.socer.utopia2.mvp.views.bottomviews;

import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.mvp.views.base.BaseView;

/**
 * Created by xiang on 2017/4/17.
 *
 */

public interface PersonView extends BaseView {

    void initPersonInfo(UserInfoModelBean modelBean);

    void loadSuccessed(UserInfoModelBean modelBean);

    void loadFailed(String errorMsg);
}

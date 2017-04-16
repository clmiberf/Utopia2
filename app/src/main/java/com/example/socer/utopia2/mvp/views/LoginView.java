package com.example.socer.utopia2.mvp.views;

import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.mvp.views.base.BaseView;

/**
 * Created by socer on 17-4-16.
 */

public interface LoginView  extends BaseView{
    void loginSuccess(UserInfoModelBean userInfoModelBean);

    void loginFailed(String msg);
}

package com.example.socer.utopia2.mvp.model.impls;

import com.example.socer.utopia2.mvp.model.interfaces.LoginModelApi;
import com.example.socer.utopia2.mvp.views.LoginView;
import com.example.socer.utopia2.network.HttpMethod;

import rx.Subscription;

/**
 * Created by socer on 17-4-16.
 */

public class LoginModelApiImpls implements LoginModelApi {
    @Override
    public Subscription login(String username, String password, LoginView view) {
        return HttpMethod.getInstance().login(username,password,view);
    }
}

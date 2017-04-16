package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.LoginView;

import rx.Subscription;

/**
 * Created by socer on 17-4-16.
 */

public interface LoginModelApi {
    Subscription login(String username, String password, LoginView view);
}

package com.example.socer.utopia2.mvp.presenter.base;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.socer.utopia2.mvp.views.base.BaseView;

/**
 * Created by socer on 17-4-16.
 */

public abstract class BasePresenter<T extends BaseView> {
    protected T mView;

    public void onCreate(Bundle savedInstanceState){

    }

    public void attachView(@NonNull T view){mView = view;}

    public void onStart(){}

    public void onStop(){}

    public void onResume(){}

    public void onPause(){}

    public void onDestory(){}
}

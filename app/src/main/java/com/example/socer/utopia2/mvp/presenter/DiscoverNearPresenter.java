package com.example.socer.utopia2.mvp.presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.socer.utopia2.mvp.model.impls.DiscoverNearModelApiImpl;
import com.example.socer.utopia2.mvp.presenter.base.BasePresenter;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverNearView;

import javax.inject.Inject;

/**
 * Created by socer on 17-4-18.
 */

public class DiscoverNearPresenter extends BasePresenter<DiscoverNearView> {
    private Context mContext;

    private SharedPreferences preferences = null;

    private String userId;

    @Inject
    DiscoverNearPresenter(Context context){this.mContext = context;}

    public DiscoverNearPresenter(Context mContext, SharedPreferences preferences) {
        this.preferences = preferences;
        this.userId = preferences.getString("User_Id","");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadDiscoverNearInfo();
    }

    private void loadDiscoverNearInfo(){
        DiscoverNearModelApiImpl nearModelApi = new DiscoverNearModelApiImpl();
        nearModelApi.loadDiscoverNearList(userId,mView);
    }
}

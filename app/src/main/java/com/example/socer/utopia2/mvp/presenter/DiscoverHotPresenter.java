package com.example.socer.utopia2.mvp.presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.socer.utopia2.mvp.model.impls.DiscoverHotModelApiImpl;
import com.example.socer.utopia2.mvp.presenter.base.BasePresenter;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverHotView;

import javax.inject.Inject;

/**
 * Created by socer on 17-4-18.
 */

public class DiscoverHotPresenter extends BasePresenter<DiscoverHotView> {
    private Context mContext;
    private SharedPreferences preferences = null;
    private String userId = null;

    @Inject
    DiscoverHotPresenter(Context context){this.mContext = context;}

    public DiscoverHotPresenter(Context mContext, SharedPreferences preferences) {
        this.preferences = preferences;
        userId = preferences.getString("User_Id","");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadDiscoverHotInfo();

    }

    private void loadDiscoverHotInfo(){
        DiscoverHotModelApiImpl discoverHotModelApi = new DiscoverHotModelApiImpl();
        discoverHotModelApi.loadDiscoverHotMsgList(userId,mView);
    }

}

package com.example.socer.utopia2.mvp.presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.socer.utopia2.mvp.model.impls.DiscoverNewModelApiImp;
import com.example.socer.utopia2.mvp.presenter.base.BasePresenter;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverNewView;

import javax.inject.Inject;

/**
 * Created by socer on 17-4-18.
 */

public class DiscoverNewPresenter extends BasePresenter<DiscoverNewView> {

    private Context mContext;

    private SharedPreferences preferences = null;

    private String userId = null;

    @Inject
    DiscoverNewPresenter(Context context){this.mContext = context;}

    public DiscoverNewPresenter(Context mContext, SharedPreferences preferences) {
        this.preferences = preferences;
        this.userId = preferences.getString("User_Id","");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadDiscoverNewInfo();
    }

    private void loadDiscoverNewInfo(){
        DiscoverNewModelApiImp discoverNewModelApiImp = new DiscoverNewModelApiImp();
        discoverNewModelApiImp.loadDiscoverNewMsgList(userId,mView);
    }
}

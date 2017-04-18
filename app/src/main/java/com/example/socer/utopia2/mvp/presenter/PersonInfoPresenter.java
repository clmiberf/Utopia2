package com.example.socer.utopia2.mvp.presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.socer.utopia2.mvp.model.impls.PersonInfoApiIpml;
import com.example.socer.utopia2.mvp.presenter.base.BasePresenter;
import com.example.socer.utopia2.mvp.views.bottomviews.PersonView;

import org.greenrobot.greendao.annotation.Index;

import javax.inject.Inject;

/**
 * Created by socer on 17-4-18.
 */

public class PersonInfoPresenter extends BasePresenter<PersonView> {
    private Context mContext;

    private SharedPreferences preferences = null;

    private String userId;

    @Inject
    PersonInfoPresenter(Context context){this.mContext = context;}

    public PersonInfoPresenter(Context mContext, SharedPreferences preferences) {
        this.preferences = preferences;
        this.userId = preferences.getString("User_Id","");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadPersonInfo();
    }

    private void loadPersonInfo(){
        PersonInfoApiIpml infoApiIpml = new PersonInfoApiIpml();
        infoApiIpml.loadPersonInfo(userId,mView);
    }

}

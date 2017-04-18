package com.example.socer.utopia2.mvp.ui.fragments.bootomfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.PersonView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonFragment extends BaseFragment implements PersonView{


    public PersonFragment() {
        // Required empty public constructor
    }

    private static PersonFragment fragment;
    public static PersonFragment newInstance() {
        if (fragment == null) {
            fragment = new PersonFragment();
        }
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_person;
    }

    @Override
    protected void initializeInjector() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void initPersonInfo(UserInfoModelBean modelBean) {

    }

    @Override
    public void loadSuccessed(UserInfoModelBean modelBean) {

    }

    @Override
    public void loadFailed(String errorMsg) {

    }
}

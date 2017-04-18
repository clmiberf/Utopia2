package com.example.socer.utopia2.mvp.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.DiscoverContentView;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverHotView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends BaseFragment implements DiscoverHotView {


    public ContentFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_content;
    }

    @Override
    protected void initializeInjector() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mFragmentView = super.onCreateView(inflater, container, savedInstanceState);
        return mFragmentView;
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void initDiscoverHotMsgListView(List<DisccoverMsgModelBean> hotList) {



    }

    @Override
    public void LoadSuccess(List<DisccoverMsgModelBean> data) {

    }

    @Override
    public void loadFailed(String errorMsg) {

    }
}

package com.example.socer.utopia2.mvp.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.DiscoverContentView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverContentFragment extends BaseFragment implements DiscoverContentView {


    public DiscoverContentFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_discover_content;
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
}

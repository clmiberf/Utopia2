package com.example.socer.utopia2.mvp.ui.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;

public class RegisteFragment extends BaseFragment {


    public RegisteFragment() {
        // Required empty public constructor
    }

    private static RegisteFragment fragment;

    public static RegisteFragment newInstance() {
        if (fragment==null) {
            fragment = new RegisteFragment();
        }
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_registe;
    }

    @Override
    protected void initializeInjector() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }

}

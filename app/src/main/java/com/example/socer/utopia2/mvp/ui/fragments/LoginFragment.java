package com.example.socer.utopia2.mvp.ui.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;

public class LoginFragment extends BaseFragment {

    private static LoginFragment fragment;


    public LoginFragment() {
        // Required empty public constructor
    }

    public static LoginFragment newInstance() {
        if (fragment == null) {
            fragment = new LoginFragment();
        }
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
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

}

package com.example.socer.utopia2.mvp.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends BaseFragment {


    public MessageFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_message;
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

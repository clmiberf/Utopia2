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
public class TimeTaskFragment extends BaseFragment {


    public TimeTaskFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initializeInjector() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_task, container, false);
    }

}

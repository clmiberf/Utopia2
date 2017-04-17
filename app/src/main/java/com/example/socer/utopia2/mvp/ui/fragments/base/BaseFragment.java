package com.example.socer.utopia2.mvp.ui.fragments.base;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by socer on 17-4-11.
 *
 */

public abstract class BaseFragment extends Fragment {
    protected View mFragmentView;
    /**
     *当需要自动隐藏底栏的时候，需要在定义完recycler后，添加语句:
     * recyclerView.addOnScrollListener(onScrollLister);
     */
    protected RecyclerView.OnScrollListener onScrollListener;

    protected abstract int getLayoutId();

    protected abstract void initializeInjector();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this.getActivity());
        initializeInjector();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mFragmentView == null){
            mFragmentView = inflater.inflate(getLayoutId(),container,false);
            ButterKnife.bind(this,mFragmentView);
        }

        return mFragmentView;
    }

    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }
}

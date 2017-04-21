package com.example.socer.utopia2.mvp.ui.fragments.bootomfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.HideBottomNavListener;
import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.ContactModelBean;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.msgviews.MessageMsgView;

import java.util.List;

/**
 * Created by socer on 17-4-20.
 */

public class MsgFragment extends BaseFragment implements MessageMsgView {

    public static MsgFragment fragment;

    public static MsgFragment newInstance() {
        if (fragment == null) {
            fragment = new MsgFragment();
        }
        return fragment;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_msg;
    }

    @Override
    protected void initializeInjector() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setOnScrollListener(HideBottomNavListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
    }

    @Override
    public void initMessageMsgList(List<ContactModelBean> msgList) {

    }

    @Override
    public void LoadSuccess(List<ContactModelBean> data) {

    }

    @Override
    public void loadFailed(String errorMsg) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}

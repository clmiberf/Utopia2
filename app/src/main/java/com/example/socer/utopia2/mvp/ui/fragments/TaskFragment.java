package com.example.socer.utopia2.mvp.ui.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.TaskView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class TaskFragment extends BaseFragment implements TaskView {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_task;
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
    public void initTaskListView(List<TaskModelBean> taskList) {

    }

    @Override
    public void LoadSuccess(List<TaskModelBean> data) {

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

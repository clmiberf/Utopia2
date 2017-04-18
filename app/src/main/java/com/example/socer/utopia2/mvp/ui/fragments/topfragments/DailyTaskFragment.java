package com.example.socer.utopia2.mvp.ui.fragments.topfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.TaskView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by socer on 17-4-18.
 */

public class DailyTaskFragment extends BaseFragment implements TaskView {


    @BindView(R.id.action_menu_view_left)
    ActionMenuView actionMenuViewLeft;
    @BindView(R.id.action_menu_view_right)
    ActionMenuView actionMenuViewRight;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.home_task_recyclerview)
    RecyclerView homeTaskRecyclerview;
    Unbinder unbinder;

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
        unbinder = ButterKnife.bind(this, super.onCreateView(inflater, container, savedInstanceState));
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
    public void initToolbar() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

package com.example.socer.utopia2.mvp.ui.fragments.bootomfragments;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.adapters.TaskRecyclerViewAdapter;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.presenter.TaskPresenter;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.TaskView;
import com.example.socer.utopia2.shared.SpaceItemDecoration;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class TaskFragment extends BaseFragment implements TaskView {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.home_task_recyclerview)
    RecyclerView homeTaskRecyclerview;
    @BindView(R.id.action_menu_view_left)
    ActionMenuView actionMenuViewLeft;
    @BindView(R.id.action_menu_view_right)
    ActionMenuView actionMenuViewRight;
    Unbinder unbinder;

    private TaskRecyclerViewAdapter adapter = null;
    private static TaskFragment fragment;
    public static TaskFragment newInstance() {
        if (fragment == null) {
            fragment = new TaskFragment();
        }
        return fragment;
    }

    public static String status ;

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
        mFragmentView = super.onCreateView(inflater, container, savedInstanceState);
        initToolbar();
        unbinder = ButterKnife.bind(this, mFragmentView);
        TaskPresenter presenter = new TaskPresenter(getActivity(), PreferenceManager.getDefaultSharedPreferences(getActivity()));
        presenter.attachView(this);
        presenter.onCreate(savedInstanceState);
        return mFragmentView;
    }

    @Override
    public void initTaskListView(List<TaskModelBean> taskList) {
        if (status == null){
            int distance = 7;      //设置recyclerview之间的距离
            homeTaskRecyclerview.addItemDecoration(new SpaceItemDecoration(distance));
            status = "true";
        }

        homeTaskRecyclerview.setHasFixedSize(true);
        homeTaskRecyclerview.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        adapter = new TaskRecyclerViewAdapter(this.getActivity(),taskList);
        homeTaskRecyclerview.setAdapter(adapter);
        homeTaskRecyclerview.addOnScrollListener(onScrollListener);
    }

    @Override
    public void LoadSuccess(List<TaskModelBean> data) {

    }

    @Override
    public void loadFailed(String errorMsg) {

    }

    @Override
    public void initToolbar() {
        actionMenuViewLeft = (ActionMenuView) mFragmentView.findViewById(R.id.action_menu_view_left);
        getActivity().getMenuInflater().inflate(R.menu.task_menu_left, actionMenuViewLeft.getMenu());
        actionMenuViewLeft.setOnMenuItemClickListener(new ActionMenuView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d("TaskFragment", "在这里设置点击编辑以后的事件");
                return true;
            }
        });
        actionMenuViewRight = (ActionMenuView) mFragmentView.findViewById(R.id.action_menu_view_right);
        getActivity().getMenuInflater().inflate(R.menu.task_menu_right, actionMenuViewRight.getMenu());
        actionMenuViewRight.setOnMenuItemClickListener(new ActionMenuView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d("TaskFragment", "在这里设置点击添加以后的事件");
                return true;
            }
        });
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

package com.example.socer.utopia2.mvp.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.adapters.TaskRecyclerViewAdapter;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.TaskView;
import com.example.socer.utopia2.network.HttpResult;
import com.example.socer.utopia2.shared.SpaceItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import rx.Subscription;

/**
 * A simple {@link Fragment} subclass.
 */
public class DailyTaskFragment extends BaseFragment {


    @BindView(R.id.task_list)
    RecyclerView homeTaskRecyclerview;
    Unbinder unbinder;
    public static String status;


    public DailyTaskFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_daily_task;
    }

    @Override
    protected void initializeInjector() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mFragmentView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, mFragmentView);
        loadTaskList();
        return mFragmentView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
    private void initTaskListView(List<TaskModelBean> taskList) {
        if (status == null){
            int distance = 7;      //设置recyclerview之间的距离
            homeTaskRecyclerview.addItemDecoration(new SpaceItemDecoration(distance));
            status = "true";
        }

        homeTaskRecyclerview.setHasFixedSize(true);
        homeTaskRecyclerview.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        TaskRecyclerViewAdapter adapter = new TaskRecyclerViewAdapter(this.getActivity(),taskList);
        homeTaskRecyclerview.setAdapter(adapter);
        homeTaskRecyclerview.addOnScrollListener(onScrollListener);
    }

    public Subscription loadTaskList(){
        HttpResult<List<TaskModelBean>> result = new HttpResult<List<TaskModelBean>>();
        List<TaskModelBean> data = new ArrayList<TaskModelBean>();
        TaskModelBean model = new TaskModelBean();
        List<String> persons = new ArrayList<String>();
        persons.add("平哥");
        persons.add("项三六");
        persons.add("朱重五");
        persons.add("程plus");
        List<String> status = new ArrayList<String>();
        status.add("完成");
        status.add("完成");
        status.add("未完成");
        status.add("未完成");
        List<String> url = new ArrayList<String>();
        url.add("http://img.my.csdn.net/uploads/201407/26/1406383299_1976.jpg");
        url.add("http://img.my.csdn.net/uploads/201407/26/1406383291_6518.jpg");


        model.setTaskName("晚上去刷南湖五圈");
        model.setTaskDate("20:00--21:00");
        model.setTaskPersons(persons);
        model.setTaskdescription("这是一个持之以恒的运动，除了能锻炼身体，更重要的是有综测加,美滋滋");
        model.setTaskStatus(status);
        model.setPictuerUrl("http://img.my.csdn.net/uploads/201407/26/1406383299_1976.jpg");
        model.setTaskPictureUrls(url);

        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);

        result.setData(data);
        initTaskListView(result.getData());
        return null;
    }
}

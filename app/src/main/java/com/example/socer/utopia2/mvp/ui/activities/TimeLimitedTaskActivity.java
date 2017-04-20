package com.example.socer.utopia2.mvp.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;
import com.example.socer.utopia2.mvp.views.TimeLimitedTaskView;

public class TimeLimitedTaskActivity extends BaseActivity implements TimeLimitedTaskView {

    @Override
    public int getLayoutId() {
        return R.layout.activity_time_limited_task;
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}

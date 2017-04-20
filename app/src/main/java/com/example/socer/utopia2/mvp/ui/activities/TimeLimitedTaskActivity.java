package com.example.socer.utopia2.mvp.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;
import com.example.socer.utopia2.mvp.views.TimeLimitedTaskView;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.OnClick;

public class TimeLimitedTaskActivity extends BaseActivity implements TimeLimitedTaskView {

    @BindView(R.id.back)
    CircleButton back;
    @BindView(R.id.time)
    TextView time;
    @BindView(R.id.members)
    TextView members;
    @BindView(R.id.location)
    TextView location;
    @BindView(R.id.addition)
    EditText addition;
    @BindView(R.id.sign_in)
    CircleButton signIn;

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

    @OnClick({R.id.back, R.id.time, R.id.members, R.id.location, R.id.addition, R.id.sign_in})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.time:
                break;
            case R.id.members:
                break;
            case R.id.location:
                break;
            case R.id.addition:
                break;
            case R.id.sign_in:
                break;
        }
    }
}

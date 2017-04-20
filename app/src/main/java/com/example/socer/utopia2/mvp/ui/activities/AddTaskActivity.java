package com.example.socer.utopia2.mvp.ui.activities;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;
import com.example.socer.utopia2.mvp.views.AddTaskView;

import java.util.List;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.OnClick;

public class AddTaskActivity extends BaseActivity implements AddTaskView {

    @BindView(R.id.back)
    CircleButton back;
    @BindView(R.id.pick_time_text)
    TextView pickTimeText;
    @BindView(R.id.pick_time_card)
    CardView pickTimeCard;
    @BindView(R.id.pick_member_text)
    TextView pickMemberText;
    @BindView(R.id.pick_member_card)
    CardView pickMemberCard;

    @Override
    public int getLayoutId() {
        return R.layout.activity_add_task;
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

    @Override
    public void initTasksInfo(List<TaskModelBean> modelBeen) {

    }

    @Override
    public void successed(List<TaskModelBean> modelBeen) {

    }

    @Override
    public void failed(String errorMsg) {

    }

    @OnClick({R.id.back, R.id.pick_time_card, R.id.pick_member_card})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.pick_time_card:
                break;
            case R.id.pick_member_card:
                break;
        }
    }
}

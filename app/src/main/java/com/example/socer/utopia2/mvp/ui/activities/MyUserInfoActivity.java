package com.example.socer.utopia2.mvp.ui.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;

import butterknife.BindView;

public class MyUserInfoActivity extends BaseActivity {

    @BindView(R.id.toolbar2)
    Toolbar toolbar2;

    @Override
    public int getLayoutId() {
        return R.layout.activity_my_user_info;
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
}

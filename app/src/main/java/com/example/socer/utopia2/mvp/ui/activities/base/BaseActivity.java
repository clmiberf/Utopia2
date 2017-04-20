package com.example.socer.utopia2.mvp.ui.activities.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.socer.utopia2.HideBottomNavListener;

import butterknife.ButterKnife;

/**
 * Created by socer on 17-4-10.
 */

public abstract  class BaseActivity extends AppCompatActivity {



    public abstract int getLayoutId();

    protected abstract void initVariables();

    //先初始化配置，再初始化布局
    protected abstract void initViews();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutId = getLayoutId();
        setContentView(layoutId);
        ButterKnife.bind(this);
        initVariables();
        initViews();
    }
}

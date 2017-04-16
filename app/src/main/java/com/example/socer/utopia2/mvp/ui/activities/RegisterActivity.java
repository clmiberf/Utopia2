package com.example.socer.utopia2.mvp.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;

public class RegisterActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_register;
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
        setContentView(R.layout.activity_register);
    }
}

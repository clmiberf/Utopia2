package com.example.socer.utopia2.mvp.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.R;
import com.example.socer.utopia2.adapters.ViewPagerAdapter;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;
import com.example.socer.utopia2.mvp.ui.fragments.LoginFragment;
import com.example.socer.utopia2.mvp.ui.fragments.RegisteFragment;
import com.example.socer.utopia2.mvp.views.MainView;


import butterknife.BindView;

/**
 * Created by socer on 17-4-10.
 *
 */

public class MainActivity extends BaseActivity implements MainView {

    //private static final int REQUEST_START = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewPager();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {

    }

    public void start(View view) {
        Intent it = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(it);
        finish();
    }
    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void initViewPager() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RegisteFragment(), "注册");
        adapter.addFragment(new LoginFragment(), "登陆");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

package com.example.socer.utopia2.mvp.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

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

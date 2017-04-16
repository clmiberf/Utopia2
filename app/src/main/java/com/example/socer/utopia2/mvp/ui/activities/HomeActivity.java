package com.example.socer.utopia2.mvp.ui.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.adapters.ViewPagerAdapter;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;
import com.example.socer.utopia2.mvp.ui.fragments.DiscoverFragment;
import com.example.socer.utopia2.mvp.ui.fragments.MessageFragment;
import com.example.socer.utopia2.mvp.ui.fragments.PersonFragment;
import com.example.socer.utopia2.mvp.ui.fragments.TaskFragment;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageBottomTabLayout;

public class HomeActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_home;
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
        initBottomNav();
    }

    private void initBottomNav() {
        PageBottomTabLayout tabLayout = (PageBottomTabLayout) findViewById(R.id.tab);
        NavigationController controller = tabLayout.material()
                .addItem(R.drawable.ic_description_black_24dp, "任务")
                .addItem(R.drawable.ic_explore_black_24dp, "发现")
                .addItem(R.drawable.ic_textsms_black_24dp, "消息")
                .addItem(R.drawable.ic_insert_emoticon_black_24dp, "个人")
                .build();
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new TaskFragment(), "任务");
        viewPagerAdapter.addFragment(new DiscoverFragment(), "发现");
        viewPagerAdapter.addFragment(new MessageFragment(), "消息");
        viewPagerAdapter.addFragment(new PersonFragment(), "个人");
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(viewPagerAdapter);
        controller.setupWithViewPager(viewPager);

    }
}

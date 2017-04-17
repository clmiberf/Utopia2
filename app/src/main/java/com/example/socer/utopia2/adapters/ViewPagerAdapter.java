package com.example.socer.utopia2.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.socer.utopia2.HideBottomNavListener;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import me.majiajie.pagerbottomtabstrip.NavigationController;

/**
 * Created by xiang on 2017/4/16.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private NavigationController controller;

    public ViewPagerAdapter(FragmentManager fm, NavigationController controller) {
        super(fm);
        this.controller = controller;
    }
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.controller = null;
    }


    public void addFragment(BaseFragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        if (controller != null) {
            fragmentList.get(position).setOnScrollListener(new HideBottomNavListener(controller));
        }
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}

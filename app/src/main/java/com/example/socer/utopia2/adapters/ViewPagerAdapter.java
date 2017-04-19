package com.example.socer.utopia2.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.socer.utopia2.HideBottomNavListener;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import me.majiajie.pagerbottomtabstrip.NavigationController;

/**
 * Created by xiang on 2017/4/16.
 *
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private HideBottomNavListener onScrollListener;

    public ViewPagerAdapter(FragmentManager fm, NavigationController controller) {
        super(fm);
        this.onScrollListener = new HideBottomNavListener(controller);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdapter(FragmentManager fm, HideBottomNavListener onScrollListener) {
        super(fm);
        this.onScrollListener = onScrollListener;
    }


    public void addFragment(BaseFragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        if (onScrollListener != null) {
            fragmentList.get(position).setOnScrollListener(onScrollListener);
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

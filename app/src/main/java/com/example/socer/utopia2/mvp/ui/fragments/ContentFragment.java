package com.example.socer.utopia2.mvp.ui.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.adapters.DiscoverRecyclerviewAdapter;
import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.presenter.DiscoverHotPresenter;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverHotView;
import com.example.socer.utopia2.shared.SpaceItemDecoration;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends BaseFragment implements DiscoverHotView {


    @BindView(R.id.discover_recyclerview)
    RecyclerView discoverRecyclerview;
    Unbinder unbinder;

    private static String status;
    DiscoverRecyclerviewAdapter adapter = null;
    public ContentFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_content;
    }

    @Override
    protected void initializeInjector() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mFragmentView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, mFragmentView);

        DiscoverHotPresenter hotPresenter = new DiscoverHotPresenter(getActivity(),
                PreferenceManager.getDefaultSharedPreferences(getActivity()));
        hotPresenter.attachView(this);
        hotPresenter.onCreate(savedInstanceState);

        return mFragmentView;
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void initDiscoverHotMsgListView(List<DisccoverMsgModelBean> hotList) {
        if (status == null){
            int distance = 15;      //设置recyclerview之间的距离
            discoverRecyclerview.addItemDecoration(new SpaceItemDecoration(distance));
            status = "true";
        }
        discoverRecyclerview.setHasFixedSize(true);
        discoverRecyclerview.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        adapter = new DiscoverRecyclerviewAdapter(this.getContext(),hotList);
        discoverRecyclerview.setAdapter(adapter);
    }

    @Override
    public void LoadSuccess(List<DisccoverMsgModelBean> data) {

    }

    @Override
    public void loadFailed(String errorMsg) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

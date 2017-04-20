package com.example.socer.utopia2.mvp.ui.fragments.bootomfragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.mvp.ui.activities.MyUserInfoActivity;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;
import com.example.socer.utopia2.mvp.views.bottomviews.PersonView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonFragment extends BaseFragment implements PersonView {


    @BindView(R.id.circleImageView)
    CircleImageView circleImageView;
    @BindView(R.id.user_nickname)
    TextView userNickname;
    @BindView(R.id.sport)
    CardView sport;
    @BindView(R.id.leisure)
    CardView leisure;
    @BindView(R.id.health)
    CardView health;
    @BindView(R.id.efficent)
    CardView efficent;
    @BindView(R.id.flag)
    CardView flag;
    @BindView(R.id.about)
    CardView about;
    @BindView(R.id.settings)
    CardView settings;
    Unbinder unbinder;
    @BindView(R.id.person)
    CardView person;

    public PersonFragment() {
        // Required empty public constructor
    }

    private static PersonFragment fragment;

    public static PersonFragment newInstance() {
        if (fragment == null) {
            fragment = new PersonFragment();
        }
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_person;
    }

    @Override
    protected void initializeInjector() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        unbinder = ButterKnife.bind(this, super.onCreateView(inflater, container, savedInstanceState));
        test();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void initPersonInfo(UserInfoModelBean modelBean) {

    }

    @Override
    public void loadSuccessed(UserInfoModelBean modelBean) {

    }

    @Override
    public void loadFailed(String errorMsg) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    private void test() {
        Glide.with(this).load("http://img.my.csdn.net/uploads/201407/26/1406383291_8239.jpg")
                .into(circleImageView);
    }

    @OnClick({R.id.person, R.id.sport, R.id.leisure, R.id.health, R.id.efficent, R.id.flag, R.id.about, R.id.settings})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.person:
                startActivity(new Intent(getActivity(), MyUserInfoActivity.class));
                break;
            case R.id.sport:
                break;
            case R.id.leisure:
                break;
            case R.id.health:
                break;
            case R.id.efficent:
                break;
            case R.id.flag:
                break;
            case R.id.about:
                break;
            case R.id.settings:
                break;
        }
    }
}

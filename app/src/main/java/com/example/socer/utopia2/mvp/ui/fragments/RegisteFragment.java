package com.example.socer.utopia2.mvp.ui.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.ui.activities.HomeActivity;
import com.example.socer.utopia2.mvp.ui.fragments.base.BaseFragment;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class RegisteFragment extends BaseFragment {


    @BindView(R.id.account)
    EditText account;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.re_password)
    EditText rePassword;
    @BindView(R.id.circleButton_button)
    CircleButton circleButtonButton;
    Unbinder unbinder;

    public RegisteFragment() {
        // Required empty public constructor
    }

    private static RegisteFragment fragment;

    public static RegisteFragment newInstance() {
        if (fragment == null) {
            fragment = new RegisteFragment();
        }
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_registe;
    }

    @Override
    protected void initializeInjector() {

    }

    public void register(){
        Intent it = new Intent(getActivity(), HomeActivity.class);
        startActivity(it);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        unbinder = ButterKnife.bind(this, view);
        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.circleButton_button)
    public void onViewClicked() {
        register();
    }
}

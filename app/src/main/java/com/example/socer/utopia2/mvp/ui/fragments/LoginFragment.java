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

public class LoginFragment extends BaseFragment {

    private static LoginFragment fragment;
    @BindView(R.id.account)
    EditText account;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.circleButton)
    CircleButton circleButton;
    Unbinder unbinder;


    public LoginFragment() {
        // Required empty public constructor
    }

    public static LoginFragment newInstance() {
        if (fragment == null) {
            fragment = new LoginFragment();
        }
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    protected void initializeInjector() {

    }

    public void login(){
        Intent it = new Intent(getActivity(), HomeActivity.class);
        startActivity(it);
        getActivity().finish();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = super.onCreateView(inflater, container, savedInstanceState);


        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.circleButton)
    public void onViewClicked() {
        login();
    }
}

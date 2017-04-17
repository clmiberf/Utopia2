package com.example.socer.utopia2.mvp.ui.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.mvp.model.impls.LoginModelApiImpls;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;
import com.example.socer.utopia2.mvp.views.LoginView;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginView {

    @BindView(R.id.login_back_view)
    ImageView loginBackView;
    @BindView(R.id.login_telephone)
    EditText loginTelephone;
    @BindView(R.id.login_passwd)
    EditText loginPasswd;
    @BindView(R.id.login_btn)
    Button loginBtn;
    @BindView(R.id.login_forget_pswd)
    TextView loginForgetPswd;
    @BindView(R.id.login_tel_register)
    TextView loginTelRegister;
    @BindView(R.id.activity_login)
    LinearLayout activityLogin;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
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

    }

    @Override
    public void loginSuccess(UserInfoModelBean userInfoModelBean) {
        if (userInfoModelBean != null ){
            saveToPreference(userInfoModelBean);
        }
        Intent it = new Intent(LoginActivity.this,HomeActivity.class);
        startActivity(it);
        finish();

    }

    @Override
    public void loginFailed(String msg) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @OnClick({R.id.login_back_view, R.id.login_btn, R.id.login_forget_pswd, R.id.login_tel_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.login_back_view:
                break;
            case R.id.login_btn:
                break;
            case R.id.login_forget_pswd:
                break;
            case R.id.login_tel_register:
                break;
        }
    }

    public void login(){
        LoginModelApiImpls loginModelApiImpls = new LoginModelApiImpls();
        loginModelApiImpls.login(loginTelephone.getText().toString(),
                loginPasswd.getText().toString(),this);
    }

    private void saveToPreference(UserInfoModelBean user){
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
        editor.putString("user_id",user.getUserId());
        editor.putString("user_nickname", user.getUserNickname().toString());
        editor.putString("user_tel",user.getUserTel());
        editor.putString("user_email",user.getUserEmail());
        editor.putString("user_picture",user.getUserportraitUrl());
        editor.putString("user_sex",user.getUserSex());
        editor.putString("user_signature",user.getUserSignatrue());
        editor.putString("user_password",user.getUserPassword());
        editor.putString("user_location",user.getUserLocation());
        editor.apply();

    }
}

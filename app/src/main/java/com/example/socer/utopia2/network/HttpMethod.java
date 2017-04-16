package com.example.socer.utopia2.network;

import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.mvp.views.LoginView;
import com.example.socer.utopia2.network.apis.LoginApi;
import com.example.socer.utopia2.shared.NetManager;
import com.example.socer.utopia2.shared.rxutils.RxJavaCustomTransformer;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.Subscription;

/**
 * Created by socer on 17-4-14.
 */

public class HttpMethod {
    private static HttpMethod instance = null;

    private LoginApi loginApi = null;

    private HttpMethod(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(NetManager.getBaseUrl())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        loginApi = retrofit.create(LoginApi.class);
    }

    public static HttpMethod getInstance(){
        if (instance == null){
            synchronized (HttpMethod.class){
                if (instance == null){
                    instance = new HttpMethod();
                }
            }
        }
        return instance;
    }

    public Subscription login(String username, String password, LoginView view){
//                Subscription subscription =  loginApi.login(username, password)
//                .compose(RxJavaCustomTransformer.<HttpResult<UserInfoModelBean>>defaultSchedulers())
//                .subscribe(new Subscriber<HttpResult<UserInfoModelBean>>() {
//                    @Override
//                    public void onCompleted() {
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                    }
//
//                    @Override
//                    public void onNext(HttpResult<UserInfoModelBean> result) {
//                        view.loginSuccess(result.getData());
//                    }
//                });
//        return subscription;

        view.loginSuccess(null);
        return null;
    }
}

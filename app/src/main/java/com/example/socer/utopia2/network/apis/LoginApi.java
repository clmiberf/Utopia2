package com.example.socer.utopia2.network.apis;

import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.network.HttpResult;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by socer on 17-4-16.
 */

public interface LoginApi {
    @POST("api/user/login")
    @FormUrlEncoded
    Observable<HttpResult<UserInfoModelBean>> login(@Field("username") String username, @Field("password") String password);
}

package com.example.socer.utopia2.network.apis;

import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.network.HttpResult;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by socer on 17-4-17.
 */

public interface PersonInfoApi {
    @GET("person_info")
    Observable<HttpResult<List<UserInfoModelBean>>> getPersonInfo(@Query("userId") String userId);

}

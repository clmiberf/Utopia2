package com.example.socer.utopia2.network.apis;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.network.HttpResult;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by socer on 17-4-17.
 */

public interface DiscoverNewApi {

    @GET("discover_new")
    rx.Observable<HttpResult<List<DisccoverMsgModelBean>>> getDiscoverNewListInfo(@Query("userId") String userId);
}

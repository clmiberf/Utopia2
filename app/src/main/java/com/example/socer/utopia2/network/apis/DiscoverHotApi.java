package com.example.socer.utopia2.network.apis;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.network.HttpResult;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by socer on 17-4-16.
 */

public interface DiscoverHotApi {
    @GET("discover_hot")
    rx.Observable<HttpResult<List<DisccoverMsgModelBean>>> getDiscoverHotListInfo(@Query("userId") String userId);
}

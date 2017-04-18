package com.example.socer.utopia2.network.apis;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverNearView;
import com.example.socer.utopia2.network.HttpResult;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by socer on 17-4-17.
 */

public interface DiscoverNearApi {
    @GET("discover_near")
    Observable<HttpResult<List<DisccoverMsgModelBean>>> getDiscoverNearListInfo(@Query("userId") String userId);
}

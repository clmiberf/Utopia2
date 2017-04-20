package com.example.socer.utopia2.network.apis;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.model.beans.TopicModelBean;
import com.example.socer.utopia2.network.HttpResult;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by socer on 17-4-20.
 */

public interface TopicHomepageApi {
    @GET("topicHomepage")
    rx.Observable<HttpResult<List<TopicModelBean>>> getTopicInfo(@Query("userId") String userId);
}

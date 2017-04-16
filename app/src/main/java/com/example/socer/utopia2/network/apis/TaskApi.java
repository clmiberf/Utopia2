package com.example.socer.utopia2.network.apis;

import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.network.HttpMethod;
import com.example.socer.utopia2.network.HttpResult;

import java.util.List;
import java.util.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by socer on 17-4-16.
 */

public interface TaskApi {
    @GET("tasklist")
    rx.Observable<HttpResult<List<TaskModelBean>>> getTaskListInfo(@Query("userId") String userId);

}

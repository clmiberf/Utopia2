package com.example.socer.utopia2.network.apis;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.network.HttpResult;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by xiang on 2017/4/18.
 */

public interface AddTaskApi {
    @GET("add_task")
    rx.Observable<HttpResult<List<DisccoverMsgModelBean>>> getAddTasksInfo(@Query("userId") String userId);
}

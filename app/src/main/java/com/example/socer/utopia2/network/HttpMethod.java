package com.example.socer.utopia2.network;

import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.model.beans.UserInfoModelBean;
import com.example.socer.utopia2.mvp.model.interfaces.TaskModelApi;
import com.example.socer.utopia2.mvp.views.LoginView;
import com.example.socer.utopia2.mvp.views.TaskView;
import com.example.socer.utopia2.network.apis.LoginApi;
import com.example.socer.utopia2.network.apis.TaskApi;
import com.example.socer.utopia2.shared.NetManager;
import com.example.socer.utopia2.shared.rxutils.RxJavaCustomTransformer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

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
    private TaskApi taskApi = null;

    private HttpMethod(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(NetManager.getBaseUrl())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        loginApi = retrofit.create(LoginApi.class);
        taskApi = retrofit.create(TaskApi.class);
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

    public Subscription loadTaskList(String userId, TaskView view){
        HttpResult<List<TaskModelBean>> result = new HttpResult<>();
        List<TaskModelBean> data = new ArrayList<TaskModelBean>();
        TaskModelBean model = new TaskModelBean();
        List<String> persons = new ArrayList<String>();
        persons.add("平哥");
        persons.add("项三六");
        persons.add("朱重五");
        persons.add("程plus");
        List<String> status = new ArrayList<String>();
        status.add("完成");
        status.add("完成");
        status.add("未完成");
        status.add("未完成");
        List<String> url = new ArrayList<String>();
        url.add("http://img.my.csdn.net/uploads/201407/26/1406383299_1976.jpg");
        url.add("http://img.my.csdn.net/uploads/201407/26/1406383291_6518.jpg");


        model.setTaskName("晚上去刷南湖五圈");
        model.setTaskDate("20:00--21:00");
        model.setTaskPersons(persons);
        model.setTaskdescription("这是一个持之以恒的运动，除了能锻炼身体，更重要的是有综测加,美滋滋");
        model.setTaskStatus(status);
        model.setPictuerUrl("http://img.my.csdn.net/uploads/201407/26/1406383299_1976.jpg");
        model.setTaskPictureUrls(url);

        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);

        result.setData(data);
        view.initTaskListView(result.getData());
        return null;
    }

    public rx.Observable<HttpResult<List<TaskModelBean>>> getTaskListInfo(String userId){
        return taskApi.getTaskListInfo(userId);
    }
}

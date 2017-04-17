package com.example.socer.utopia2.network;

import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.views.DiscoverHotView;
import com.example.socer.utopia2.mvp.views.LoginView;
import com.example.socer.utopia2.mvp.views.bottomviews.TaskView;
import com.example.socer.utopia2.network.apis.DiscoverHotApi;
import com.example.socer.utopia2.network.apis.LoginApi;
import com.example.socer.utopia2.network.apis.TaskApi;
import com.example.socer.utopia2.shared.NetManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscription;

/**
 * Created by socer on 17-4-14.
 */

public class HttpMethod {
    private static HttpMethod instance = null;

    private LoginApi loginApi = null;
    private TaskApi taskApi = null;
    private DiscoverHotApi discoverHotApi = null;

    private HttpMethod(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(NetManager.getBaseUrl())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        loginApi = retrofit.create(LoginApi.class);
        taskApi = retrofit.create(TaskApi.class);
        discoverHotApi = retrofit.create(DiscoverHotApi.class);
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
        HttpResult<List<TaskModelBean>> result = new HttpResult<List<TaskModelBean>>();
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

    public Subscription loadDiscoverHotMsgList(String userId, DiscoverHotView view){
        HttpResult<List<DisccoverMsgModelBean>> result = new HttpResult<List<DisccoverMsgModelBean>>();
        List<DisccoverMsgModelBean> data = new ArrayList<DisccoverMsgModelBean>();

        DisccoverMsgModelBean model = new DisccoverMsgModelBean();
        List<String> comments = new ArrayList<String>();
        comments.add("可以很强势");
        comments.add("二营长,你他娘的把老子的意大利...............妞拿来给这位兄弟玩玩");
        comments.add("我过马路老奶奶都不扶就服你");
        comments.add("大兄弟,你可以劝导广大女性同仁加入男科的队伍中.");
        List<String> imageUrl = new ArrayList<String>();
        imageUrl.add("http://img.my.csdn.net/uploads/201407/26/1406383291_8239.jpg");
        imageUrl.add("http://img.my.csdn.net/uploads/201407/26/1406383290_9329.jpg");



        model.setCommentSum(1000);
        model.setLightenSum(3000);
        model.setTopicTitle("终于轮到我了，我是在妇产科工作的男医生，有什么想问的吗？");
        model.setTopicContent("2011年毕业于南方医科大学临床系，当初觉得身上肩负着拯救广" +
                "大孕妇的责任而不顾家人的再三劝阻选择了南方医科大的妇产科，四年来兢兢业业努力学习，" +
                "准备在妇产科这条路上闯出一条属于男性医生的路。");
        model.setWhichTopic("医学");
        model.setCommentList(comments);
        model.setTopicImageList(imageUrl);

        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);
        data.add(model);

        result.setData(data);
        view.initDiscoverHotMsgListView(data);
        return null;
    }

    public rx.Observable<HttpResult<List<TaskModelBean>>> getTaskListInfo(String userId){
        return taskApi.getTaskListInfo(userId);
    }
    public rx.Observable<HttpResult<List<DisccoverMsgModelBean>>> getDiscoverHotListInfo(String userId){
        return discoverHotApi.getDiscoverHotListInfo(userId);
    }
}

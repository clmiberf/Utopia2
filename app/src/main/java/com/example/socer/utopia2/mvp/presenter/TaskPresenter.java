package com.example.socer.utopia2.mvp.presenter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.TaskModelBean;
import com.example.socer.utopia2.mvp.model.impls.TaskModelApiIpml;
import com.example.socer.utopia2.mvp.presenter.base.BasePresenter;
import com.example.socer.utopia2.mvp.views.bottomviews.TaskView;
import com.example.socer.utopia2.network.HttpResult;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by socer on 17-4-16.
 */

public class TaskPresenter extends BasePresenter<TaskView> {
    private Context mContext = null;
    private SharedPreferences preferences = null;
    private String userId = null;

    @Inject
    TaskPresenter(Context context){this.mContext = context;}

    public TaskPresenter(Context context,SharedPreferences preferences) {
        this.preferences = preferences;
        this.userId = preferences.getString("Uer_Id","");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadTaskListInfo();
    }

    /**
     * 获取历史病害信息
     *
     * @param userId
     */
    public void loadDiseaseHistoryInfo1(String userId) {
        /**
         * Fake data
         */
        Observable.create(new Observable.OnSubscribe<HttpResult<List<TaskModelBean>>>() {
            @Override
            public void call(Subscriber<? super HttpResult<List<TaskModelBean>>> subscriber) {


            }
        }).subscribe(new Subscriber<HttpResult<List<TaskModelBean>>>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                mView.loadFailed(mContext.getResources().getString(R.string.load_data_failed));
            }

            @Override
            public void onNext(HttpResult<List<TaskModelBean>> listHttpResult) {

            }
        });

        /**
         HttpMethod.getInstance().getDiseaseInfo(userId)
         .compose(RxJavaCustomTransformer.defaultSchedulers())
         .subscribe(new Subscriber<HttpResult<List<DiseaseModelBean>>>() {
        @Override public void onCompleted() {
        }

        @Override public void onError(Throwable e) {
        mView.loadFailed(mContext.getResources().getString(R.string.load_data_failed));
        }

        @Override public void onNext(HttpResult<List<DiseaseModelBean>> result) {
        mView.initDiseaseListView(result.getData());
        }
        });
         **/
    }

    private void loadTaskListInfo(){
        TaskModelApiIpml taskModelApiIpml = new TaskModelApiIpml();
        taskModelApiIpml.loadTaskList(userId,mView);
    }

}

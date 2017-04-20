package com.example.socer.utopia2.mvp.model.impls;

import com.example.socer.utopia2.mvp.model.interfaces.TopicHomePageModelApi;
import com.example.socer.utopia2.mvp.views.TopicHomePageView;
import com.example.socer.utopia2.network.HttpMethod;

import rx.Subscription;

/**
 * Created by socer on 17-4-20.
 */

public class TopicHomepageModelApiIpml implements TopicHomePageModelApi {
    @Override
    public Subscription loadTopicInfo(String userId, TopicHomePageView view) {
        return HttpMethod.getInstance().loadTopicInfo(userId,view);
    }
}

package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.TopicHomePageView;

import rx.Subscription;

/**
 * Created by socer on 17-4-20.
 */

public interface TopicHomePageModelApi {

    Subscription loadTopicInfo(String userId, TopicHomePageView view);
}

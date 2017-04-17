package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverNewView;

import rx.Subscription;

/**
 * Created by socer on 17-4-17.
 */

public interface DiscoverNewModelApi {

    Subscription loadDiscoverNewMsgList(String userId, DiscoverNewView view);

}

package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverNearView;

import rx.Subscription;

/**
 * Created by socer on 17-4-17.
 */

public interface DiscoverNearModelApi {

    Subscription loadDiscoverNearList(String userId, DiscoverNearView view);
}

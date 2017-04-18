package com.example.socer.utopia2.mvp.model.impls;

import com.example.socer.utopia2.mvp.model.interfaces.DiscoverNearModelApi;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverNearView;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverNewView;
import com.example.socer.utopia2.network.HttpMethod;

import rx.Subscription;

/**
 * Created by socer on 17-4-17.
 */

public class DiscoverNearModelApiImpl implements DiscoverNearModelApi {
    @Override
    public Subscription loadDiscoverNearList(String userId, DiscoverNearView view) {
        return HttpMethod.getInstance().loadDiscoverNearMsgList(userId,view);
    }
}

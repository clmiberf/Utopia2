package com.example.socer.utopia2.mvp.model.impls;

import com.example.socer.utopia2.mvp.model.interfaces.DiscoverHotModelApi;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverHotView;
import com.example.socer.utopia2.network.HttpMethod;

import rx.Subscription;

/**
 * Created by socer on 17-4-16.
 */

public class DiscoverHotModelApiImpl implements DiscoverHotModelApi {

    @Override
    public Subscription loadDiscoverHotMsgList(String userId, DiscoverHotView view) {
        return HttpMethod.getInstance().loadDiscoverHotMsgList(userId,view);
    }
}

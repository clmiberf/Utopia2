package com.example.socer.utopia2.mvp.model.impls;

import com.example.socer.utopia2.mvp.model.interfaces.DiscoverNewModelApi;
import com.example.socer.utopia2.mvp.views.bottomviews.discoverviews.DiscoverNewView;
import com.example.socer.utopia2.network.HttpMethod;

import rx.Subscription;

/**
 * Created by socer on 17-4-17.
 */

public class DiscoverNewModelApiImp implements DiscoverNewModelApi {
    @Override
    public Subscription loadDiscoverNewMsgList(String userId, DiscoverNewView view) {
        return HttpMethod.getInstance().loadDiscoverNewMsgList(userId,view);
    }
}

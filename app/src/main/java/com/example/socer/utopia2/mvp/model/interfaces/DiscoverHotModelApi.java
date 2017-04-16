package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.DiscoverHotView;

import rx.Subscription;

/**
 * Created by socer on 17-4-16.
 */

public interface DiscoverHotModelApi {
    Subscription loadDiscoverHotMsgList(String userId, DiscoverHotView view);

}

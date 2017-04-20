package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.bottomviews.MessageView;
import com.example.socer.utopia2.mvp.views.bottomviews.msgviews.MessageMsgView;

import rx.Subscription;

/**
 * Created by socer on 17-4-20.
 */

public interface MessageItemModelApi {

    Subscription loadMsgContentItem(String userId, MessageMsgView view);
}

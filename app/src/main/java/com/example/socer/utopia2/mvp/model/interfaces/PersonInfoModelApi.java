package com.example.socer.utopia2.mvp.model.interfaces;

import com.example.socer.utopia2.mvp.views.bottomviews.PersonView;

import rx.Subscription;

/**
 * Created by socer on 17-4-17.
 */

public interface PersonInfoModelApi {

    Subscription loadPersonInfo(String userId, PersonView view);

}

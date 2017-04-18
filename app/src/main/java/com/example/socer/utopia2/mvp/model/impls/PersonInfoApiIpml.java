package com.example.socer.utopia2.mvp.model.impls;

import com.example.socer.utopia2.mvp.model.interfaces.PersonInfoModelApi;
import com.example.socer.utopia2.mvp.views.bottomviews.PersonView;
import com.example.socer.utopia2.network.HttpMethod;

import rx.Subscription;

/**
 * Created by socer on 17-4-17.
 */

public class PersonInfoApiIpml implements PersonInfoModelApi {
    @Override
    public Subscription loadPersonInfo(String userId, PersonView view) {
        return HttpMethod.getInstance().loadPersonInfo(userId,view);
    }
}

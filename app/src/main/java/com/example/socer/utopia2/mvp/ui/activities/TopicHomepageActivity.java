package com.example.socer.utopia2.mvp.ui.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.socer.utopia2.AppBarStateChangeListener;
import com.example.socer.utopia2.R;
import com.example.socer.utopia2.adapters.TopicRecyclerviewAdapter;
import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.model.beans.TopicModelBean;
import com.example.socer.utopia2.mvp.presenter.TopicHomepagePresenter;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;
import com.example.socer.utopia2.mvp.views.TopicHomePageView;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

@SuppressWarnings("ConstantConditions")
public class TopicHomepageActivity extends BaseActivity implements TopicHomePageView {


    TopicRecyclerviewAdapter adapter = null;
    @BindView(R.id.topic_homepage_title)
    TextView topicHomepageTitle;
    @BindView(R.id.topic_homepage_content)
    TextView topicHomepageContent;
    @BindView(R.id.topic_homepage_focusSum)
    TextView topicHomepageFocusSum;
    @BindView(R.id.topic_homepage_commentSum)
    TextView topicHomepageCommentSum;
    @BindView(R.id.topic_add_focus_btn)
    Button topicAddFocusBtn;
    @BindView(R.id.topic_invite_btn)
    Button topicInviteBtn;
    @BindView(R.id.topic_response_btn)
    Button topicResponseBtn;
    @BindView(R.id.toolbar2)
    Toolbar toolbar2;
    @BindView(R.id.toolbar)
    CollapsingToolbarLayout toolbar;
    @BindView(R.id.app_bar)
    AppBarLayout appBar;
    @BindView(R.id.topic_homepage_resultSum)
    TextView topicHomepageResultSum;
    @BindView(R.id.topic_homepage_result_recyclerview)
    RecyclerView topicHomepageResultRecyclerview;
    @BindView(R.id.activity_topic_homepage)
    CoordinatorLayout activityTopicHomepage;
    String toolbarTitle = "";

    @Override
    public int getLayoutId() {
        return R.layout.activity_topic_homepage;
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TopicHomepagePresenter presenter = new TopicHomepagePresenter(this,
                PreferenceManager.getDefaultSharedPreferences(this));
        presenter.attachView(this);
        presenter.onCreate(savedInstanceState);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle(" ");
        toolbar.setExpandedTitleColor(Color.TRANSPARENT);
        appBar.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                if (state == State.COLLAPSED) {
                    toolbar.setTitle(toolbarTitle);
                } else {
                    toolbar.setTitle("");
                }
            }
        });
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }


    @Override
    public void loadSuccessed(List<TopicModelBean> msgList) {

    }

    @Override
    public void loadFailed(String errMsg) {

    }

    @Override
    public void initTopicInfo(TopicModelBean modelBean,List<DisccoverMsgModelBean>  msgModelBeenList ) {
        initTitle(modelBean.getTitle().toString());
        initContent(modelBean.getTopicDescription().toString());
        initFocusSum(modelBean.getFocusSum());
        initCommentSum(modelBean.getCommentSum());
        initCommentSum(modelBean.getResponseSum());
        topicHomepageResultRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        topicHomepageResultRecyclerview.setHasFixedSize(true);
        adapter = new TopicRecyclerviewAdapter(this,msgModelBeenList);
        topicHomepageResultRecyclerview.setAdapter(adapter);

    }

    public void initTitle(String title){
        toolbarTitle = title;
        topicHomepageTitle.setText(title);
    }

    public void initContent(String content){
        topicHomepageContent.setText(content);
    }
//
    public void initFocusSum(int sum){
        String focusSum = sum +"";
        topicHomepageFocusSum.setText(focusSum);
    }

    public void initCommentSum(int sum){
        String commentSum = sum + "";
        topicHomepageCommentSum.setText(commentSum);
    }

    public void initResponseSum(int sum){
        String responseSum = sum+"";
        topicHomepageResultSum.setText(responseSum);
    }

    @OnClick({R.id.topic_add_focus_btn, R.id.topic_invite_btn, R.id.topic_response_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.topic_add_focus_btn:
                break;
            case R.id.topic_invite_btn:
                break;
            case R.id.topic_response_btn:
                break;
        }
    }
}

package com.example.socer.utopia2.mvp.ui.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.socer.utopia2.R;
import com.example.socer.utopia2.mvp.model.beans.DisccoverMsgModelBean;
import com.example.socer.utopia2.mvp.ui.activities.base.BaseActivity;
import com.example.socer.utopia2.mvp.views.bottomviews.DiscoverContentView;

import at.markushi.ui.CircleButton;
import butterknife.BindView;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class DiscoverContentActivity extends BaseActivity implements DiscoverContentView {

    @BindView(R.id.back)
    CircleButton back;
    @BindView(R.id.head_pic)
    CircleImageView headPic;
    @BindView(R.id.user_nickname)
    TextView userNickname;
    @BindView(R.id.user_signature)
    TextView userSignature;
    @BindView(R.id.user_card)
    CardView userCard;
    @BindView(R.id.topic)
    TextView topic;
    @BindView(R.id.topic_content)
    TextView topicContent;
    @BindView(R.id.follow_text)
    TextView followText;
    @BindView(R.id.follow_card)
    CardView followCard;

    @Override
    public int getLayoutId() {
        return R.layout.activity_discover_content;
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
        test();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }


    private void test() {
        DisccoverMsgModelBean bean = (DisccoverMsgModelBean) getIntent().getSerializableExtra("bean");
        topic.setText(bean.getTopicTitle());
        topicContent.setText(bean.getTopicContent());
        userNickname.setText(bean.getPublisher());
        Glide.with(this).load(bean.getPublisherPictrueUrl()).into(headPic);
    }

    @OnClick({R.id.follow_card, R.id.user_card})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.follow_card:
                if (followText.getText().toString().length()>2) {
                    followText.setText("关注");
                    followText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                } else {
                    followText.setText("已关注");
                    followText.setTextColor(Color.parseColor("#b9b9b9"));
                }
                break;
            case R.id.user_card:
                break;
        }
    }
}

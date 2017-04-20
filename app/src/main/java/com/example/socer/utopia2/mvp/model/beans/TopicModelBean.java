package com.example.socer.utopia2.mvp.model.beans;

import java.util.List;

/**
 * Created by socer on 17-4-20.
 */

public class TopicModelBean {

    /**
     * 主题分类
     */
    private List<String>  topicFromList;

    /**
     * 标题
     */

    private String title;

    /**
     * 话题描述
     */

    private String topicDescription;

    /**
     * 话题关注量
     */

    private int focusSum;

    /**
     * 话题评论量
     */

    private int commentSum;


    /**
     * 回答人数
     * @return
     */
    private int responseSum;

    public int getResponseSum() {
        return responseSum;
    }

    public void setResponseSum(int responseSum) {
        this.responseSum = responseSum;
    }

    public List<String> getTopicFromList() {
        return topicFromList;
    }

    public void setTopicFromList(List<String> topicFromList) {
        this.topicFromList = topicFromList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    public int getCommentSum() {
        return commentSum;
    }

    public void setCommentSum(int commentSum) {
        this.commentSum = commentSum;
    }

    public int getFocusSum() {
        return focusSum;
    }

    public void setFocusSum(int focusSum) {
        this.focusSum = focusSum;
    }
}

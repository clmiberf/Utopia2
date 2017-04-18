package com.example.socer.utopia2.mvp.model.beans;

import java.util.List;

/**
 * Created by socer on 17-4-16.
 */

public class DisccoverMsgModelBean {

    /**
     * 发表者昵称
     */
    private String publisher;

    /**
     * 发表者头像地址
     */
    private String publisherPictrueUrl;

    /**
     * 话题分类
     */
    private String whichTopic;


    /**
     * 话题标题
     */
    private String topicTitle;

    /**
     * 话题图片
     */
    private List<String> topicImageList;

    /**
     * 话题内容
     */
    private String topicContent;

    /**
     * 话题评论数
     */
    private int commentSum;

    /**
     * 话题点亮数
     */
    private int lightenSum;

    /**
     *感谢作者
     */
    private List<String> commentList;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisherPictrueUrl() {
        return publisherPictrueUrl;
    }

    public void setPublisherPictrueUrl(String publisherPictrueUrl) {
        this.publisherPictrueUrl = publisherPictrueUrl;
    }

    public String getWhichTopic() {
        return whichTopic;
    }

    public void setWhichTopic(String whichTopic) {
        this.whichTopic = whichTopic;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public List<String> getTopicImageList() {
        return topicImageList;
    }

    public void setTopicImageList(List<String> topicImageList) {
        this.topicImageList = topicImageList;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    public int getCommentSum() {
        return commentSum;
    }

    public void setCommentSum(int commentSum) {
        this.commentSum = commentSum;
    }

    public int getLightenSum() {
        return lightenSum;
    }

    public void setLightenSum(int lightenSum) {
        this.lightenSum = lightenSum;
    }

    public List<String> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<String> commentList) {
        this.commentList = commentList;
    }
}

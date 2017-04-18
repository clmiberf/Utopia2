package com.example.socer.utopia2.mvp.model.beans;

import java.util.List;

/**
 * Created by socer on 17-4-17.
 */

public class ContactModelBean {

    private long contactId;

    /**
     * 联系人头像地址
     */
    private String HeadPortraitUrl;

    /**
     * 联系人昵称
     */
    private String nickName;

    /**
     * 消息条数
     */
    private int msgSum;

    /**
     * 消息内容文字
     */
    private List<String> msgContentList;

    /**
     * 消息内容图片(之后加上)
     */

    public int getMsgSum() {
        return msgSum;
    }

    public void setMsgSum(int msgSum) {
        this.msgSum = msgSum;
    }

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public String getHeadPortraitUrl() {
        return HeadPortraitUrl;
    }

    public void setHeadPortraitUrl(String headPortraitUrl) {
        HeadPortraitUrl = headPortraitUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<String> getMsgContentList() {
        return msgContentList;
    }

    public void setMsgContentList(List<String> msgContentList) {
        this.msgContentList = msgContentList;
    }
}

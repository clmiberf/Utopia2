package com.example.socer.utopia2.mvp.model.beans;

import java.util.List;

/**
 * Created by socer on 17-4-20.
 */

public class MessageModelBean  {

    /**
     * 发消息者昵称
     */

    private String sender;

    /**
     * 发消息者头像
     */

    private String sendPictrueUrl;

    /**
     * 消息内容
     */

    private List<String> msgContentList;

    /**
     * 消息图片(待添加)
     */
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSendPictrueUrl() {
        return sendPictrueUrl;
    }

    public void setSendPictrueUrl(String sendPictrueUrl) {
        this.sendPictrueUrl = sendPictrueUrl;
    }

    public List<String> getMsgContentList() {
        return msgContentList;
    }

    public void setMsgContentList(List<String> msgContentList) {
        this.msgContentList = msgContentList;
    }
}

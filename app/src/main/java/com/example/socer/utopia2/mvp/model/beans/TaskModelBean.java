package com.example.socer.utopia2.mvp.model.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by socer on 17-4-11.
 */

public class TaskModelBean implements Serializable {

    private long id;

    /**
     * 任务名称
     */

    private String taskName;

    /**
     * 任务图片路径
     */
    private String pictuerUrl;


    /**
     * 参与成员
     */
    private List<String> taskPersons;

    /**
     *任务进行时间
     */
    private String taskDate;

    /**
     * 任务描述
     */
    private String taskdescription;

    /**
     * 任务成员完成状态：完成，
     * 整个任务只要有一个人未完成就算未完成
     */
    private List<String>  taskStatus;

    /**
     * 成员上传图片路径
     */
    private List<String>  taskPictureUrls;

    /**
     * 成员聊天记录
     */

    private List<String> chatRecords;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPictuerUrl() {
        return pictuerUrl;
    }

    public void setPictuerUrl(String pictuerUrl) {
        this.pictuerUrl = pictuerUrl;
    }

    public List<String> getTaskPersons() {
        return taskPersons;
    }

    public void setTaskPersons(List<String> taskPersons) {
        this.taskPersons = taskPersons;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }

    public List<String> getTaskPictureUrls() {
        return taskPictureUrls;
    }

    public void setTaskPictureUrls(List<String> taskPictureUrls) {
        this.taskPictureUrls = taskPictureUrls;
    }

    public List<String> getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(List<String> taskStatus) {
        this.taskStatus = taskStatus;
    }

    public List<String> getChatRecords() {
        return chatRecords;
    }

    public void setChatRecords(List<String> chatRecords) {
        this.chatRecords = chatRecords;
    }
}

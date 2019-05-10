package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class NideshopFeedback implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer msgId;

    /**
     * 会员Id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 会员会员名称
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 手机
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * 反馈类型
     *
     * @mbggenerated
     */
    private Boolean feedType;

    /**
     * 状态
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * 反馈时间
     *
     * @mbggenerated
     */
    private Date addTime;

    /**
     * 详细内容
     *
     * @mbggenerated
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getFeedType() {
        return feedType;
    }

    public void setFeedType(Boolean feedType) {
        this.feedType = feedType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", msgId=").append(msgId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", mobile=").append(mobile);
        sb.append(", feedType=").append(feedType);
        sb.append(", status=").append(status);
        sb.append(", addTime=").append(addTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
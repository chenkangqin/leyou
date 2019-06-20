package com.macro.mall.model;

import java.io.Serializable;

public class NideshopSmsLog implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    private Integer userId;

    private String phone;

    private Long logDate;

    private String smsCode;

    private Long sendStatus;

    /**
     * 1成功 0失败
     *
     * @mbggenerated
     */
    private String smsText;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getLogDate() {
        return logDate;
    }

    public void setLogDate(Long logDate) {
        this.logDate = logDate;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public Long getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Long sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", phone=").append(phone);
        sb.append(", logDate=").append(logDate);
        sb.append(", smsCode=").append(smsCode);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", smsText=").append(smsText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
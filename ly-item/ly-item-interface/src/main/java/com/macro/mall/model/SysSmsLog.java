package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class SysSmsLog implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 操作人
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 可选参数。发送时间，填写时已填写的时间发送，不填时为当前时间发送
     *
     * @mbggenerated
     */
    private Date stime;

    /**
     * 必填参数。用户签名
     *
     * @mbggenerated
     */
    private String sign;

    /**
     * 必填参数。固定值 pt
     *
     * @mbggenerated
     */
    private String type;

    /**
     * 可选参数。扩展码，用户定义扩展码，只能为数字
     *
     * @mbggenerated
     */
    private String extno;

    /**
     * 1成功 0失败
     *
     * @mbggenerated
     */
    private Integer sendStatus;

    /**
     * 发送编号
     *
     * @mbggenerated
     */
    private String sendId;

    /**
     * 无效号码数
     *
     * @mbggenerated
     */
    private Integer invalidNum;

    /**
     * 成功提交数
     *
     * @mbggenerated
     */
    private Integer successNum;

    /**
     * 黑名单数
     *
     * @mbggenerated
     */
    private Integer blackNum;

    /**
     * 返回消息
     *
     * @mbggenerated
     */
    private String returnMsg;

    /**
     * 必填参数。发送内容（1-500 个汉字）UTF-8编码
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 必填参数。手机号码。多个以英文逗号隔开
     *
     * @mbggenerated
     */
    private String mobile;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtno() {
        return extno;
    }

    public void setExtno(String extno) {
        this.extno = extno;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public Integer getInvalidNum() {
        return invalidNum;
    }

    public void setInvalidNum(Integer invalidNum) {
        this.invalidNum = invalidNum;
    }

    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public Integer getBlackNum() {
        return blackNum;
    }

    public void setBlackNum(Integer blackNum) {
        this.blackNum = blackNum;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", stime=").append(stime);
        sb.append(", sign=").append(sign);
        sb.append(", type=").append(type);
        sb.append(", extno=").append(extno);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", sendId=").append(sendId);
        sb.append(", invalidNum=").append(invalidNum);
        sb.append(", successNum=").append(successNum);
        sb.append(", blackNum=").append(blackNum);
        sb.append(", returnMsg=").append(returnMsg);
        sb.append(", content=").append(content);
        sb.append(", mobile=").append(mobile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
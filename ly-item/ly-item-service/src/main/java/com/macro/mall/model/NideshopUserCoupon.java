package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class NideshopUserCoupon implements Serializable {
    private Integer id;

    private Byte couponId;

    private String couponNumber;

    private Integer userId;

    private Date usedTime;

    private Date addTime;

    private Integer orderId;

    /**
     * 来源key
     *
     * @mbggenerated
     */
    private String sourceKey;

    /**
     * 发券人
     *
     * @mbggenerated
     */
    private Integer referrer;

    /**
     * 状态 1. 可用 2. 已用 3. 过期
     *
     * @mbggenerated
     */
    private Byte couponStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getCouponId() {
        return couponId;
    }

    public void setCouponId(Byte couponId) {
        this.couponId = couponId;
    }

    public String getCouponNumber() {
        return couponNumber;
    }

    public void setCouponNumber(String couponNumber) {
        this.couponNumber = couponNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getSourceKey() {
        return sourceKey;
    }

    public void setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
    }

    public Integer getReferrer() {
        return referrer;
    }

    public void setReferrer(Integer referrer) {
        this.referrer = referrer;
    }

    public Byte getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Byte couponStatus) {
        this.couponStatus = couponStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponNumber=").append(couponNumber);
        sb.append(", userId=").append(userId);
        sb.append(", usedTime=").append(usedTime);
        sb.append(", addTime=").append(addTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", sourceKey=").append(sourceKey);
        sb.append(", referrer=").append(referrer);
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
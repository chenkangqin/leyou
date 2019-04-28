package com.macro.mall.model;

import java.io.Serializable;

public class TbUserCoupon implements Serializable {
    /**
     * 每张优惠券的编号
     *
     * @mbggenerated
     */
    private Long couponCode;

    /**
     * 优惠卷id（coupon表的id）
     *
     * @mbggenerated
     */
    private Long couponId;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 是否使用，0、未使用  1、已使用  2、已过期
     *
     * @mbggenerated
     */
    private String status;

    private static final long serialVersionUID = 1L;

    public Long getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(Long couponCode) {
        this.couponCode = couponCode;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", couponCode=").append(couponCode);
        sb.append(", couponId=").append(couponId);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
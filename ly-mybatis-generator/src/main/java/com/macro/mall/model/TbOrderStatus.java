package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class TbOrderStatus implements Serializable {
    /**
     * 订单id
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * 状态：1、未付款 2、已付款,未发货 3、已发货,未确认 4、交易成功 5、交易关闭 6、已评价
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 订单创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 付款时间
     *
     * @mbggenerated
     */
    private Date paymentTime;

    /**
     * 发货时间
     *
     * @mbggenerated
     */
    private Date consignTime;

    /**
     * 交易完成时间
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * 交易关闭时间
     *
     * @mbggenerated
     */
    private Date closeTime;

    /**
     * 评价时间
     *
     * @mbggenerated
     */
    private Date commentTime;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", consignTime=").append(consignTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
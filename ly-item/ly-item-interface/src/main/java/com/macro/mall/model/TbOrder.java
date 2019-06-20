package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class TbOrder implements Serializable {
    /**
     * 订单id
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * 总金额，单位为分
     *
     * @mbggenerated
     */
    private Long totalPay;

    /**
     * 实付金额。单位:分。如:20007，表示:200元7分
     *
     * @mbggenerated
     */
    private Long actualPay;

    private String promotionIds;

    /**
     * 支付类型，1、在线支付，2、货到付款
     *
     * @mbggenerated
     */
    private Boolean paymentType;

    /**
     * 邮费。单位:分。如:20007，表示:200元7分
     *
     * @mbggenerated
     */
    private Long postFee;

    /**
     * 订单创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 物流名称
     *
     * @mbggenerated
     */
    private String shippingName;

    /**
     * 物流单号
     *
     * @mbggenerated
     */
    private String shippingCode;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 买家留言
     *
     * @mbggenerated
     */
    private String buyerMessage;

    /**
     * 买家昵称
     *
     * @mbggenerated
     */
    private String buyerNick;

    /**
     * 买家是否已经评价,0未评价，1已评价
     *
     * @mbggenerated
     */
    private Boolean buyerRate;

    /**
     * 收获地址（省）
     *
     * @mbggenerated
     */
    private String receiverState;

    /**
     * 收获地址（市）
     *
     * @mbggenerated
     */
    private String receiverCity;

    /**
     * 收获地址（区/县）
     *
     * @mbggenerated
     */
    private String receiverDistrict;

    /**
     * 收获地址（街道、住址等详细地址）
     *
     * @mbggenerated
     */
    private String receiverAddress;

    /**
     * 收货人手机
     *
     * @mbggenerated
     */
    private String receiverMobile;

    /**
     * 收货人邮编
     *
     * @mbggenerated
     */
    private String receiverZip;

    /**
     * 收货人
     *
     * @mbggenerated
     */
    private String receiver;

    /**
     * 发票类型(0无发票1普通发票，2电子发票，3增值税发票)
     *
     * @mbggenerated
     */
    private Integer invoiceType;

    /**
     * 订单来源：1:app端，2：pc端，3：M端，4：微信端，5：手机qq端
     *
     * @mbggenerated
     */
    private Integer sourceType;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Long totalPay) {
        this.totalPay = totalPay;
    }

    public Long getActualPay() {
        return actualPay;
    }

    public void setActualPay(Long actualPay) {
        this.actualPay = actualPay;
    }

    public String getPromotionIds() {
        return promotionIds;
    }

    public void setPromotionIds(String promotionIds) {
        this.promotionIds = promotionIds;
    }

    public Boolean getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Boolean paymentType) {
        this.paymentType = paymentType;
    }

    public Long getPostFee() {
        return postFee;
    }

    public void setPostFee(Long postFee) {
        this.postFee = postFee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public Boolean getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(Boolean buyerRate) {
        this.buyerRate = buyerRate;
    }

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", totalPay=").append(totalPay);
        sb.append(", actualPay=").append(actualPay);
        sb.append(", promotionIds=").append(promotionIds);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", postFee=").append(postFee);
        sb.append(", createTime=").append(createTime);
        sb.append(", shippingName=").append(shippingName);
        sb.append(", shippingCode=").append(shippingCode);
        sb.append(", userId=").append(userId);
        sb.append(", buyerMessage=").append(buyerMessage);
        sb.append(", buyerNick=").append(buyerNick);
        sb.append(", buyerRate=").append(buyerRate);
        sb.append(", receiverState=").append(receiverState);
        sb.append(", receiverCity=").append(receiverCity);
        sb.append(", receiverDistrict=").append(receiverDistrict);
        sb.append(", receiverAddress=").append(receiverAddress);
        sb.append(", receiverMobile=").append(receiverMobile);
        sb.append(", receiverZip=").append(receiverZip);
        sb.append(", receiver=").append(receiver);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
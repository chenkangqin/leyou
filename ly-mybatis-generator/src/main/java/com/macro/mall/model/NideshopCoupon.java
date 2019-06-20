package com.macro.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class NideshopCoupon implements Serializable {
    private Short id;

    private String name;

    private BigDecimal typeMoney;

    private Byte sendType;

    private BigDecimal minAmount;

    private BigDecimal maxAmount;

    private Date sendStartDate;

    private Date sendEndDate;

    private Date useStartDate;

    private Date useEndDate;

    private BigDecimal minGoodsAmount;

    /**
     * 转发次数
     *
     * @mbggenerated
     */
    private Integer minTransmitNum;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTypeMoney() {
        return typeMoney;
    }

    public void setTypeMoney(BigDecimal typeMoney) {
        this.typeMoney = typeMoney;
    }

    public Byte getSendType() {
        return sendType;
    }

    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Date getSendStartDate() {
        return sendStartDate;
    }

    public void setSendStartDate(Date sendStartDate) {
        this.sendStartDate = sendStartDate;
    }

    public Date getSendEndDate() {
        return sendEndDate;
    }

    public void setSendEndDate(Date sendEndDate) {
        this.sendEndDate = sendEndDate;
    }

    public Date getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(Date useStartDate) {
        this.useStartDate = useStartDate;
    }

    public Date getUseEndDate() {
        return useEndDate;
    }

    public void setUseEndDate(Date useEndDate) {
        this.useEndDate = useEndDate;
    }

    public BigDecimal getMinGoodsAmount() {
        return minGoodsAmount;
    }

    public void setMinGoodsAmount(BigDecimal minGoodsAmount) {
        this.minGoodsAmount = minGoodsAmount;
    }

    public Integer getMinTransmitNum() {
        return minTransmitNum;
    }

    public void setMinTransmitNum(Integer minTransmitNum) {
        this.minTransmitNum = minTransmitNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", typeMoney=").append(typeMoney);
        sb.append(", sendType=").append(sendType);
        sb.append(", minAmount=").append(minAmount);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", sendStartDate=").append(sendStartDate);
        sb.append(", sendEndDate=").append(sendEndDate);
        sb.append(", useStartDate=").append(useStartDate);
        sb.append(", useEndDate=").append(useEndDate);
        sb.append(", minGoodsAmount=").append(minGoodsAmount);
        sb.append(", minTransmitNum=").append(minTransmitNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
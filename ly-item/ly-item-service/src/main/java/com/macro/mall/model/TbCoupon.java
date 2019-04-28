package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class TbCoupon implements Serializable {
    /**
     * 优惠卷id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 优惠卷名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 优惠卷类型,1、抵扣  2、折扣(打折）
     *
     * @mbggenerated
     */
    private String type;

    /**
     * 抵扣或折扣条件，如果没有限制，则设置为0
     *
     * @mbggenerated
     */
    private Long condition;

    /**
     * 优惠金额
     *
     * @mbggenerated
     */
    private Long reduction;

    /**
     * 如果没有折扣，为100。如果是八五折，折扣为85
     *
     * @mbggenerated
     */
    private Integer discount;

    /**
     * 优惠券可以生效的sku的id拼接，以,分割
     *
     * @mbggenerated
     */
    private String targets;

    /**
     * 剩余优惠券数量
     *
     * @mbggenerated
     */
    private Integer stock;

    /**
     * 优惠券生效时间
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * 优惠券失效时间
     *
     * @mbggenerated
     */
    private Date endTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCondition() {
        return condition;
    }

    public void setCondition(Long condition) {
        this.condition = condition;
    }

    public Long getReduction() {
        return reduction;
    }

    public void setReduction(Long reduction) {
        this.reduction = reduction;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", condition=").append(condition);
        sb.append(", reduction=").append(reduction);
        sb.append(", discount=").append(discount);
        sb.append(", targets=").append(targets);
        sb.append(", stock=").append(stock);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
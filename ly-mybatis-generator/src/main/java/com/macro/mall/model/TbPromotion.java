package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class TbPromotion implements Serializable {
    /**
     * 促销活动id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 活动类型，目前可选的有：0没有促销，1满减，2满额送抵扣券，3秒杀
     *
     * @mbggenerated
     */
    private String type;

    /**
     * 促销活动说明
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 满减条件，秒杀的话设置为0
     *
     * @mbggenerated
     */
    private Long condition;

    /**
     * 满减后的折扣金额
     *
     * @mbggenerated
     */
    private Long reduction;

    /**
     * 秒杀价格，如果是秒杀活动，需要填写
     *
     * @mbggenerated
     */
    private Long seckillPrice;

    /**
     * 满额送券，关联的优惠券id
     *
     * @mbggenerated
     */
    private Long couponId;

    /**
     * 作用的目标sku的id拼接，以','拼接
     *
     * @mbggenerated
     */
    private String targets;

    private Date startTime;

    private Date endTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Long getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(Long seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets;
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
        sb.append(", type=").append(type);
        sb.append(", description=").append(description);
        sb.append(", condition=").append(condition);
        sb.append(", reduction=").append(reduction);
        sb.append(", seckillPrice=").append(seckillPrice);
        sb.append(", couponId=").append(couponId);
        sb.append(", targets=").append(targets);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
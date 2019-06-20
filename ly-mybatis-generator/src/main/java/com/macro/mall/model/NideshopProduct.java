package com.macro.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class NideshopProduct implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 商品Id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    /**
     * 商品规格ids
     *
     * @mbggenerated
     */
    private String goodsSpecificationIds;

    /**
     * 商品序列号
     *
     * @mbggenerated
     */
    private String goodsSn;

    /**
     * 商品编码
     *
     * @mbggenerated
     */
    private Integer goodsNumber;

    /**
     * 零售价格
     *
     * @mbggenerated
     */
    private BigDecimal retailPrice;

    /**
     * 价格
     *
     * @mbggenerated
     */
    private BigDecimal marketPrice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSpecificationIds() {
        return goodsSpecificationIds;
    }

    public void setGoodsSpecificationIds(String goodsSpecificationIds) {
        this.goodsSpecificationIds = goodsSpecificationIds;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSpecificationIds=").append(goodsSpecificationIds);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
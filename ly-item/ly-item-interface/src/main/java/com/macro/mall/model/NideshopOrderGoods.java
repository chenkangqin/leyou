package com.macro.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class NideshopOrderGoods implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 订单Id
     *
     * @mbggenerated
     */
    private Integer orderId;

    /**
     * 商品id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    /**
     * 商品名称
     *
     * @mbggenerated
     */
    private String goodsName;

    /**
     * 商品序列号
     *
     * @mbggenerated
     */
    private String goodsSn;

    /**
     * 产品Id
     *
     * @mbggenerated
     */
    private Integer productId;

    /**
     * 商品数量
     *
     * @mbggenerated
     */
    private Short number;

    /**
     * 市场价
     *
     * @mbggenerated
     */
    private BigDecimal marketPrice;

    /**
     * 零售价格
     *
     * @mbggenerated
     */
    private BigDecimal retailPrice;

    /**
     * 虚拟商品
     *
     * @mbggenerated
     */
    private Boolean isReal;

    /**
     * 商品规格Ids
     *
     * @mbggenerated
     */
    private String goodsSpecifitionIds;

    /**
     * 图片链接
     *
     * @mbggenerated
     */
    private String listPicUrl;

    /**
     * 商品规格详情
     *
     * @mbggenerated
     */
    private String goodsSpecifitionNameValue;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Boolean getIsReal() {
        return isReal;
    }

    public void setIsReal(Boolean isReal) {
        this.isReal = isReal;
    }

    public String getGoodsSpecifitionIds() {
        return goodsSpecifitionIds;
    }

    public void setGoodsSpecifitionIds(String goodsSpecifitionIds) {
        this.goodsSpecifitionIds = goodsSpecifitionIds;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public String getGoodsSpecifitionNameValue() {
        return goodsSpecifitionNameValue;
    }

    public void setGoodsSpecifitionNameValue(String goodsSpecifitionNameValue) {
        this.goodsSpecifitionNameValue = goodsSpecifitionNameValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", productId=").append(productId);
        sb.append(", number=").append(number);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append(", isReal=").append(isReal);
        sb.append(", goodsSpecifitionIds=").append(goodsSpecifitionIds);
        sb.append(", listPicUrl=").append(listPicUrl);
        sb.append(", goodsSpecifitionNameValue=").append(goodsSpecifitionNameValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
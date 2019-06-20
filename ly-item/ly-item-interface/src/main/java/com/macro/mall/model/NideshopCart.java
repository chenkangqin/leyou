package com.macro.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class NideshopCart implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 会员Id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * sessionId
     *
     * @mbggenerated
     */
    private String sessionId;

    /**
     * 商品Id
     *
     * @mbggenerated
     */
    private Integer goodsId;

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
     * 产品名称
     *
     * @mbggenerated
     */
    private String goodsName;

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
     * 数量
     *
     * @mbggenerated
     */
    private Short number;

    /**
     * product表对应的goods_specifition_ids
     *
     * @mbggenerated
     */
    private String goodsSpecifitionIds;

    private Boolean checked;

    /**
     * 商品图片
     *
     * @mbggenerated
     */
    private String listPicUrl;

    /**
     * 规格属性组成的字符串，用来显示用
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public String getGoodsSpecifitionIds() {
        return goodsSpecifitionIds;
    }

    public void setGoodsSpecifitionIds(String goodsSpecifitionIds) {
        this.goodsSpecifitionIds = goodsSpecifitionIds;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
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
        sb.append(", userId=").append(userId);
        sb.append(", sessionId=").append(sessionId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", productId=").append(productId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append(", number=").append(number);
        sb.append(", goodsSpecifitionIds=").append(goodsSpecifitionIds);
        sb.append(", checked=").append(checked);
        sb.append(", listPicUrl=").append(listPicUrl);
        sb.append(", goodsSpecifitionNameValue=").append(goodsSpecifitionNameValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
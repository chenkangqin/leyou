package com.macro.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class NideshopBrand implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 品牌名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 图片
     *
     * @mbggenerated
     */
    private String listPicUrl;

    /**
     * 描述
     *
     * @mbggenerated
     */
    private String simpleDesc;

    /**
     * 图片
     *
     * @mbggenerated
     */
    private String picUrl;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Byte sortOrder;

    /**
     * 显示
     *
     * @mbggenerated
     */
    private Boolean isShow;

    private BigDecimal floorPrice;

    /**
     * app显示图片
     *
     * @mbggenerated
     */
    private String appListPicUrl;

    /**
     * 新品牌
     *
     * @mbggenerated
     */
    private Boolean isNew;

    /**
     * 图片
     *
     * @mbggenerated
     */
    private String newPicUrl;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Byte newSortOrder;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public String getSimpleDesc() {
        return simpleDesc;
    }

    public void setSimpleDesc(String simpleDesc) {
        this.simpleDesc = simpleDesc;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(BigDecimal floorPrice) {
        this.floorPrice = floorPrice;
    }

    public String getAppListPicUrl() {
        return appListPicUrl;
    }

    public void setAppListPicUrl(String appListPicUrl) {
        this.appListPicUrl = appListPicUrl;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public String getNewPicUrl() {
        return newPicUrl;
    }

    public void setNewPicUrl(String newPicUrl) {
        this.newPicUrl = newPicUrl;
    }

    public Byte getNewSortOrder() {
        return newSortOrder;
    }

    public void setNewSortOrder(Byte newSortOrder) {
        this.newSortOrder = newSortOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", listPicUrl=").append(listPicUrl);
        sb.append(", simpleDesc=").append(simpleDesc);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", isShow=").append(isShow);
        sb.append(", floorPrice=").append(floorPrice);
        sb.append(", appListPicUrl=").append(appListPicUrl);
        sb.append(", isNew=").append(isNew);
        sb.append(", newPicUrl=").append(newPicUrl);
        sb.append(", newSortOrder=").append(newSortOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.macro.mall.model;

import java.io.Serializable;

public class NideshopKeywords implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 关键字
     *
     * @mbggenerated
     */
    private String keyword;

    /**
     * 热销
     *
     * @mbggenerated
     */
    private Boolean isHot;

    /**
     * 默认
     *
     * @mbggenerated
     */
    private Boolean isDefault;

    /**
     * 显示
     *
     * @mbggenerated
     */
    private Boolean isShow;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer sortOrder;

    /**
     * 关键词的跳转链接
     *
     * @mbggenerated
     */
    private String schemeUrl;

    /**
     * 类型
     *
     * @mbggenerated
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSchemeUrl() {
        return schemeUrl;
    }

    public void setSchemeUrl(String schemeUrl) {
        this.schemeUrl = schemeUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", keyword=").append(keyword);
        sb.append(", isHot=").append(isHot);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", isShow=").append(isShow);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", schemeUrl=").append(schemeUrl);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
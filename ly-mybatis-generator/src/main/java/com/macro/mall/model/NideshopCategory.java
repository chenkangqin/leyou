package com.macro.mall.model;

import java.io.Serializable;

public class NideshopCategory implements Serializable {
    private Integer id;

    private String name;

    private String keywords;

    private String frontDesc;

    private Integer parentId;

    private Boolean sortOrder;

    private Boolean showIndex;

    private Boolean isShow;

    private String bannerUrl;

    private String iconUrl;

    private String imgUrl;

    private String wapBannerUrl;

    private String level;

    private Integer type;

    private String frontName;

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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getFrontDesc() {
        return frontDesc;
    }

    public void setFrontDesc(String frontDesc) {
        this.frontDesc = frontDesc;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getShowIndex() {
        return showIndex;
    }

    public void setShowIndex(Boolean showIndex) {
        this.showIndex = showIndex;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getWapBannerUrl() {
        return wapBannerUrl;
    }

    public void setWapBannerUrl(String wapBannerUrl) {
        this.wapBannerUrl = wapBannerUrl;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFrontName() {
        return frontName;
    }

    public void setFrontName(String frontName) {
        this.frontName = frontName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", keywords=").append(keywords);
        sb.append(", frontDesc=").append(frontDesc);
        sb.append(", parentId=").append(parentId);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", showIndex=").append(showIndex);
        sb.append(", isShow=").append(isShow);
        sb.append(", bannerUrl=").append(bannerUrl);
        sb.append(", iconUrl=").append(iconUrl);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", wapBannerUrl=").append(wapBannerUrl);
        sb.append(", level=").append(level);
        sb.append(", type=").append(type);
        sb.append(", frontName=").append(frontName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
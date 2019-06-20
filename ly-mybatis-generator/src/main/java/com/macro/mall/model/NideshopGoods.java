package com.macro.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class NideshopGoods implements Serializable {
    private Integer id;

    private Integer categoryId;

    private String goodsSn;

    private String name;

    private Integer brandId;

    private Integer goodsNumber;

    private String keywords;

    private String goodsBrief;

    private Boolean isOnSale;

    private Date addTime;

    private Short sortOrder;

    private Boolean isDelete;

    private Integer attributeCategory;

    /**
     * 专柜价格
     *
     * @mbggenerated
     */
    private BigDecimal counterPrice;

    /**
     * 附加价格
     *
     * @mbggenerated
     */
    private BigDecimal extraPrice;

    private Boolean isNew;

    /**
     * 商品单位
     *
     * @mbggenerated
     */
    private String goodsUnit;

    /**
     * 商品主图
     *
     * @mbggenerated
     */
    private String primaryPicUrl;

    /**
     * 商品列表图
     *
     * @mbggenerated
     */
    private String listPicUrl;

    /**
     * 零售价格
     *
     * @mbggenerated
     */
    private BigDecimal retailPrice;

    /**
     * 销售量
     *
     * @mbggenerated
     */
    private Integer sellVolume;

    /**
     * 主sku　product_id
     *
     * @mbggenerated
     */
    private Integer primaryProductId;

    /**
     * 单位价格，单价
     *
     * @mbggenerated
     */
    private BigDecimal unitPrice;

    private String promotionDesc;

    private String promotionTag;

    /**
     * APP专享价
     *
     * @mbggenerated
     */
    private BigDecimal appExclusivePrice;

    /**
     * 是否是APP专属
     *
     * @mbggenerated
     */
    private Boolean isAppExclusive;

    private Boolean isLimited;

    private Boolean isHot;

    private BigDecimal marketPrice;

    /**
     * 创建人ID
     *
     * @mbggenerated
     */
    private Long createUserId;

    /**
     * 修改人ID
     *
     * @mbggenerated
     */
    private Long updateUserId;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    private Long createUserDeptId;

    private String goodsDesc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    public Boolean getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Boolean isOnSale) {
        this.isOnSale = isOnSale;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(Integer attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

    public void setCounterPrice(BigDecimal counterPrice) {
        this.counterPrice = counterPrice;
    }

    public BigDecimal getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(BigDecimal extraPrice) {
        this.extraPrice = extraPrice;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getPrimaryPicUrl() {
        return primaryPicUrl;
    }

    public void setPrimaryPicUrl(String primaryPicUrl) {
        this.primaryPicUrl = primaryPicUrl;
    }

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(Integer sellVolume) {
        this.sellVolume = sellVolume;
    }

    public Integer getPrimaryProductId() {
        return primaryProductId;
    }

    public void setPrimaryProductId(Integer primaryProductId) {
        this.primaryProductId = primaryProductId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPromotionDesc() {
        return promotionDesc;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    public String getPromotionTag() {
        return promotionTag;
    }

    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    public BigDecimal getAppExclusivePrice() {
        return appExclusivePrice;
    }

    public void setAppExclusivePrice(BigDecimal appExclusivePrice) {
        this.appExclusivePrice = appExclusivePrice;
    }

    public Boolean getIsAppExclusive() {
        return isAppExclusive;
    }

    public void setIsAppExclusive(Boolean isAppExclusive) {
        this.isAppExclusive = isAppExclusive;
    }

    public Boolean getIsLimited() {
        return isLimited;
    }

    public void setIsLimited(Boolean isLimited) {
        this.isLimited = isLimited;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUserDeptId() {
        return createUserDeptId;
    }

    public void setCreateUserDeptId(Long createUserDeptId) {
        this.createUserDeptId = createUserDeptId;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", name=").append(name);
        sb.append(", brandId=").append(brandId);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", keywords=").append(keywords);
        sb.append(", goodsBrief=").append(goodsBrief);
        sb.append(", isOnSale=").append(isOnSale);
        sb.append(", addTime=").append(addTime);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", attributeCategory=").append(attributeCategory);
        sb.append(", counterPrice=").append(counterPrice);
        sb.append(", extraPrice=").append(extraPrice);
        sb.append(", isNew=").append(isNew);
        sb.append(", goodsUnit=").append(goodsUnit);
        sb.append(", primaryPicUrl=").append(primaryPicUrl);
        sb.append(", listPicUrl=").append(listPicUrl);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append(", sellVolume=").append(sellVolume);
        sb.append(", primaryProductId=").append(primaryProductId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", promotionDesc=").append(promotionDesc);
        sb.append(", promotionTag=").append(promotionTag);
        sb.append(", appExclusivePrice=").append(appExclusivePrice);
        sb.append(", isAppExclusive=").append(isAppExclusive);
        sb.append(", isLimited=").append(isLimited);
        sb.append(", isHot=").append(isHot);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUserDeptId=").append(createUserDeptId);
        sb.append(", goodsDesc=").append(goodsDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
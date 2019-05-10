package com.macro.mall.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class NideshopTopic implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 活动主题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 化名
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * 活动条例图片
     *
     * @mbggenerated
     */
    private String itemPicUrl;

    /**
     * 子标题
     *
     * @mbggenerated
     */
    private String subtitle;

    /**
     * 活动类别
     *
     * @mbggenerated
     */
    private Integer topicCategoryId;

    /**
     * 活动价格
     *
     * @mbggenerated
     */
    private BigDecimal priceInfo;

    private String readCount;

    /**
     * 场景图片链接
     *
     * @mbggenerated
     */
    private String scenePicUrl;

    /**
     * 活动模板Id
     *
     * @mbggenerated
     */
    private Integer topicTemplateId;

    /**
     * 活动标签Id
     *
     * @mbggenerated
     */
    private Integer topicTagId;

    /**
     * 活动内容
     *
     * @mbggenerated
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getItemPicUrl() {
        return itemPicUrl;
    }

    public void setItemPicUrl(String itemPicUrl) {
        this.itemPicUrl = itemPicUrl;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getTopicCategoryId() {
        return topicCategoryId;
    }

    public void setTopicCategoryId(Integer topicCategoryId) {
        this.topicCategoryId = topicCategoryId;
    }

    public BigDecimal getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(BigDecimal priceInfo) {
        this.priceInfo = priceInfo;
    }

    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount;
    }

    public String getScenePicUrl() {
        return scenePicUrl;
    }

    public void setScenePicUrl(String scenePicUrl) {
        this.scenePicUrl = scenePicUrl;
    }

    public Integer getTopicTemplateId() {
        return topicTemplateId;
    }

    public void setTopicTemplateId(Integer topicTemplateId) {
        this.topicTemplateId = topicTemplateId;
    }

    public Integer getTopicTagId() {
        return topicTagId;
    }

    public void setTopicTagId(Integer topicTagId) {
        this.topicTagId = topicTagId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", avatar=").append(avatar);
        sb.append(", itemPicUrl=").append(itemPicUrl);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", topicCategoryId=").append(topicCategoryId);
        sb.append(", priceInfo=").append(priceInfo);
        sb.append(", readCount=").append(readCount);
        sb.append(", scenePicUrl=").append(scenePicUrl);
        sb.append(", topicTemplateId=").append(topicTemplateId);
        sb.append(", topicTagId=").append(topicTagId);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
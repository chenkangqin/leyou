package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class NideshopAd implements Serializable {
    private Short id;

    private Short adPositionId;

    private Byte mediaType;

    private String name;

    private String link;

    private String content;

    private Date endTime;

    private Byte enabled;

    private String imageUrl;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getAdPositionId() {
        return adPositionId;
    }

    public void setAdPositionId(Short adPositionId) {
        this.adPositionId = adPositionId;
    }

    public Byte getMediaType() {
        return mediaType;
    }

    public void setMediaType(Byte mediaType) {
        this.mediaType = mediaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adPositionId=").append(adPositionId);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", name=").append(name);
        sb.append(", link=").append(link);
        sb.append(", content=").append(content);
        sb.append(", endTime=").append(endTime);
        sb.append(", enabled=").append(enabled);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
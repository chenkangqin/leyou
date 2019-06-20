package com.macro.mall.model;

import java.io.Serializable;

public class NideshopComment implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 类型
     *
     * @mbggenerated
     */
    private Byte typeId;

    private Integer valueId;

    /**
     * 储存为base64编码
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 记录时间
     *
     * @mbggenerated
     */
    private Long addTime;

    /**
     * 状态
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * 会员Id
     *
     * @mbggenerated
     */
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", valueId=").append(valueId);
        sb.append(", content=").append(content);
        sb.append(", addTime=").append(addTime);
        sb.append(", status=").append(status);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
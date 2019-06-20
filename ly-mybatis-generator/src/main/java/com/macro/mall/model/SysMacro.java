package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class SysMacro implements Serializable {
    private Long id;

    /**
     * 父级id
     *
     * @mbggenerated
     */
    private Long parentId;

    /**
     * 名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 值
     *
     * @mbggenerated
     */
    private String value;

    /**
     * 状态，0：隐藏   1：显示
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * 类型,0:目录，1:参数配置
     *
     * @mbggenerated
     */
    private Byte type;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer orderNum;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date gmtCreate;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", remark=").append(remark);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
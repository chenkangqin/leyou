package com.macro.mall.model;

import java.io.Serializable;

public class NideshopAttribute implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 商品类型
     *
     * @mbggenerated
     */
    private Integer attributeCategoryId;

    /**
     * 属性名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 当添加商品时,该属性的添加类别; 0为手功输入;1为选择输入;2为多行文本输入
     *
     * @mbggenerated
     */
    private Boolean inputType;

    private Byte sortOrder;

    /**
     * 即选择输入,则attr_name对应的值的取值就是该这字段值 
     *
     * @mbggenerated
     */
    private String value;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttributeCategoryId() {
        return attributeCategoryId;
    }

    public void setAttributeCategoryId(Integer attributeCategoryId) {
        this.attributeCategoryId = attributeCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getInputType() {
        return inputType;
    }

    public void setInputType(Boolean inputType) {
        this.inputType = inputType;
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", attributeCategoryId=").append(attributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", inputType=").append(inputType);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
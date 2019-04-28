package com.macro.mall.model;

import java.io.Serializable;

public class TbSpecification implements Serializable {
    /**
     * 规格模板所属商品分类id
     *
     * @mbggenerated
     */
    private Long categoryId;

    /**
     * 规格参数模板，json格式
     *
     * @mbggenerated
     */
    private String specifications;

    private static final long serialVersionUID = 1L;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", specifications=").append(specifications);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
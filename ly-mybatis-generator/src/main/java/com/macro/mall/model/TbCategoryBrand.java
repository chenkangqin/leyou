package com.macro.mall.model;

import java.io.Serializable;

public class TbCategoryBrand implements Serializable {
    /**
     * 商品类目id
     *
     * @mbggenerated
     */
    private Long categoryId;

    /**
     * 品牌id
     *
     * @mbggenerated
     */
    private Long brandId;

    private static final long serialVersionUID = 1L;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", brandId=").append(brandId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
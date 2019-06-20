package com.macro.mall.model;

import java.io.Serializable;

public class TbCategory implements Serializable {
    /**
     * 类目id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 类目名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 父类目id,顶级类目填0
     *
     * @mbggenerated
     */
    private Long parentId;

    /**
     * 是否为父节点，0为否，1为是
     *
     * @mbggenerated
     */
    private Boolean isParent;

    /**
     * 排序指数，越小越靠前
     *
     * @mbggenerated
     */
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", isParent=").append(isParent);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
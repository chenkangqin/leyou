package com.macro.mall.model;

import java.io.Serializable;

public class SysMenu implements Serializable {
    private Long menuId;

    /**
     * 父菜单ID，一级菜单为0
     *
     * @mbggenerated
     */
    private Long parentId;

    /**
     * 菜单名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 菜单URL
     *
     * @mbggenerated
     */
    private String url;

    /**
     * 授权(多个用逗号分隔，如：user:list,user:create)
     *
     * @mbggenerated
     */
    private String perms;

    /**
     * 类型   0：目录   1：菜单   2：按钮
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 菜单图标
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer orderNum;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", perms=").append(perms);
        sb.append(", type=").append(type);
        sb.append(", icon=").append(icon);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
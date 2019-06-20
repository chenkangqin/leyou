package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    private Long id;

    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 用户操作
     *
     * @mbggenerated
     */
    private String operation;

    /**
     * 请求方法
     *
     * @mbggenerated
     */
    private String method;

    /**
     * 请求参数
     *
     * @mbggenerated
     */
    private String params;

    /**
     * IP地址
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", operation=").append(operation);
        sb.append(", method=").append(method);
        sb.append(", params=").append(params);
        sb.append(", ip=").append(ip);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
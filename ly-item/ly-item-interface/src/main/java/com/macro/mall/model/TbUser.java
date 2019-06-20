package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class TbUser implements Serializable {
    private Long id;

    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 密码，加密存储
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 注册手机号
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date created;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", created=").append(created);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.macro.mall.model;

import java.io.Serializable;

public class NideshopAddress implements Serializable {
    private Integer id;

    /**
     * 会员ID
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * 收货人姓名
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 手机
     *
     * @mbggenerated
     */
    private String telNumber;

    /**
     * 邮编
     *
     * @mbggenerated
     */
    private String postalCode;

    /**
     * 收货地址国家码
     *
     * @mbggenerated
     */
    private String nationalCode;

    /**
     * 省
     *
     * @mbggenerated
     */
    private String provinceName;

    /**
     * 市
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * 区
     *
     * @mbggenerated
     */
    private String countyName;

    /**
     * 详细收货地址信息
     *
     * @mbggenerated
     */
    private String detailInfo;

    private Integer isDefault;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", telNumber=").append(telNumber);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", nationalCode=").append(nationalCode);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", cityName=").append(cityName);
        sb.append(", countyName=").append(countyName);
        sb.append(", detailInfo=").append(detailInfo);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
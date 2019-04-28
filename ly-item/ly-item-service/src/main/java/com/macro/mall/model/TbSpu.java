package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class TbSpu implements Serializable {
    /**
     * spu id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 标题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 子标题
     *
     * @mbggenerated
     */
    private String subTitle;

    /**
     * 1级类目id
     *
     * @mbggenerated
     */
    private Long cid1;

    /**
     * 2级类目id
     *
     * @mbggenerated
     */
    private Long cid2;

    /**
     * 3级类目id
     *
     * @mbggenerated
     */
    private Long cid3;

    /**
     * 商品所属品牌id
     *
     * @mbggenerated
     */
    private Long brandId;

    /**
     * 是否上架，0下架，1上架
     *
     * @mbggenerated
     */
    private Boolean saleable;

    /**
     * 是否有效，0已删除，1有效
     *
     * @mbggenerated
     */
    private Boolean valid;

    /**
     * 添加时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 最后修改时间
     *
     * @mbggenerated
     */
    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Long getCid1() {
        return cid1;
    }

    public void setCid1(Long cid1) {
        this.cid1 = cid1;
    }

    public Long getCid2() {
        return cid2;
    }

    public void setCid2(Long cid2) {
        this.cid2 = cid2;
    }

    public Long getCid3() {
        return cid3;
    }

    public void setCid3(Long cid3) {
        this.cid3 = cid3;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Boolean getSaleable() {
        return saleable;
    }

    public void setSaleable(Boolean saleable) {
        this.saleable = saleable;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", cid1=").append(cid1);
        sb.append(", cid2=").append(cid2);
        sb.append(", cid3=").append(cid3);
        sb.append(", brandId=").append(brandId);
        sb.append(", saleable=").append(saleable);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
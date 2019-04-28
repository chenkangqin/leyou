package com.macro.mall.model;

import java.io.Serializable;
import java.util.Date;

public class TbSku implements Serializable {
    /**
     * sku id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * spu id
     *
     * @mbggenerated
     */
    private Long spuId;

    /**
     * 商品标题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 商品的图片，多个图片以‘,’分割
     *
     * @mbggenerated
     */
    private String images;

    /**
     * 销售价格，单位为分
     *
     * @mbggenerated
     */
    private Long price;

    /**
     * 特有规格属性在spu属性模板中的对应下标组合
     *
     * @mbggenerated
     */
    private String indexes;

    /**
     * sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序
     *
     * @mbggenerated
     */
    private String ownSpec;

    /**
     * 是否有效，0无效，1有效
     *
     * @mbggenerated
     */
    private Boolean enable;

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

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getIndexes() {
        return indexes;
    }

    public void setIndexes(String indexes) {
        this.indexes = indexes;
    }

    public String getOwnSpec() {
        return ownSpec;
    }

    public void setOwnSpec(String ownSpec) {
        this.ownSpec = ownSpec;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
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
        sb.append(", spuId=").append(spuId);
        sb.append(", title=").append(title);
        sb.append(", images=").append(images);
        sb.append(", price=").append(price);
        sb.append(", indexes=").append(indexes);
        sb.append(", ownSpec=").append(ownSpec);
        sb.append(", enable=").append(enable);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
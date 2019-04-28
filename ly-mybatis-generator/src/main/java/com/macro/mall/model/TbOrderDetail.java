package com.macro.mall.model;

import java.io.Serializable;

public class TbOrderDetail implements Serializable {
    /**
     * 订单详情id 
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 订单id
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * sku商品id
     *
     * @mbggenerated
     */
    private Long skuId;

    /**
     * 购买数量
     *
     * @mbggenerated
     */
    private Integer num;

    /**
     * 商品标题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 商品动态属性键值集
     *
     * @mbggenerated
     */
    private String ownSpec;

    /**
     * 价格,单位：分
     *
     * @mbggenerated
     */
    private Long price;

    /**
     * 商品图片
     *
     * @mbggenerated
     */
    private String image;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwnSpec() {
        return ownSpec;
    }

    public void setOwnSpec(String ownSpec) {
        this.ownSpec = ownSpec;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", skuId=").append(skuId);
        sb.append(", num=").append(num);
        sb.append(", title=").append(title);
        sb.append(", ownSpec=").append(ownSpec);
        sb.append(", price=").append(price);
        sb.append(", image=").append(image);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
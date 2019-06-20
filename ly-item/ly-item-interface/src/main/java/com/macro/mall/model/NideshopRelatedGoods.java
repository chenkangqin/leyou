package com.macro.mall.model;

import java.io.Serializable;

public class NideshopRelatedGoods implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 商品Id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    /**
     * 关联商品id
     *
     * @mbggenerated
     */
    private Integer relatedGoodsId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getRelatedGoodsId() {
        return relatedGoodsId;
    }

    public void setRelatedGoodsId(Integer relatedGoodsId) {
        this.relatedGoodsId = relatedGoodsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", relatedGoodsId=").append(relatedGoodsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.macro.mall.model;

import java.io.Serializable;

public class TbStock implements Serializable {
    /**
     * 库存对应的商品sku id
     *
     * @mbggenerated
     */
    private Long skuId;

    /**
     * 可秒杀库存
     *
     * @mbggenerated
     */
    private Integer seckillStock;

    /**
     * 秒杀总数量
     *
     * @mbggenerated
     */
    private Integer seckillTotal;

    /**
     * 库存数量
     *
     * @mbggenerated
     */
    private Integer stock;

    private static final long serialVersionUID = 1L;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getSeckillStock() {
        return seckillStock;
    }

    public void setSeckillStock(Integer seckillStock) {
        this.seckillStock = seckillStock;
    }

    public Integer getSeckillTotal() {
        return seckillTotal;
    }

    public void setSeckillTotal(Integer seckillTotal) {
        this.seckillTotal = seckillTotal;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skuId=").append(skuId);
        sb.append(", seckillStock=").append(seckillStock);
        sb.append(", seckillTotal=").append(seckillTotal);
        sb.append(", stock=").append(stock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
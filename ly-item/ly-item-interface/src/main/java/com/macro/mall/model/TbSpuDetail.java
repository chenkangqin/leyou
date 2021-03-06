package com.macro.mall.model;

import java.io.Serializable;

public class TbSpuDetail implements Serializable {
    private Long spuId;

    /**
     * 全部规格参数数据
     *
     * @mbggenerated
     */
    private String specifications;

    /**
     * 特有规格参数及可选值信息，json格式
     *
     * @mbggenerated
     */
    private String specTemplate;

    /**
     * 包装清单
     *
     * @mbggenerated
     */
    private String packingList;

    /**
     * 售后服务
     *
     * @mbggenerated
     */
    private String afterService;

    /**
     * 商品描述信息
     *
     * @mbggenerated
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getSpecTemplate() {
        return specTemplate;
    }

    public void setSpecTemplate(String specTemplate) {
        this.specTemplate = specTemplate;
    }

    public String getPackingList() {
        return packingList;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    public String getAfterService() {
        return afterService;
    }

    public void setAfterService(String afterService) {
        this.afterService = afterService;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spuId=").append(spuId);
        sb.append(", specifications=").append(specifications);
        sb.append(", specTemplate=").append(specTemplate);
        sb.append(", packingList=").append(packingList);
        sb.append(", afterService=").append(afterService);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
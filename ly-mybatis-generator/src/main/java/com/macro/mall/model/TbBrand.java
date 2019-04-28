package com.macro.mall.model;

import java.io.Serializable;

public class TbBrand implements Serializable {
    /**
     * 品牌id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 品牌名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 品牌图片地址
     *
     * @mbggenerated
     */
    private String image;

    /**
     * 品牌的首字母
     *
     * @mbggenerated
     */
    private String letter;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", image=").append(image);
        sb.append(", letter=").append(letter);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
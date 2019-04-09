package com.luoye.model;

import java.math.BigDecimal;

public class GoodsSku {
    private Integer id;

    private Integer spuId;

    private BigDecimal price;

    private Integer stock;

    private String images;

    public GoodsSku(Integer id, Integer spuId, BigDecimal price, Integer stock, String images) {
        this.id = id;
        this.spuId = spuId;
        this.price = price;
        this.stock = stock;
        this.images = images;
    }

    public GoodsSku() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
}
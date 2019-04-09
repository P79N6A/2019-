package com.luoye.model;

public class GoodsSkuType {
    private Integer id;

    private Integer skuId;

    private Integer typeId;

    public GoodsSkuType(Integer id, Integer skuId, Integer typeId) {
        this.id = id;
        this.skuId = skuId;
        this.typeId = typeId;
    }

    public GoodsSkuType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
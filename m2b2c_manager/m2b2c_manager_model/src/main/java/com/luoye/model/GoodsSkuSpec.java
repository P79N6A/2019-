package com.luoye.model;

public class GoodsSkuSpec {
    private Integer id;

    private Integer skuId;

    private Integer specParamId;

    private String value;

    public GoodsSkuSpec(Integer id, Integer skuId, Integer specParamId, String value) {
        this.id = id;
        this.skuId = skuId;
        this.specParamId = specParamId;
        this.value = value;
    }

    public GoodsSkuSpec() {
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

    public Integer getSpecParamId() {
        return specParamId;
    }

    public void setSpecParamId(Integer specParamId) {
        this.specParamId = specParamId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}
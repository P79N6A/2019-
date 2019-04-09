package com.luoye.model;

public class GoodsSpecParam {
    private Integer id;

    private Integer categoryId;

    private String name;

    private Boolean numeric;

    private String unit;

    private Boolean searching;

    private String segments;

    private Integer specGroupId;

    public GoodsSpecParam(Integer id, Integer categoryId, String name, Boolean numeric, String unit, Boolean searching, String segments, Integer specGroupId) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.numeric = numeric;
        this.unit = unit;
        this.searching = searching;
        this.segments = segments;
        this.specGroupId = specGroupId;
    }

    public GoodsSpecParam() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getNumeric() {
        return numeric;
    }

    public void setNumeric(Boolean numeric) {
        this.numeric = numeric;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Boolean getSearching() {
        return searching;
    }

    public void setSearching(Boolean searching) {
        this.searching = searching;
    }

    public String getSegments() {
        return segments;
    }

    public void setSegments(String segments) {
        this.segments = segments == null ? null : segments.trim();
    }

    public Integer getSpecGroupId() {
        return specGroupId;
    }

    public void setSpecGroupId(Integer specGroupId) {
        this.specGroupId = specGroupId;
    }
}
package com.luoye.model;

import java.util.Date;

public class GoodsSpu {
    private Integer id;

    private Integer categoryId;

    private Integer brandId;

    private String name;

    private String title;

    private Date createTime;

    private Date updateTime;

    private String description;

    public GoodsSpu(Integer id, Integer categoryId, Integer brandId, String name, String title, Date createTime, Date updateTime, String description) {
        this.id = id;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.name = name;
        this.title = title;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.description = description;
    }

    public GoodsSpu() {
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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
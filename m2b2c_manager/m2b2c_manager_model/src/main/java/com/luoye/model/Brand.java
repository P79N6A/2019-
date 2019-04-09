package com.luoye.model;

import java.util.Date;

public class Brand {
    private Integer id;

    private String title;

    private String logo;

    private String info;

    private Integer categoryId;

    private Date createTime;

    private Date updateTime;


    public Brand(Integer id, String title, String logo, String info, Integer categoryId, Date createTime, Date updateTime) {
        this.id = id;
        this.title = title;
        this.logo = logo;
        this.info = info;
        this.categoryId = categoryId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Brand() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
}
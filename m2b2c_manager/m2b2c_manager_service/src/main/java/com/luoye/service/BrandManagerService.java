package com.luoye.service;

import com.luoye.model.Brand;
import com.luoye.pojo.BrandsTemplate;


public interface BrandManagerService {
    BrandsTemplate findBrandListAll(int pageNumber, int pageSize);
    String  deleteBrandById(int id);
    String addBrand(Brand brand);
    String modifyBrand(Brand brand);
}
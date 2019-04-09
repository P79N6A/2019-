package com.luoye.service.impl;

import com.github.pagehelper.PageInfo;
import com.luoye.mapper.BrandMapper;
import com.luoye.model.Brand;
import com.luoye.model.BrandExample;
import com.luoye.model.User;
import com.luoye.pojo.BrandsTemplate;
import com.luoye.service.BrandManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Service
public class BrandManagerServiceImpl implements BrandManagerService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    @ResponseBody
    public BrandsTemplate findBrandListAll(int pageNumber, int pageSize) {
        com.github.pagehelper.PageHelper.startPage(pageNumber,pageSize);
        BrandExample brandExample = new BrandExample();
        BrandExample.Criteria criteria = brandExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Brand> brands =brandMapper.selectByExample(brandExample);
//        List<BrandTemplateExample> brandTemplateExamples =new ArrayList<>();
//        for (Brand brand :brands){
//            BrandTemplateExample brandTemplateExample =new BrandTemplateExample();
//            brandTemplateExample.setId(brand.getId());
//            brandTemplateExample.setName(brand.getTitle());
//            brandTemplateExample.setCreate_time(brand.getCreateTime());
//            brandTemplateExample.setUpdate_time(brand.getUpdateTime());
//            brandTemplateExamples.add(brandTemplateExample);
//        }
        BrandsTemplate<Brand> brandsTemplate =new BrandsTemplate();
        brandsTemplate.setRows(brands);
        PageInfo<Brand> pageInfo =new PageInfo<>(brands);
        brandsTemplate.setTotal(pageInfo.getTotal());
        return brandsTemplate;
    }

    @Override
    public String deleteBrandById(int id) {
        BrandExample brandExample =new BrandExample();
        BrandExample.Criteria criteria = brandExample.createCriteria();
        criteria.andIdEqualTo(id);
        int data =brandMapper.deleteByExample(brandExample);
        if (data==1){
            return "success";
        }else{
            return "error";
        }
    }

    @Override
    public String addBrand(Brand brand) {

        //简单逻辑，后续权限验证，失败异常未完成
        int insert = brandMapper.insert(brand);
        if (insert==1){
            return "success";
        }else {
            return "fail";
        }

    }

    @Override
    public String modifyBrand(Brand brand) {

        return null;
    }


}

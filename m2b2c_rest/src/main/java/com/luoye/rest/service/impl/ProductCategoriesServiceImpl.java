package com.luoye.rest.service.impl;

import com.luoye.mapper.GoodsCategoryMapper;
import com.luoye.model.GoodsCategory;
import com.luoye.model.GoodsCategoryExample;
import com.luoye.pojo.Res_Categories;
import com.luoye.rest.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductCategoriesServiceImpl implements ProductCategoriesService {

    @Autowired
    GoodsCategoryMapper goodsCategoryMapper;
    @Override
    public Res_Categories getResCategories() {
        Res_Categories res_categories =new Res_Categories();
        GoodsCategoryExample goodsCategoryExample =new GoodsCategoryExample();
        GoodsCategoryExample.Criteria criteria = goodsCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(0);
        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectByExample(goodsCategoryExample);

        List<Res_Categories.CategoriesBean> categories =new ArrayList<>();

        for (int i=0;i<goodsCategories.size();i++){
            Res_Categories.CategoriesBean categoriesBean =new Res_Categories.CategoriesBean();
            GoodsCategory goodsCategory =goodsCategories.get(i);
            categoriesBean.setCat_id(goodsCategory.getId()+"");
            categoriesBean.setName(goodsCategory.getName());

            List<Res_Categories.CategoriesBean.SubCetegoriesBean> subCetegoriesBeanList = getSubCategories(goodsCategory.getId());

            categoriesBean.setSub_cetegories(subCetegoriesBeanList);
            categories.add(categoriesBean);
        }

        res_categories.setCategories(categories);
        return res_categories;
    }

    private List<Res_Categories.CategoriesBean.SubCetegoriesBean> getSubCategories(Integer id) {
        List<Res_Categories.CategoriesBean.SubCetegoriesBean> list =new ArrayList<>();
        GoodsCategoryExample goodsCategoryExample =new GoodsCategoryExample();
        GoodsCategoryExample.Criteria criteria = goodsCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectByExample(goodsCategoryExample);
        for (int i =0; i<goodsCategories.size();i++){
            Res_Categories.CategoriesBean.SubCetegoriesBean subCetegoriesBean =new Res_Categories.CategoriesBean.SubCetegoriesBean();
            GoodsCategory goodsCategory =goodsCategories.get(i);
            subCetegoriesBean.setCat_id(goodsCategory.getId()+"");
            subCetegoriesBean.setName(goodsCategory.getName());

            list.add(subCetegoriesBean);
        }
        return list;
    }
}

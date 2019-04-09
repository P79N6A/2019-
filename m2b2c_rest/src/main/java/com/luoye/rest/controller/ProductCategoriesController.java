package com.luoye.rest.controller;

import com.luoye.pojo.Res_Categories;
import com.luoye.rest.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class ProductCategoriesController {

    @Autowired
    ProductCategoriesService productCategoriesService;

    @RequestMapping("/productCategories/list")
    @ResponseBody
    public Res_Categories getCategories(){
        Res_Categories resCategories = productCategoriesService.getResCategories();
        return resCategories;
    }
}

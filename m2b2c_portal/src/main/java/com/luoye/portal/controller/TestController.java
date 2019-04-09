package com.luoye.portal.controller;

import com.luoye.pojo.Res_Categories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/productCategories/list")
    @ResponseBody
    public Res_Categories getCategories() {
        Res_Categories resCategories = null;
        return resCategories;
    }
}

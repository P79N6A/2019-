package com.luoye.controller;

import com.luoye.model.Brand;
import com.luoye.pojo.BrandsTemplate;
import com.luoye.service.BrandManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 品牌管理控制器
 */
@Controller
public class BrandController {
    @Autowired
    BrandManagerService brandManagerService;
    @RequestMapping("brand_data")
    @ResponseBody
    public BrandsTemplate<Brand> getBradnData(@RequestParam("pageSize") int pageSize, @RequestParam("pageIndex") int pageNumber){
        BrandsTemplate<Brand> brandListAll = brandManagerService.findBrandListAll(pageNumber , pageSize);
        return brandListAll;
    }
    //未测试
    @RequestMapping("brand_delete")
    @ResponseBody
    public Map deleteBrandData( @RequestParam("id")int id){
        Map<String,String> result=new HashMap<>();
        String string=brandManagerService.deleteBrandById(id);
//        model.addAttribute("result",string);
        result.put("result",string);
        return result;
    }
    //未测试
    @RequestMapping("brand_add")
    public Map<String ,String> brandAdd(@RequestBody Brand brand){
          Map<String ,String> result =new HashMap<>();
          String string = brandManagerService.addBrand(brand);
          result.put("add_msg",string);
         return result;
    }
}

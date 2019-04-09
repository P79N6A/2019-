package com.luoye.Test;

/**
 * 测试模板，未测试
 */

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BrandControllerTest {

    @Test
    public void test(){

    }
    @Test
    @RequestMapping("brand_data")
    public String brandData(){
        return null;
    }
}

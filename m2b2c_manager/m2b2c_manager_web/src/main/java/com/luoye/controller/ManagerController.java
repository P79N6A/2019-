package com.luoye.controller;

import com.luoye.model.User;
import com.luoye.pojo.PageDataTemplate;
import com.luoye.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    UserManagerService userManagerService;
    @RequestMapping(value = "/verify_brand",method = RequestMethod.GET)
    @ResponseBody
    public PageDataTemplate<User> verifyBrand(@RequestParam("pageSize") int pageSize,@RequestParam("pageIndex") int pageIndex){
        PageDataTemplate brandListAllForVerify = userManagerService.findBrandListAllForVerify(pageIndex, pageSize);
        return brandListAllForVerify;
    }
}

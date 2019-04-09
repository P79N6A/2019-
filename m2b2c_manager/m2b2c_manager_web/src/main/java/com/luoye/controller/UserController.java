package com.luoye.controller;

import com.luoye.model.Testuser;
import com.luoye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping ("/user/{userid}")
    @ResponseBody
    public Testuser getuserbyid(@PathVariable Integer userid){
        Testuser user=userService.getUserById(userid);
        return user;
    }

}

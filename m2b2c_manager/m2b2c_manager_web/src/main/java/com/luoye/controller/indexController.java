package com.luoye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/{page}")
    public String requestPage(@PathVariable String page){
        return page;
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/welcome")
    public  String welcome(){
        return "welcome" ;
    }
}

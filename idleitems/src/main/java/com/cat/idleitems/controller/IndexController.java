package com.cat.idleitems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created on 2020/1/11
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){

        return "index";
    }


}

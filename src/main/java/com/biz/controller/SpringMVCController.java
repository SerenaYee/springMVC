package com.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author serena
 * @date 2017/12/6
 */

@Controller
public class SpringMVCController {

    @RequestMapping(value = "/printMS")
    public String printHello(ModelMap model) {
        model.addAttribute("message","hello Spring!");
        return "welcome.jsp";
    }
}



package com.sq.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author fanht
 * @Description
 * @Date 2020/7/21 下午3:10
 * @Version 1.0
 */
@RequestMapping("/login")
@Controller
public class LoginController {

    @RequestMapping("/doLogin")
    public String login(String param){
        System.out.println("========");
        return "login";
    }
}

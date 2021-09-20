package com.sq.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author fanht
 * @Description
 * @Date 2020/7/21 下午2:00
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String testMethod(String param){
        return param;
    }
}

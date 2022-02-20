package com.morley.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //包含了 conroller 和requestbody 注解
public class HelloController {

    @RequestMapping("/hello") //映射请求
    public String handle01(){
        return  "hello,Spring boot 2";
    }

}

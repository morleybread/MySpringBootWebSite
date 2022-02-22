package com.morley.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController //包含了 conroller 和requestbody 注解
public class HelloController {

    @RequestMapping("/hello") //映射请求
    public String handle01(){
        return  "hello,Spring boot 2";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)//
    public String saveUser(HttpSession httpSession){
        return "POST-张三";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String sveUser(){
        return "PUT-张三";
    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String aveUser(){
        return "GET-张三";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE) //delete put 需要在html上额外配置  等于@DeleteMapping
    public String deleteUser(){
        return "DELETE-张三";
    }
@RequestMapping("car/{id}/owner/{name}")//获取参数
    public String car(@PathVariable("id")Integer id,
                      @PathVariable("name")String name,
                      @PathVariable Map<Integer,String> pv,
                      @RequestHeader ("User-Agent") String useragent//获取请求头
                       ){


        return  String.valueOf(id)+name;
}

}

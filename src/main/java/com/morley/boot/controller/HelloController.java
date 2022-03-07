package com.morley.boot.controller;

import com.morley.boot.bean.Person;
import com.morley.boot.bean.Theme;
import com.morley.boot.sevice.PersonService;
import com.morley.boot.sevice.ThemeSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController //包含了 conroller 和requestbody 注解
public class HelloController {

    @RequestMapping("/") //映射请求
    public ModelAndView handle00(){
        return new ModelAndView("welcome.html") ;
    }


    @RequestMapping("/hello") //映射请求
    public ModelAndView handle01(){
        return new ModelAndView("def.jpg") ;
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



    @Autowired
    PersonService personService;
    @RequestMapping("/hi")
    public Person[] getpersion(){
        return personService.people();
    }

@Autowired
    ThemeSevice themeSevice;
    @RequestMapping("/getthemepath")
    public Theme[] getthemepath(){
        return themeSevice.themes();
    }


}

package com.morley.boot.config;


import com.morley.boot.bean.Car;
import com.morley.boot.bean.Pet;
import com.morley.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//@ImportResource() //添加xml配置
//@Import({User.class,Pet.class})//给容器添加组件
@Configuration(proxyBeanMethods = true) //这是个配置类 //配置类本身也是组建
//true （默认）都从容器中获取  是代理对象 调用 spingboot会检查 保证单实例 （全模式 full）
//false  不会代理对象也就是不会在容器中存储 应用于组建之间 的 依赖 （轻量级模式 lite）
//@EnableConfigurationProperties(Car.class)//相当于@compent 和@ConfigurationProperties(prefix = "mycar")  但必须在配置类中
public class Myconfig {
  //@ConditionalOnBean("") 如果容器中有“” 以下代码才生效（条件装配）
    @Bean//给容器添加组建  组件id为方法名
    public User usr1(){
        return new User("xiaoming",13);
    }

    @Bean("tom")//设置 自定义Bean id
    public Pet pet1(){
         return new Pet("xiaobai");
    }


}

package com.morley.boot;

import com.morley.boot.bean.Car;
import com.morley.boot.bean.Pet;
import com.morley.boot.bean.User;
import com.morley.boot.sevice.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication  //表示这个类是 主程序类
public class MainAppliction {

    public static void main(String[] args) {
        //返回ioc容器
       ConfigurableApplicationContext run= SpringApplication.run(MainAppliction.class,args);
//     String [] names=run.getBeanDefinitionNames();
//     for(String name :names){
//         System.out.println(name);
//     }

//     Pet tom1=run.getBean("tom",Pet.class);
//     Pet tom2=run.getBean("tom",Pet.class);
//        System.out.println(tom1==tom2);

//        Myconfig bean=run.getBean(User.class);//配置类本身也是组件
//        System.out.println(bean);
//        User user0=bean.usr1();
//        User user1=bean.usr1();
//        System.out.println(user1==user0);


//        String[] beam=run.getBeanNamesForType(User.class);
//        System.out.println("===========================");
//        for(String b:beam) System.out.println(b);
//        Boolean bloo=run.containsBean("user01");
//        System.out.println(bloo);
//        Car car=run.getBean(Car.class);
//        System.out.println(car.getBrand());






    }
}

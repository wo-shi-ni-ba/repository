package com.itheima.controller;

import com.itheima.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class TestController {

    @Value("${country}")
    private String country;
    @Value("${user.name}")
    private String name1;

    @Autowired
    private User user;

/*    @Value(value = "${likes[1]}")
    private String likes;*/

    @Value("${users[1].age}")
    private Integer age1 ;

    @GetMapping
    public String test(){
        System.out.println("springboot is running");
        System.out.println(country);
        System.out.println(name1);
//        System.out.println(likes);
        System.out.println(age1);
        System.out.println(user);
        return "springboot is running";
    }

}




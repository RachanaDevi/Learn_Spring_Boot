package com.springbootexercise.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
         System.out.println("This is home page");
        return "test";
    }

    @RequestMapping("/contact")
    public String contact(){
        System.out.println("This is contact page");
        return "contact";
    }
}

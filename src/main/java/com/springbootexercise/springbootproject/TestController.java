package com.springbootexercise.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

     @RequestMapping("/")
    public String firstHandler(){
         System.out.println("This is home page");
        return "test";
    }
}

package com.springbootexercise.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody //because you want to return the string as it is
public class TestController {

     @RequestMapping("/test")
    public String firstHandler(){
        return "Just for testing!";
    }
}

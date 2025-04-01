package com.worldcompany.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String welcomeMessage(){
        return "Hello! How are you guys?";
    }

}

package com.first.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/")
    public  String sayHello(){
        return  "Hello world Arifur gf Rahman";
    }
    @GetMapping("/home")
    public String hello(){
    return  "welcome to my new web sda pages";
    }


    @GetMapping("/about")
    public String about(){
        return  "welcome to my new web sda pages";
    }
}


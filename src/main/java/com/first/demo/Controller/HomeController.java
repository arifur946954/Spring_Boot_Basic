package com.first.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${coach.name}")
    private  String CoachName;

    @Value("${team.name}")
    private  String TeamName;
    @GetMapping("/teamInfo")
    public String TeamInfo(){
        return "Coach name is: "+CoachName +" "+ "Team name is: "+TeamName;

    }

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


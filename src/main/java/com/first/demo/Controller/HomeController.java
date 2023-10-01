package com.first.demo.Controller;

import com.first.demo.Repository.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private Coach myCoach;
    @Autowired
    public void setCoach(@Qualifier ("football") Coach theCoach){
        System.out.println("hi this is arif"+getClass().getSimpleName());

        myCoach=theCoach;
    }




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
    return  "welcome to my new web sda pages hello";
    }


    @GetMapping("/about")
    public String about(){
        return  "welcome to my new web sda pages";
    }


@GetMapping("/sports")
public String cricket(){
        return myCoach.cricket();

}



}




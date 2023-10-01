package com.first.demo.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Football implements Coach{
    public  Football(){
        System.out.println("hi this is arif"+getClass().getSimpleName());
    }
    @Override
    public String cricket() {
        return "I am a football player";
    }
}

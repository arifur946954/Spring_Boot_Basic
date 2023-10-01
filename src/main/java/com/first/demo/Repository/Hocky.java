package com.first.demo.Repository;

import org.springframework.stereotype.Component;

@Component
public class Hocky implements  Coach{
    public  Hocky(){
        System.out.println( "hi this is arif"+getClass().getSimpleName());
    }
    @Override
    public String cricket() {
        return "I am a Hocky Player";
    }
}

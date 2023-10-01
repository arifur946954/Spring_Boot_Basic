package com.first.demo.Repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import com.first.demo.Repository.Coach;
@Lazy
@Component

public class CricketCoach implements Coach {
    public  CricketCoach(){
        System.out.println("hi this is arif"+getClass().getSimpleName());
    }
    @Override
    public String cricket() {
        return "we are cricket player";
    }


}

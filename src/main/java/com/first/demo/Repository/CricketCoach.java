package com.first.demo.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import com.first.demo.Repository.Coach;

@Component

public class CricketCoach implements Coach {
    @Override
    public String cricket() {
        return "we are cricket player";
    }


}

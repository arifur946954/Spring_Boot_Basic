package com.first.demo.Repository;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String cricket() {
        return "we are cricket player";
    }
    @Override
    public String football() {
        return "we are fotball player";
    }
}

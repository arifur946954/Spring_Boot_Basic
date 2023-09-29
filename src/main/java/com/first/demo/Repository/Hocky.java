package com.first.demo.Repository;

import org.springframework.stereotype.Component;

@Component
public class Hocky implements  Coach{
    @Override
    public String cricket() {
        return "I am a Hocky Player";
    }
}

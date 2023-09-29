package com.first.demo.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Football implements Coach{
    @Override
    public String cricket() {
        return "I am a football player";
    }
}

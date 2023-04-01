package com.example;

import org.springframework.stereotype.Component;

@Component
public class MySubscriber implements Observer {

    @Override
    public void update() {
        // Do something when the event occurs
    }
}
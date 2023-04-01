package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class ConcreteObserver implements Observer {
    @Autowired
    private String name;
    private String state;
    private ConcreteSubject subject;
    @Bean
    public String myString() {
        return "my string";
    }

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void update() {
        String state = subject.getState();
        System.out.println(name + " has received an update with state: " + state);
    }
    public String getState() {
        return state;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}

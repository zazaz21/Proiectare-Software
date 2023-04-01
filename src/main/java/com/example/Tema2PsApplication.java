package com.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Tema2PsApplication {

    /*public static void main(String[] args) {
        SpringApplication.run(Tema2PsApplication.class, args);
    }*/
    @Autowired
    private ConcreteObserver concreteObserver;

    @PostConstruct
    public void init() {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(concreteObserver);

        // Use concreteSubject to trigger events and notify observers
    }


}

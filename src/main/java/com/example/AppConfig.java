package com.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
/*public class Tema2PsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tema2PsApplication.class, args);
    }

}*/
@Configuration
public class AppConfig {

    @Autowired
    private MyPublisher publisher;

    @Autowired
    private MySubscriber subscriber;

    @PostConstruct
    public void init() {
        publisher.registerObserver(subscriber);
    }
}

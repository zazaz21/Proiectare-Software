package com.example;

import org.springframework.stereotype.Component;

import java.util.List;
import java.awt.*;
import java.util.ArrayList;

@Component
public class MyPublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void publishEvent() {
        // Some event occurred
        notifyObservers();
    }
}

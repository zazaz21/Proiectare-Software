package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setState(String new_state) {
        this.state = new_state;
        notifyObservers();
    }

    public String getState() {
        return state;
    }
}
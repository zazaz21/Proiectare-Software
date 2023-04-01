package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverPatternTest {

    @Test
    public void testObserverPattern() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver("Observer1", subject);
        subject.attach(observer);

        // Trigger an event on the subject
        subject.setState("new state");

        // Verify that the observer was notified
        assertEquals("new state", observer.getState());
    }
}

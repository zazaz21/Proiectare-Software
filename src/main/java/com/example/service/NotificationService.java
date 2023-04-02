package com.example.service;

import com.example.entity.Event;
import listener.Listener;

import java.util.*;
/**

 A service class for notifying customers about events.
 */
public class NotificationService {

    /**

     A map that associates each event type with a list of listeners.
     */
    private final Map<Event, List<Listener>> customers;
    /**

     Constructs a new NotificationService with an empty customer map.
     */
    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }
    /**

     Subscribes a listener to receive notifications for the specified event type.
     @param eventType the type of event to subscribe to
     @param listener the listener to subscribe
     */
    public void subscribe(Event eventType, Listener listener) {
        customers.get(eventType).add(listener);
    }
    /**

     Unsubscribes a listener from receiving notifications for the specified event type.
     @param eventType the type of event to unsubscribe from
     @param listener the listener to unsubscribe
     */
    public void unsubscribe(Event eventType, Listener listener) {
        customers.get(eventType).remove(listener);
    }
    /**

     Notifies all listeners subscribed to the specified event type.
     @param eventType the type of event to notify listeners for
     */
    public void notifyCustomers(Event eventType) {
        customers.get(eventType).forEach(listener -> listener.update(eventType));
    }
}




/**

 The Store class represents a store that provides notifications to its customers.
 It uses the NotificationService to send notifications to customers about new item promotions and sale promotions.
 The class also provides a method to get the NotificationService instance used by the store.
 */

package com.example.entity;


import com.example.service.NotificationService;

import static com.example.entity.Event.*;

public class Store {
    /**
     * The NotificationService instance used by the store to send notifications to customers.
     */
    private final NotificationService notificationService;

    /**
     * Constructs a new Store object and initializes its NotificationService.
     */
    public Store() {
        notificationService = new NotificationService();
    }

    /**
     * Notifies customers about a new item promotion.
     */
    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }

    /**
     * Notifies customers about a sale promotion.
     */
    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }

    /**
     * Gets the NotificationService instance used by the store.
     *
     * @return the NotificationService instance used by the store.
     */
    public NotificationService getService() {
        return notificationService;
    }

}
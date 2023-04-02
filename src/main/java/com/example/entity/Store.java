package com.example.entity;


import com.example.service.NotificationService;

import static com.example.entity.Event.*;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }

}
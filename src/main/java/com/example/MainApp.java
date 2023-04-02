package com.example;

import com.example.entity.Store;
import listener.EmailMsgListener;
import listener.MobileAppListener;

import static com.example.entity.Event.*;

public class MainApp {


    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("eliza@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("eliza@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("eliza@subs.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("Eliza"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("eliza@like.com"));
        store.salePromotion();

    }

}
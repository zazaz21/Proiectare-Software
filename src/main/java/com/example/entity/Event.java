package com.example.entity;

/**

 The {@code Event} enum represents the different types of events that can trigger notifications for a store.
 */
public enum Event {

    /**

     Indicates that a new item has been added to the store's inventory.
     */
    NEW_ITEM,
    /**

     Indicates that a sale or promotion is currently available at the store.
     */
    SALE
}
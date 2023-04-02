package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
/**

 The {@code Product} class represents a product in the inventory system.
 It is an entity that is mapped to a database table.
 It includes the product ID, product name, quantity, and price.
 @author [Author]
 @version [Version]
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    /**
     * The product ID.
     */
    @Id
    private int pid;

    /**
     * The product name.
     */
    private String productName;

    /**
     * The quantity of the product.
     */
    private int qty;

    /**
     * The price of the product.
     */
    private int price;
}





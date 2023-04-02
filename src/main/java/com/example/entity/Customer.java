package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
/**

 The Customer class represents a customer entity in the system.

 It contains basic information about a customer such as their name, email and gender.

 It also has a one-to-many relationship with the Product class, where a customer can have multiple products.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    /**

The unique identifier of the customer.
*/
    @Id
    @GeneratedValue
    private int id;
    /**

     The name of the customer.
     */
    private String name;
    /**

     The email address of the customer.
     */
    private String email;
    /**

     The gender of the customer.
     */
    private String gender;
    /**

     A list of products that the customer has purchased.
     */
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> products;
}

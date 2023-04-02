package com.example.dto;
/**

 This class represents the order request DTO which contains the customer information.
 */
import com.example.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    /**
     * The customer object containing customer information for the order.
     */

    private Customer customer;
}

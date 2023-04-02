package com.example.dto;
/**

 OrderResponse represents the response object for a customer order request.
 It contains the price, customer name and product name for the order.
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {
    /**
     * The price of the product in the order
     */
    private int price;
    /**
     * The name of the customer who placed the order
     */
    private String name;
    /**
     * The name of the product in the order
     */
    private String productName;
    /**
     * Creates a new instance of OrderResponse with the specified customer name and product name.
     * @param name The name of the customer who placed the order
     * @param productName The name of the product in the order
     */

    public OrderResponse(String name, String productName) {
        this.name = name;
        this.productName = productName;
        this.price=price;

    }


}

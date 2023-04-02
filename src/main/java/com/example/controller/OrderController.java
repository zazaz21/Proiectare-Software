package com.example.controller;

import com.example.repository.CustomerRepository;
import com.example.repository.ProductRepository;
import com.example.dto.OrderRequest;
import com.example.dto.OrderResponse;
import com.example.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**

 The OrderController class provides RESTful endpoints for placing orders and retrieving order information.
 */
@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    /**
     * Endpoint to place an order
     * @param request the order request
     * @return the Customer entity representing the newly placed order
     */
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
       return customerRepository.save(request.getCustomer());
    }
    /**
     * Endpoint to retrieve all orders
     * @return a list of all Customer entities representing orders
     */
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }
    /**
     * Endpoint to retrieve join information about orders and products
     * @return a list of OrderResponse DTOs containing join information
     */
    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}

package com.application.controller;//package net.javaguides.springboot.controller;

//import net.javaguides.springboot.exception.ResourceNotFoundException;
//import net.javaguides.springboot.model.Employee;
//import net.javaguides.springboot.repository.EmployeeRepository;
import com.application.entity.User;
import com.application.exception.ResourceNotFoundException;
import com.application.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**

 The UserController class is a RESTful controller for handling User entities.**/
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    /**

     Retrieves all users from the database.
     @return a list of User entities
     */
    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    /**

     Creates a new user entity and saves it to the database.
     @param user the User entity to be saved
     @return the saved User entity
     */
    // build create employee REST API
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    /**

     Retrieves a user with a specific ID from the database.
     @param id the ID of the user to be retrieved
     @return a ResponseEntity containing the retrieved User entity, or an error message if the user does not exist
     */
    // build get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable  long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));
        return ResponseEntity.ok(user);
    }
    /**

     Updates an existing user entity in the database.

     @param id the ID of the user to be updated

     @param userDetails the updated User entity

     @return a ResponseEntity containing the updated User entity, or an error message if the user does not exist
     */
    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable long id,@RequestBody User userDetails) {
        User updateUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id));

        updateUser.setFirstName(userDetails.getFirstName());
        updateUser.setLastName(userDetails.getLastName());
        updateUser.setEmailId(userDetails.getEmailId());

        userRepository.save(updateUser);

        return ResponseEntity.ok(updateUser);
    }
    /**

     Deletes a user entity from the database.

     @param id the ID of the user to be deleted

     @return a ResponseEntity with a status of NO_CONTENT
     */
    // build delete user REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id){

       User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id));

        userRepository.delete(user);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}

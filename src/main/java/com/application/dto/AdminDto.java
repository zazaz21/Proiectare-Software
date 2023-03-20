package com.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor //@AllArgsConstructor
public class AdminDto {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    private String repeatPassword;

    public AdminDto(String firstName, String lastName, String username, String password, String repeatPassword) {
        if(firstName.length() < 3 || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name!(3-10 characters)");
        }
        if(lastName.length() < 3 || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name!(3-10 characters)");
        }
        if(password.length() < 5 || password.length() > 15) {
            throw new IllegalArgumentException("Invalid password !(5-15 characters)");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }}


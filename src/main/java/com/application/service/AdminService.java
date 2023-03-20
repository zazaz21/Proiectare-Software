package com.application.service;



import com.application.dto.AdminDto;
import com.application.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}

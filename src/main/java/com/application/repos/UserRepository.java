package com.application.repos;

//import net.javaguides.springboot.model.Employee;
import com.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // all crud database methods
}
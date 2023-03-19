package com.application.repos;

//import net.javaguides.springboot.model.Employee;
import com.application.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}
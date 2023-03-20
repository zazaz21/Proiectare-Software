package com.application;

import com.application.entity.Employee;
import com.application.repos.EmployeeRepository;
//import net.javaguides.springboot.model.Employee;
//import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.application")
@EnableJpaRepositories(value = "com.application")
@EntityScan(value = "com.application.model")

public class CrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Eliza");
		employee.setLastName("Marcu");
		employee.setEmailId("elizamarcu@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Ion");
		employee1.setLastName("Popa");
		employee1.setEmailId("ionpopa@gmail.com");
		employeeRepository.save(employee1);
    }
}
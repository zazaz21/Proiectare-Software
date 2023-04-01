package com.application;

import com.application.entity.User;
import com.application.repos.UserRepository;
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


	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setFirstName("Eliza");
		user.setLastName("Marcu");
		user.setEmailId("elizamarcu@gmail.com");
		userRepository.save(user);

		User user1 = new User();
		user1.setFirstName("Ion");
		user1.setLastName("Popa");
		user1.setEmailId("ionpopa@gmail.com");
		userRepository.save(user1);
	}
}



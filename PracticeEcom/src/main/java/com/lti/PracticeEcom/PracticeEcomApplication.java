package com.lti.PracticeEcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.lti.PracticeEcom.dao.UserRepository;



@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@ComponentScan("com.lti.PracticeEcom")
public class PracticeEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeEcomApplication.class, args);
	}

}

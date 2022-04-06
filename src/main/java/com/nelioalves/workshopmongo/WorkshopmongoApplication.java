package com.nelioalves.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.nelioalves.workshopmongo.repository.UserRepository;



@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class WorkshopmongoApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(WorkshopmongoApplication.class, args);
	}

}

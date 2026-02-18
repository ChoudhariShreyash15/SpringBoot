package com.example.SpringBootMapping;

import com.example.SpringBootMapping.entity.Person;
import com.example.SpringBootMapping.repo.ColonyRepo;
import com.example.SpringBootMapping.repo.PersonRepo;
import com.example.SpringBootMapping.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMappingApplication {

//	@Autowired
//	private PersonService personService;

    public static void main(String[] args) {
		SpringApplication.run(SpringBootMappingApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Person byId = personService.getById(1);
//		System.out.println(byId);
//	}
}

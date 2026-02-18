package com.example.SpringBoot1;

import com.example.SpringBoot1.entity.Bank;
import com.example.SpringBoot1.repository.Bankrepo;
import com.example.SpringBoot1.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot1Application implements CommandLineRunner {

	@Autowired
	private BankService bankService;

    public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Bank id = bankService.getBank(2);
		System.out.println(id);
	}
}

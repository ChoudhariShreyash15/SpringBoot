package com.example.EurekaServer_26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer26Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer26Application.class, args);
	}

}

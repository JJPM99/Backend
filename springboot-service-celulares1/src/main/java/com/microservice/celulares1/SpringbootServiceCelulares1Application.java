package com.microservice.celulares1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootServiceCelulares1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceCelulares1Application.class, args);
	}

}

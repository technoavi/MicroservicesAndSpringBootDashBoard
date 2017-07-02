package com.newt.clientc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ClientCApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientCApplication.class, args);
	}
}

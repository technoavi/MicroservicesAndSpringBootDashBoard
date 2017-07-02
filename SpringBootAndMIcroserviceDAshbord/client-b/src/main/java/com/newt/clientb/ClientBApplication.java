package com.newt.clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ClientBApplication {
	
	@GetMapping("/b")
	public String getMsg(){
		return "B service";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientBApplication.class, args);
	}
}

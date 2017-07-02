package com.newt.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ClientAApplication {
	
	@GetMapping("/a")
	public String getMsg(){
		return "A Service";
	}
	@GetMapping("/aaa")
	public String getMsg1(){
		return "AA Service";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientAApplication.class, args);
	}
}

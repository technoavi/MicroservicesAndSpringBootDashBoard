package com.newt.microservicedashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import be.ordina.msdashboard.EnableMicroservicesDashboardServer;
@EnableMicroservicesDashboardServer
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDashboardApplication.class, args);
	}
}

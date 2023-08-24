package com.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemooneEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemooneEurekaServerApplication.class, args);
	System.out.println("Server Started");
	}
 
}

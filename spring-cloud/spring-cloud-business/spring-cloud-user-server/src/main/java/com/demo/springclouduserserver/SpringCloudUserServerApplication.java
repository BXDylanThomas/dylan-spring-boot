package com.demo.springclouduserserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudUserServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUserServerApplication.class, args);
	}

}

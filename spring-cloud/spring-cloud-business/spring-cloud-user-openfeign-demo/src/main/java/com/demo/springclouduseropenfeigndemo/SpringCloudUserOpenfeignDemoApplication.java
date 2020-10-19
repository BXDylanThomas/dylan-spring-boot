package com.demo.springclouduseropenfeigndemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.demo.springclouduseropenfeigndemo")
@RestController
public class SpringCloudUserOpenfeignDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUserOpenfeignDemoApplication.class, args);
	}


	@Autowired
	private UserFeignClient userFeignClient;
	@GetMapping("query/user")
	public Object queryUser(){
		return userFeignClient.queryUser();
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("query/user2")
	public Object queryUser2(){
		return restTemplate.getForEntity("http://localhost:8705/query/user", Object.class);
	}
}

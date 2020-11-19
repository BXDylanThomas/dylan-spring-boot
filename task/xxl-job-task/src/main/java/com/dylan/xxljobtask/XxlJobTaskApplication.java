package com.dylan.xxljobtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class XxlJobTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(XxlJobTaskApplication.class, args);
	}

}

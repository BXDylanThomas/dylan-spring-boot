package com.demo.springbootrabbitcomsumer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootRabbitComsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitComsumerApplication.class, args);
	}


	@Autowired
	private RabbitTemplate rabbitTemplate;


}

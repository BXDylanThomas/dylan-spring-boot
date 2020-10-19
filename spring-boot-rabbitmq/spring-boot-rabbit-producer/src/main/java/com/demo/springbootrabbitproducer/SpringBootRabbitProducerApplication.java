package com.demo.springbootrabbitproducer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRabbitProducerApplication {

	@Autowired
	RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitProducerApplication.class, args);
	}


	@GetMapping("/send")
	public Object send(){
		rabbitTemplate.convertAndSend("dylan_direct_queue","发送直连队列消息");
		return "发送成功";
	}
}

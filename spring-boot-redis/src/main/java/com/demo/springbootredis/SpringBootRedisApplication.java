package com.demo.springbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRedisApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisApplication.class, args);
	}


	@Autowired
	private RedisTemplate redisTemplate;

	@GetMapping("/save/user")
	public Object saveUser(){
		String user = "{\n" +
				"  \"name\": \"dylan\"\n" +
				"}";

		redisTemplate.opsForValue().set("user",user);
		return "成功";
	}

	@GetMapping("/query/user")
	public Object queryUser(){
		return redisTemplate.opsForValue().get("user");
	}

}

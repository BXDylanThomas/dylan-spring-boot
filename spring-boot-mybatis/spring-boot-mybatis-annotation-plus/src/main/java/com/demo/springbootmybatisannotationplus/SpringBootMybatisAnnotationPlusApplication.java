package com.demo.springbootmybatisannotationplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.springbootmybatisannotationplus.dao")
public class SpringBootMybatisAnnotationPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisAnnotationPlusApplication.class, args);
	}

}

package com.demo.springclouduserserver.controller;

import com.demo.springclouduserserver.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/18 22:34
 */
@RestController
public class UserConroller {

	@GetMapping("/query/user")
	public Object queryUser(){
		return UserEntity.builder().id(1).name("dylan").address("江苏").build();
	}


}

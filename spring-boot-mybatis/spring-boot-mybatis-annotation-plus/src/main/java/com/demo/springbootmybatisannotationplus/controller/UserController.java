package com.demo.springbootmybatisannotationplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.demo.springbootmybatisannotationplus.model.User;
import com.demo.springbootmybatisannotationplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/16 20:26
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * 查询所有的user
	 * @return
	 */
	@GetMapping("query/user")
	public Object queryUser() {
		return userService.list();
	}

	/**
	 * 查询user中，id=1
	 *
	 * @return
	 */
	@GetMapping("query/user2")
	public Object queryUser2() {
		LambdaQueryWrapper<User> eq = Wrappers.<User>lambdaQuery().eq(User::getId, 1);
		return userService.list(eq);
	}
}

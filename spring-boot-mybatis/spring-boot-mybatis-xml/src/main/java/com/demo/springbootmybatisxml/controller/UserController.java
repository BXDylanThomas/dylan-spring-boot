package com.demo.springbootmybatisxml.controller;

import com.demo.springbootmybatisxml.dao.UserMapper;
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
	UserMapper userDao;

	@GetMapping("query/user")
	public Object queryUser() {
		return userDao.queryUser();
	}
}

package com.demo.springbootmybatisannotationplus.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.springbootmybatisannotationplus.dao.UserMapper;
import com.demo.springbootmybatisannotationplus.model.User;
import org.springframework.stereotype.Service;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/17 0:20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

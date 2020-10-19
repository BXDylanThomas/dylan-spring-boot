package com.demo.springbootmybatisannotationplus.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.springbootmybatisannotationplus.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/16 20:28
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}

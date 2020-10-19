package com.demo.springbootmybatisannotation.dao;


import com.demo.springbootmybatisannotation.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/16 20:28
 */
@Repository
public interface UserMapper {

	@Select("select * from user")
	List<User> queryUser();
}
